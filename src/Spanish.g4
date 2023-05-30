grammar Spanish;

// Parser Rules
sentence: (phrase (PUNCTUATION phrase)*)? EOF;

phrase: nounPhrase verbPhrase (prepositionalPhrase)*;

nounPhrase: (ARTICLE | POSSESSIVE_PRONOUN)? (adjectivePhrase)* NOUN;

adjectivePhrase: ADJECTIVE | NUMERAL;

verbPhrase: VERB (adverbPhrase | prepositionalPhrase)*;

adverbPhrase: ADVERB;

prepositionalPhrase: PREPOSITION nounPhrase;

// Lexer Rules
ARTICLE: 'el' | 'la' | 'un' | 'una';
INDEFINITE_ADJECTIVE: 'alguno' | 'cierto' | 'varios' | 'cualquier' | 'otro' | 'cada' | 'todo' | 'ninguno' | 'mucho' | 'poco' | 'suficiente' | 'bastante' | 'demasiado';
CARDINAL_NUMBER:'cero' | 'uno' | 'dos' | 'tres' | 'cuatro' | 'cinco' | 'seis' | 'siete' | 'ocho' | 'nueve' | 'diez' | 'once' | 'doce' | 'trece' | 'catorce' | 'quince' | 'dieciséis' | 'diecisiete' | 'dieciocho' | 'diecinueve' | 'veinte' | 'treinta' | 'cuarenta' | 'cincuenta' | 'sesenta' | 'setenta' | 'ochenta' | 'noventa' | 'cien' | 'mil' | 'millón';
NUMERICAL_ORDINAL:  'primero' | 'segundo' | 'tercero' | 'cuarto' | 'quinto' | 'sexto' | 'séptimo' | 'octavo' | 'noveno' | 'décimo' | 'onceavo' | 'doceavo' | 'treceavo' | 'catorceavo' | 'quinceavo' | 'dieciséisavo' | 'diecisieteavo' | 'dieciochoavo' | 'diecinueveavo' | 'veinteavo' | 'trigésimo' | 'cuadragésimo' | 'quinquagésimo' | 'sexagésimo' | 'septuagésimo' | 'octogésimo' | 'nonagésimo' | 'centésimo' | 'milésimo' | 'millonésimo';
ADJECTIVE: 'grande' | 'pequeño' | 'alto' | 'bajo';
NOUN: 'perro' | 'gato' | 'pájaro' | 'casa';
VERB: 'corre' | 'salta' | 'vuela' | 'es';
PREPOSITION: 'en' | 'sobre' | 'cerca' | 'debajo';
ADVERB: 'rápidamente' | 'lentamente' | 'grácilmente';
POSSESSIVE_PRONOUN: 'mi' | 'tu' | 'su';
NUMERAL: 'uno' | 'dos' | 'tres' | 'cuatro';
PUNCTUATION: '.' | ',' | ';';

WS: [ \t\n\r]+ -> skip;

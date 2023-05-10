grammar Spanish;

// Parser Rules
sentence: (phrase (PUNCTUATION phrase)*)? EOF;

phrase: (nounPhrase | verbPhrase | prepositionalPhrase)+;

nounPhrase: (ARTICLE | POSSESSIVE_PRONOUN)? (ADJECTIVE | NUMERAL)* NOUN;

verbPhrase: VERB (adverbPhrase | prepositionalPhrase)*;

adverbPhrase: ADVERB;

prepositionalPhrase: PREPOSITION nounPhrase;

// Lexer Rules
ARTICLE: 'el' | 'la' | 'un' | 'una';
ADJECTIVE: 'grande' | 'pequeño' | 'alto' | 'bajo';
NOUN: 'perro' | 'gato' | 'pájaro' | 'casa';
VERB: 'corre' | 'salta' | 'vuela';
PREPOSITION: 'en' | 'sobre' | 'cerca' | 'debajo';
ADVERB: 'rápidamente' | 'lentamente' | 'grácilmente';
POSSESSIVE_PRONOUN: 'mi' | 'tu' | 'su';
NUMERAL: 'uno' | 'dos' | 'tres' | 'cuatro';
PUNCTUATION: '.' | ',' | ';';

WS: [ \t\n\r]+ -> skip;

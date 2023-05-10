grammar English;

// Parser Rules
sentence: (phrase (PUNCTUATION phrase)*)? EOF;

phrase: (nounPhrase | verbPhrase | prepositionalPhrase)+;

nounPhrase: (ARTICLE | POSSESSIVE_PRONOUN)? (ADJECTIVE | NUMERAL)* NOUN;

verbPhrase: VERB (ADVERB | prepositionalPhrase)*;

adverbPhrase: ADVERB;

prepositionalPhrase: PREPOSITION nounPhrase;

// Lexer Rules
ARTICLE: 'the' | 'a' | 'an';
ADJECTIVE: 'big' | 'small' | 'tall' | 'short';
NOUN: 'dog' | 'cat' | 'bird' | 'house' | 'street';
VERB: 'run' | 'jump' | 'fly' | 'is';
PREPOSITION: 'in' | 'on' | 'at' | 'over' | 'by';
ADVERB: 'quickly' | 'slowly' | 'gracefully';
POSSESSIVE_PRONOUN: 'my' | 'your' | 'his' | 'her';
NUMERAL: 'one' | 'two' | 'three' | 'four';
PUNCTUATION: '.' | ',' | ';';

WS: [ \t\n\r]+ -> skip;

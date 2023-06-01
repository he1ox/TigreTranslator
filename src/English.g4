grammar English;

// Parser Rules
sentence
    :   (phrase (PUNCTUATION phrase)*)? EOF
    ;

phrase
    :  (nounPhrase | verbPhrase | prepositionalPhrase | conjunctionPhrase | interjectionPhrase)*
    ;

nounPhrase
    :   ( DETERM | ARTICLE | POSSESSIVE_PRONOUN | PRONOUN | NUMERAL)? (ADJETIVE | NUMERAL | VERB)* (ARTICLE)? (PUNCTUATION)? (ADJETIVE)? (ADVERB)? (VERB)? (PREPOSITION)? (prepositionalPhrase)?  NOUN+
    ;
verbPhrase
    :   VERB (ADVERB | prepositionalPhrase )*
    ;

prepositionalPhrase
    :   PREPOSITION nounPhrase
    ;

conjunctionPhrase
    :   CONJUNCTION phrase
    ;

interjectionPhrase
    :   INTERJECTION
    ;

// Lexer Rules
DETERM:'every'|'each';
ARTICLE
    :   'the' | 'a' | 'an'|'some'|'a few'|'to the'|'of the'|'something'|'nothing'|'any'|'no'|'any'
    ;

POSSESSIVE_PRONOUN
    :   'these'|'those'|'that'|'this'|'my' | 'your' | 'his' | 'her' | 'its' | 'our' | 'their'|'mine'|'them'|'him'
    ;

ADJETIVE
    : 'beautiful'|'delicius'|'big' | 'small' | 'tall' | 'short' | 'fat' | 'thin' | 'happy' | 'sad' | 'friendly' | 'mean'
    | 'new' | 'old' | 'red' | 'blue' | 'green' | 'yellow' | 'black' | 'white' | 'purple' | 'orange'
    | 'intelligent' | 'funny' | 'brave' | 'shy' | 'lazy' | 'clean' | 'dirty' | 'hot' | 'cold' | 'wet'
    | 'dry' | 'fast' | 'slow' | 'easy' | 'hard' | 'beautiful' | 'ugly' | 'young' | 'old' | 'rich'
    | 'poor' | 'good' | 'bad' | 'great' | 'terrible' | 'important' | 'interesting' | 'boring' | 'delicious'
    | 'disgusting' | 'expensive' | 'cheap' | 'difficult' | 'easy' | 'strong' | 'weak' | 'happy' | 'sad'
    | 'excited' | 'calm' | 'angry' | 'tired' | 'energetic' | 'kind' | 'cruel' | 'brilliant' | 'stupid'
    | 'honest' | 'dishonest' | 'polite' | 'rude' | 'generous' | 'selfish' | 'patient' | 'impatient'
    | 'proud' | 'ashamed' | 'quiet' | 'noisy' | 'silly' | 'serious' | 'organized' | 'messy' | 'creative'
    | 'ordinary' | 'extraordinary' | 'careful' | 'careless' | 'beautiful' | 'ugly' | 'accurate' | 'inaccurate'
    | 'popular' | 'unpopular' | 'famous' | 'unknown' | 'lovely' | 'awful' | 'wise' | 'foolish' | 'friendly'
    | 'hostile' | 'helpful' | 'useless' | 'vivid' | 'pale' | 'fierce' | 'gentle' | 'sweet' | 'sour' | 'spicy'
    | 'bitter' | 'fresh' | 'stale' | 'modern' | 'ancient' | 'normal' | 'abnormal' | 'successful' | 'unsuccessful'
    | 'real' | 'fake' | 'open' | 'closed' | 'free' | 'expensive' | 'young' | 'old' | 'rich' | 'poor' | 'good'
    | 'bad' | 'great' | 'terrible' | 'important' | 'interesting' | 'boring' | 'delicious' | 'disgusting'
    | 'difficult' | 'easy' | 'strong' | 'weak' | 'happy' | 'sad' | 'excited' | 'calm' | 'angry' | 'tired'
    | 'energetic' | 'kind' | 'cruel' | 'brilliant' | 'stupid' | 'honest' | 'dishonest'
    ;

NUMERAL
:   'one' | 'two' | 'three' | 'four' | 'five' | 'six' | 'seven' | 'eight' | 'nine' | 'ten'
| 'eleven' | 'twelve' | 'thirteen' | 'fourteen' | 'fifteen' | 'sixteen' | 'seventeen' | 'eighteen' | 'nineteen'
| 'twenty' | 'thirty' | 'forty' | 'fifty' | 'sixty' | 'seventy' | 'eighty' | 'ninety' | 'hundred' | 'thousand'
;

NOUN
    : 'car'|'food'|'soccer'|'time' | 'year' | 'people' | 'way' | 'day' | 'man' | 'government' | 'life' | 'part' | 'child'
    | 'world' | 'school' | 'state' | 'family' | 'student' | 'group' | 'country' | 'problem' | 'hand' | 'place'
    | 'case' | 'week' | 'company' | 'system' | 'program' | 'question' | 'work' | 'government' | 'number' | 'night'
    | 'point' | 'home' | 'water' | 'room' | 'mother' | 'area' | 'money' | 'story' | 'fact' | 'month'
    | 'lot' | 'right' | 'study' | 'book' | 'eye' | 'job' | 'word' | 'business' | 'issue' | 'side'
    | 'kind' | 'head' | 'house' | 'service' | 'friend' | 'father' | 'power' | 'hour' | 'game' | 'line'
    | 'end' | 'member' | 'law' | 'car' | 'city' | 'community' | 'name' | 'president' | 'team' | 'minute'
    | 'idea' | 'kid' | 'body' | 'information' | 'back' | 'parent' | 'face' | 'others' | 'level' | 'office'
    | 'door' | 'health' | 'person' | 'art' | 'war' | 'history' | 'party' | 'result' | 'change' | 'morning'
    | 'reason' | 'research' | 'girl' | 'guy' | 'moment' | 'air' | 'teacher' | 'force' | 'education' | 'policy'
    | 'city' | 'side' | 'home' | 'hour' | 'body' | 'year' | 'job' | 'music' | 'place' | 'water'
    | 'room' | 'area' | 'money' | 'story' | 'fact' | 'lot' | 'question' | 'week' | 'company' | 'system'
    | 'program' | 'information' | 'government' | 'issue' | 'hand' | 'part' | 'kind' | 'child' | 'problem'
    | 'example' | 'fact' | 'development' | 'group' | 'member' | 'number' | 'man' | 'woman' | 'people' | 'girl'
    | 'boy' | 'dog' | 'cat' | 'house' | 'car' | 'tree' | 'flower' | 'bird' | 'fish' | 'park'
    | 'apple' | 'banana' | 'orange' | 'grape' | 'strawberry'
    ;

PRONOUN
    :   'I' | 'you' | 'he' | 'she' | 'it' | 'we' | 'they'
    ;


VERB
:   'to be' |'could'|'should'|'must'|'needs'|'need'|'wants'|'want'|'has'|'have'|'play'|'were'|'was'|'am'|'are'|'is'|'ran'|'eat'
| 'run' | 'jump' | 'play' | 'sleep' | 'work' | 'read' | 'write' | 'talk' | 'walk'
| 'think' | 'feel' | 'see' | 'hear' | 'smell' | 'taste' | 'run' | 'walk' | 'drive' | 'fly' | 'swim'
| 'jump' | 'laugh' | 'cry' | 'scream' | 'shout' | 'whisper' | 'talk' | 'think' | 'feel' | 'see' | 'hear' | 'smell' | 'taste'
| 'arrive' | 'assist' | 'attempt' | 'avoid' | 'begin' | 'blame' | 'borrow' | 'break' | 'build' | 'call' | 'carry'
| 'change' | 'choose' | 'come' | 'continue' | 'cook' | 'correct' | 'create' | 'decide' | 'describe' | 'deserve'
| 'destroy' | 'develop' | 'discover' | 'do' | 'draw' | 'drop' | 'eat' | 'explain' | 'fail' | 'feel'
| 'find' | 'finish' | 'forget' | 'forgive' | 'go' | 'grow' | 'help' | 'hide' | 'imagine' | 'include'
| 'inform' | 'interest' | 'join' | 'keep' | 'know' | 'leave' | 'learn' | 'like' | 'listen' | 'lose'
| 'make' | 'manage' | 'mean' | 'meet' | 'miss' | 'move' | 'need' | 'notice' | 'open' | 'order'
| 'own' | 'pass' | 'pay' | 'plan' | 'play' | 'point' | 'prepare' | 'provide' | 'reach' | 'receive'
| 'refuse' | 'remember' | 'repeat' | 'report' | 'request' | 'rest' | 'return' | 'save' | 'say' | 'see'
| 'sell' | 'send' | 'set' | 'show' | 'sign' | 'sleep' | 'smile' | 'spend' | 'start' | 'stay'
| 'stop' | 'take' | 'talk' | 'taste' | 'think' | 'teach' | 'tell' | 'think' | 'try' | 'turn'
| 'understand' | 'use' | 'visit' | 'wait' | 'walk' | 'want' | 'watch' | 'work' | 'write'
;
ADVERB
:   'quickly' | 'slowly' | 'carefully' | 'happily' | 'sadly' | 'often' | 'never' | 'always'
| 'sometimes' | 'yesterday' | 'today' | 'tomorrow' | 'now' | 'then'| 'nearly' | 'exactly' | 'precisely'
| 'completely' | 'partially' | 'frequently' | 'rarely' | 'occasionally'| 'annually' | 'daily' | 'weekly' | 'monthly' | 'yearly';
PREPOSITION
    :   'in' | 'on' | 'at' | 'to' | 'from' | 'with' | 'without' | 'near' | 'far' | 'above'
    | 'below' | 'inside' | 'outside'
    ;
CONJUNCTION

    :   'and' | 'or' | 'but'|'yet'|'so'|'for'|'because'|'if'|'unless'
    ;


INTERJECTION
    :   'wow' | 'uh-oh' | 'hello' | 'goodbye' | 'yay' | 'boo' | 'ouch' | 'hmm'
    ;

PUNCTUATION
    :  ','|'?'|'.'|'!'|';'|':';

// Regla para ignorar los espacios en blanco
WS : [ \t\r\n]+ -> skip;

grammar English;

// Parser Rules
sentence: (phrase (PUNCTUATION phrase)*)? EOF;

phrase: (nounPhrase | verbPhrase | prepositionalPhrase)+;

nounPhrase: (ARTICLE | POSSESSIVE_PRONOUN)? (ADJECTIVE | NUMERAL)* NOUN;

verbPhrase: VERB (ADVERB | prepositionalPhrase)*;

adverbPhrase: ADVERB;

prepositionalPhrase: PREPOSITION nounPhrase;

// Lexer Rules
//SUSTANTIVOS
NOUN: 'dog' | 'cat' | 'chair' | 'table' | 'book' | 'phone' | 'computer' | 'car' | 'bicycle' | 'plane' | 'train' | 'bus' | 'cup' | 'plate' | 'fork' | 'spoon' | 'knife' | 'television' | 'movie' | 'music' | 'art' | 'science' |
'math' | 'history' | 'geography' | 'language' | 'food' | 'water' | 'air' | 'earth' | 'sun' | 'moon' | 'star' | 'planet' | 'universe' | 'galaxy' | 'ocean' | 'river' | 'mountain' | 'forest' | 'park' | 'beach' | 'city' |
'town' | 'village' | 'country' | 'world' | 'globe' | 'map' | 'compass' | 'camera' | 'photo' | 'video' | 'game' | 'sport' | 'ball' | 'bat' | 'glove' | 'shoe' | 'hat' | 'jacket' | 'shirt' | 'pants' | 'dress' | 'skirt' |
 'sock' | 'boot' | 'sandal' | 'sneaker' | 'glasses' | 'sunglasses' | 'cap' | 'scarf' | 'gloves' | 'bag' | 'wallet' | 'key' | 'lock' | 'door' | 'window' | 'wall' | 'roof' | 'floor' | 'stairs' | 'elevator' | 'bridge' | 'road' |
 'highway' | 'street' | 'avenue' | 'building' | 'house' | 'apartment' | 'hotel' | 'hospital' | 'school' | 'university' | 'office' | 'factory' | 'store' | 'restaurant' | 'bar' | 'pub' | 'club' | 'church' | 'temple' | 'mosque' |
 'synagogue' | 'library' | 'museum' | 'zoo' | 'aquarium' | 'park' | 'garden' | 'farm' | 'ranch' | 'jungle' | 'desert' | 'island' | 'lake' | 'pond' | 'stream' | 'waterfall' | 'cave' | 'canyon' | 'hill' | 'valley' | 'plateau' |
 'glacier' | 'volcano' | 'bay' | 'harbor' | 'port' | 'airport' | 'station' | 'stop' | 'terminal' | 'ticket' | 'passport' | 'visa' | 'money' | 'credit card' | 'bank' | 'ATM' | 'post office' | 'mail' | 'letter' | 'envelope' | 'stamp'
 | 'phone' | 'fax' | 'email' | 'website' | 'internet' | 'social media' | 'news' | 'magazine' | 'newspaper' | 'journal' | 'diary' | 'calendar' | 'clock' | 'watch' | 'alarm' | 'weather' | 'temperature'|'climate' | 'sun' | 'moon' |
 'star' | 'planet' | 'comet' | 'asteroid' | 'meteor' | 'eclipse' | 'aurora' | 'thunder' | 'lightning' | 'rainbow' | 'cloud' | 'wind' | 'tornado' | 'hurricane' | 'earthquake' | 'tsunami' | 'flood' | 'drought' | 'fire' | 'smoke' | 'ash' | 'ice' | 'snow';

//SUSTANTIVOS
//ADJETIVOS
ADJECTIVE: POSSESSIVE_ADJECTIVE | DEMONSTRATIVE_ADJECTIVES | QUALIFYING_AJECTIVES| NUMERAL_ADJECTIVES  | INDEFINITE_ADJECTIVES;

POSSESSIVE_ADJECTIVE: 'my' | 'your' | 'his' | 'her' | 'its' | 'our' | 'their';

DEMONSTRATIVE_ADJECTIVES: 'another' | 'any' | 'both' | 'certain' | 'different' | 'each' | 'either' | 'enough' | 'every' | 'few' | 'first' | 'last' | 'many' | 'neither' | 'next' | 'no' | 'one' | 'other' | 'particular' | 'plenty' |
'same' | 'several' | 'some' | 'such' | 'that' | 'these' | 'this' | 'those' | 'various' | 'what' | 'which' | 'whichever' | 'whose';

QUALIFYING_AJECTIVES: 'beautiful' | 'smart' | 'talented' | 'friendly' | 'kind' | 'generous' | 'funny' | 'intelligent' | 'creative' | 'brave' | 'courageous' | 'fierce' | 'honest' | 'loyal' | 'confident' | 'passionate'
| 'determined' | 'hardworking' | 'compassionate' | 'charming' | 'handsome' | 'gorgeous' | 'pretty' | 'elegant' | 'sophisticated' | 'exquisite' | 'delicate' | 'luxurious' | 'spacious' | 'modern' | 'rustic' | 'cozy' | 'comfortable'
| 'refreshing' | 'relaxing' | 'stimulating' | 'energizing' | 'delicious' | 'tasty' | 'flavorful' | 'nutritious' | 'healthy' | 'organic' | 'fresh' | 'juicy' | 'tender' | 'crispy' | 'crunchy' | 'soft' | 'smooth' | 'silky' | 'velvety'
 | 'sparkling' | 'shimmering' | 'glittering' | 'dazzling' | 'radiant' | 'colorful' | 'vibrant' | 'picturesque' | 'scenic' | 'majestic' | 'serene' | 'tranquil' | 'peaceful' | 'quiet' | 'harmonious' | 'pleasant' | 'cheerful' | 'lively'
 | 'festive' | 'playful' | 'romantic' | 'passionate' | 'sensual' | 'exciting' | 'thrilling' | 'adventurous' | 'mysterious' | 'fascinating' | 'intriguing' | 'captivating' | 'engaging' | 'inspiring' | 'motivating' | 'challenging' | 'rewarding'
 | 'fulfilling' |'adorable'|'ambitious'|'blissful'|'bold'|'breezy'|'carefree'|'charismatic'|'cheerful'|'dazzling'|'delightful'|'distinguished'|'divine'|'dynamic'|'ecstatic'|'effervescent'|'eloquent'|
'enchanting'|'endearing'|'enthusiastic'|'epic'|'euphoric'|'excellent'|'extraordinary'|'fabulous'|'fascinating'|'flawless'|'flowing'|'funky'|'glamorous'|'gleaming'|'graceful'|'gracious'|'happy'|'heavenly'|'heroic'|
'jovial'|'joyful'|'lively'|'lovely'|'luminous'|'magnificent'|'marvelous'|'miraculous'|'mystical'|'noble'|'optimistic'|'outstanding'|'passionate'|'peaceful'|'perfect'|'playful'|'pleasurable'|'positive'|'radiant'|
'resilient'|'sensational'|'serendipitous'|'shining'|'sparkling'|'splendid'|'stellar'|'stunning'|'sublime'|'superb'|'supreme'|'surprising'|'terrific'|'thriving'|'thrilling'|'tranquil'|'triumphant'|'ultimate'|'unforgettable'|
'unstoppable'|'vibrant'|'victorious'|'wonderful'|'zesty';

INDEFINITE_ADJECTIVES: 'faltan';

NUMERAL_ADJECTIVES: CARDINAL_NUMBER | NUMERICAL_ORDINAL;

CARDINAL_NUMBER: 'faltan';

NUMERICAL_ORDINAL:'faltan';
//ADJETIVOS
ARTICLE: 'the' | 'a' | 'an';
VERB: 'run' | 'jump' | 'fly' | 'is';
PREPOSITION: 'in' | 'on' | 'at' | 'over' | 'by';
ADVERB: 'quickly' | 'slowly' | 'gracefully';
POSSESSIVE_PRONOUN: 'my' | 'your' | 'his' | 'her';
NUMERAL: 'one' | 'two' | 'three' | 'four';
PUNCTUATION: '.' | ',' | ';';



WS: [ \t\n\r]+ -> skip;

grammar Spanish;

// Parser Rules
sentence
    :   (phrase (PUNTUATION phrase)+)? EOF
    ;

phrase
    :   (nounPhrase | verbPhrase | prepositionalPhrase | conjunctionPhrase | interjectionPhrase)*
    ;

nounPhrase
    :   (DETERM | ARTICLE | POSSESSIVE_PRONOUN | PRONOUN | NUMERAL | ADVERB)? (NOUN | VERB )+ ( VERB| ADVERB |ADJETIVE | NUMERAL)*
    ;

verbPhrase
    :   VERB (ADVERB | prepositionalPhrase )*
    ;

prepositionalPhrase
    :   PREPOSITION nounPhrase
    ;

conjunctionPhrase
    :   CONJUCTION phrase
    ;

interjectionPhrase
    :   INTERJECTION
    ;

// Lexer Rules
DETERM:'cada' | 'algunos' | 'cualquier';
ARTICLE
    :   'los' | 'la' | 'las' | 'el' | 'un' | 'una'|'unos'|'unas'|'al'|'del'
    |'algo'|'nada'|'ninguno'|'algún'|'alguna'
    ;
POSSESSIVE_PRONOUN
    :   'aquella'|'aquellas'|'estas'|'esas'|'aquellos'|'aquel'|'estos'
    | 'esos' | 'ese' | 'este'| 'mi' | 'tu'| 'su' | 'nuestro' | 'su'
    |'mío'|'mía'|'tuyo'|'tuya'|'suyo'|'suya'|'esto'|'esta'
    ;

ADJETIVE
: 'hermosa'|'hermoso'|'delicioso' | 'grande' | 'pequeño' | 'alto' | 'bajo' | 'gordo' | 'dificil'
| 'delgado' | 'feliz' | 'triste' | 'amigable' | 'mezquino'| 'nuevo' | 'viejo'
| 'rojo' | 'azul' | 'verde' | 'amarillo' | 'negro' | 'blanco' | 'morado' | 'naranja'
| 'inteligente' | 'gracioso' | 'valiente' | 'tímido' | 'perezoso' | 'limpio' | 'sucio'
| 'caliente' | 'frío' | 'mojado'| 'seco' | 'rápido' | 'lento' | 'fácil' | 'difícil'
| 'hermoso' | 'feo' | 'joven' | 'viejo' | 'rico'
| 'pobre' | 'bueno' | 'malo' | 'genial' | 'terrible' | 'importante' | 'interesante' | 'aburrido' | 'delicioso'
| 'repugnante' | 'caro' | 'barato' | 'difícil' | 'fácil' | 'fuerte' | 'débil' | 'feliz' | 'triste'
| 'emocionado' | 'calmado' | 'enojado' | 'cansado' | 'energético' | 'amable' | 'cruel' | 'brillante' | 'estúpido'
| 'honesto' | 'deshonesto' | 'educado' | 'maleducado' | 'generoso' | 'egoísta' | 'paciente' | 'impaciente'
| 'orgulloso' | 'avergonzado' | 'callado' | 'ruidoso' | 'tonto' | 'serio' | 'organizado' | 'desordenado' | 'creativo'
| 'ordinario' | 'extraordinario' | 'cuidadoso' | 'descuidado' | 'hermoso' | 'feo' | 'preciso' | 'impreciso'
| 'popular' | 'impopular' | 'famoso' | 'desconocido' | 'encantador' | 'horrible' | 'sabio' | 'tonto' | 'amigable'
| 'hostil' | 'servicial' | 'inútil' | 'vívido' | 'pálido' | 'feroz' | 'gentil' | 'dulce' | 'agrio' | 'picante'
| 'amargo' | 'fresco' | 'rancio' | 'moderno' | 'antiguo' | 'normal' | 'anormal' | 'exitoso' | 'sin éxito'
| 'real' | 'falso' | 'abierto' | 'cerrado' | 'libre' | 'costoso' | 'joven' | 'viejo' | 'rico' | 'pobre' | 'bueno'
| 'malo' | 'genial' |'terrible' | 'importante' | 'interesante' | 'aburrido' | 'delicioso' | 'repugnante'
| 'difícil' | 'fácil' | 'fuerte' | 'débil' | 'feliz' | 'triste' | 'emocionado' | 'calmado' | 'enojado' | 'cansado'
| 'energético' | 'amable' | 'cruel' | 'brillante' | 'estúpido' | 'honesto' | 'deshonesto'
    ;
NUMERAL
    : 'uno' | 'dos' | 'tres' | 'cuatro' | 'cinco' | 'seis' | 'siete' | 'ocho' | 'nueve' | 'diez'
    | 'once' | 'doce' | 'trece' | 'catorce' | 'quince' | 'dieciséis' | 'diecisiete' | 'dieciocho' | 'diecinueve'
    | 'veinte' | 'treinta' | 'cuarenta' | 'cincuenta' | 'sesenta' | 'setenta' | 'ochenta' | 'noventa' | 'cien' | 'mil'
    ;

NOUN
: 'carro'|'comida'|'fútbol' | 'tiempo' | 'año' | 'gente' | 'manera' | 'día' | 'hombre' | 'gobierno' | 'vida' | 'parte' | 'niño'
    | 'mundo' | 'escuela' | 'estado' | 'familia' | 'estudiante' | 'grupo' | 'país' | 'problema' | 'mano' | 'lugar'
    | 'caso' | 'semana' | 'compañía' | 'sistema' | 'programa' | 'pregunta' | 'trabajo' | 'gobierno' | 'número' | 'noche'
    | 'punto' | 'hogar' | 'agua' | 'habitación' | 'madre' | 'área' | 'dinero' | 'historia' | 'hecho' | 'mes'
    | 'montón' | 'derecho' | 'estudio' | 'libro' | 'ojo' | 'trabajo' | 'palabra' | 'negocio' | 'asunto' | 'lado'
    | 'tipo' | 'cabeza' | 'casa' | 'servicio' | 'amigo' | 'padre' | 'poder' | 'hora' | 'juego' | 'línea'
    | 'fin' | 'miembro' | 'ley' | 'coche' | 'ciudad' | 'comunidad' | 'nombre' | 'presidente' | 'equipo' | 'minuto'
    | 'idea' | 'niño' | 'cuerpo' | 'información' | 'espalda' | 'padre/madre' | 'rostro' | 'otros' | 'nivel' | 'oficina'
    | 'puerta' | 'salud' | 'persona' | 'arte' | 'guerra' | 'historia' | 'fiesta' | 'resultado' | 'cambio' | 'mañana'
    'reason' | 'research' | 'girl' | 'guy' | 'moment' | 'air' | 'teacher' | 'force' | 'education' | 'policy'
    | 'ciudad' | 'lado' | 'hogar' | 'hora' | 'cuerpo' | 'año' | 'trabajo' | 'música' | 'lugar' | 'agua'
    | 'habitación' | 'área' | 'dinero' | 'historia' | 'hecho' | 'montón' | 'pregunta' | 'semana' | 'compañía' | 'sistema'
    | 'programa' | 'información' | 'gobierno' | 'asunto' | 'mano' | 'parte' | 'tipo' | 'niño' | 'problema'
    | 'ejemplo' | 'hecho' | 'desarrollo' | 'grupo' | 'miembro' | 'número' | 'hombre' | 'mujer' | 'gente' | 'chica'
    | 'chico' | 'perro' | 'gato' | 'casa' | 'coche' | 'árbol' | 'flor' | 'pájaro' | 'pez' | 'parque'
    | 'manzana' | 'plátano' | 'naranja' | 'uva' | 'fresa';
PRONOUN
    :   'Yo' | 'tú' | 'él' | 'ella' | 'nosotros' | 'ellos'|'ellas'|'nosotras'
    ;

VERB
: 'fueron'|'fué'|'fuí'|'estar'|'ser'|'está'|'quiere'|'podría'|'debería'|'debe' |'debo'|'necesito'|'necesita'
|'quiero'|'tiene'|'tienen'|'tengo'|'jugar'|'estaba'|'eran'|'soy'|'están'|'son'|'es'|'llovió'|'comer'
| 'correr' | 'saltar' | 'jugar' | 'dormir' | 'trabajar' | 'leer' | 'escribir' | 'hablar' | 'caminar'
| 'pensar' | 'sentir' | 'ver' | 'escuchar' | 'oler' | 'probar' | 'correr' | 'caminar' | 'conducir' | 'volar' | 'nadar'
| 'saltar' | 'reír' | 'llorar' | 'gritar' | 'susurrar' | 'hablar' | 'pensar' | 'sentir' | 'ver' | 'escuchar' | 'oler' | 'probar'
| 'llegar' | 'asistir' | 'intentar' | 'evitar' | 'empezar' | 'culpar' | 'tomar prestado' | 'romper' | 'construir' | 'llamar' | 'llevar'
| 'cambiar' | 'elegir' | 'venir' | 'continuar' | 'cocinar' | 'corregir' | 'crear' | 'decidir' | 'describir' | 'merecer'
| 'destruir' | 'desarrollar' | 'descubrir' | 'hacer' | 'dibujar' | 'dejar caer' | 'comer' | 'explicar' | 'fallar' | 'sentir'
| 'encontrar' | 'terminar' | 'olvidar' | 'perdonar' | 'ir' | 'crecer' | 'ayudar' | 'esconder' | 'imaginar' | 'incluir'
'informar' | 'interesar' | 'unirse' | 'mantener' | 'saber' | 'dejar' | 'aprender' | 'gustar' | 'escuchar' | 'perder'
| 'hacer' | 'manejar' | 'significar' | 'conocer' | 'extrañar' | 'mover' | 'necesitar' | 'notar' | 'abrir' | 'ordenar'
| 'poseer' | 'pasar' | 'pagar' | 'planificar' | 'jugar' | 'señalar' | 'preparar' | 'proveer' | 'alcanzar' | 'recibir'
| 'rechazar' | 'recordar' | 'repetir' | 'informar' | 'solicitar' | 'descansar' | 'regresar' | 'guardar' | 'decir' | 'ver'
| 'vender' | 'enviar' | 'establecer' | 'mostrar' | 'firmar' | 'dormir' | 'sonreír' | 'gastar' | 'comenzar' | 'quedarse'
| 'detener' | 'tomar' | 'hablar' | 'probar' | 'pensar' | 'enseñar' | 'decir' | 'pensar' | 'intentar' | 'convertir'
| 'entender' | 'usar' | 'visitar' | 'esperar' | 'caminar' | 'querer' | 'ver' | 'trabajar' | 'escribir';

ADVERB
    :   'rápidamente' | 'lentamente' | 'cuidadosamente' | 'felizmente' | 'tristemente' | 'a menudo' | 'nunca' | 'siempre'
        | 'a veces' | 'ayer' | 'hoy' | 'mañana' | 'ahora' | 'entonces' | 'casi' | 'exactamente' | 'precisamente'
        | 'completamente' | 'parcialmente' | 'frecuentemente' | 'rara vez' | 'ocasionalmente' | 'anualmente' | 'diariamente'
        | 'semanalmente' | 'mensualmente' | 'anualmente'
    ;

PREPOSITION
    :   'en' | 'a' | 'desde' | 'con' | 'sin' | 'cerca de' | 'lejos de' | 'encima de'
        | 'debajo de' | 'dentro de' | 'fuera de'
    ;

CONJUCTION
    :   'y' | 'o' | 'pero' | 'aún' | 'así que' | 'porque' | 'si' | 'a menos que'
    ;

INTERJECTION
    :   'guau' | 'uh-oh' | 'hola' | 'adios'|'ay' | 'buu' | 'auch' | 'jmm'
    ;

PUNTUATION
    :  '.'|'?'|'.'|'!'|'¿'|'!'|';'|':';

// Regla para ignorar los espacios en blanco
WS : [ \t\r\n]+ -> skip;
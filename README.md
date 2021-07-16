# Ejercicio Morse, mensajes con igual cantidad de letras (JAVA)

## Pregunta Técnica:

Hemos estado recibiendo telegramas de felicitación. El problema es que los telegramas se han enviado en código Morse y los espacios entre las letras se han perdido en la transmisión.

En el código Morse, cada letra del alfabeto se sustituye por una secuencia de puntos y rayas de la siguiente manera:

| AL | FA | BE | TO |
| --- | --- | --- | --- |
| a   .-      | h   ....    | o   ---     | v   ...- |
| b   -...    | i   ..      | p   .--.    | w   .--  |
| c   -.-.    | j   .---    | q   --.-    | x   -..- |
| d   -..     | k   -.-     | r   .-.     | y   -.-- |
| e   .       | l   .-..    | s   ...     | z   --.. |
| f   ..-.    | m   --      | t   -       |          |
| g   --.     | n   -.      | u   ..-     |          |

Se usan todas las combinaciones de entre 1 y 4 puntos y rayas, a excepción de:

| Excepciones |
| --- |
| ..-- |
| .-.- |
| ---. |
| ---- |

Tradicionalmente, los puntos se transmitían como una nota breve y los guiones como una nota más larga, con pausas entre las diferentes letras. Por eso, algunos teléfonos móviles emiten el sonido ... -- ... cuando se recibe un mensaje, ya que este es el código Morse para SMS.

Si los espacios entre las letras se pierden, los mensajes pueden ser ambiguos. Por ejemplo, incluso si sabemos que el mensaje -..-----. se compone de tres letras, aún podría significar: njg, dog, xmg o xon.

Escribe una función que dado en un mensaje (entre 1 y 10 letras inclusive) y determine la cantidad de mensajes con el mismo número de letras que podría representar.


##### Ejemplo:

Para:

- mensaje = "hola"

La salida debe ser:

- contarMensajesMismaLongitud(mensaje) = 14


#### Entradas sugeridas y Salidas esperadas:

En la plantilla (repositorio), la función "main(String[] args)" espera recibir un parámetro de entrada con el siguiente formato:

- "[mensaje]"
- Ejemplo: "hola"
- Este parámetro "[mensaje]" está siendo alojado en la variable 'message'

Y se espera como resultado la configuración obtenida sea asignada a la variable 'initialBoard' que es una matriz de NxN, cuya presentación está a cargo de la función 'showInitialBoard' y que muestra lo siguiente:

- The '[mensaje]' message in Morse '[mensaje en Morse]' has [cantidad de mensajes con la misma longitud] messages with the same number of letters that it could represent
- Ejemplo: The 'hola' message in Morse '....---.-...-' has 14 messages with the same number of letters that it could represent

Es necesario desarrollar al menos dos funciones:

1. Función que permita traducir el mensaje recibido y asignarlo en la variable 'messageInMorse'
2. Función que cuente los mensajes con el mismo número de letras y asignarlo en la variable 'counter'

La función 'generateMorseAlphabet' es solo una muestra, el uso de la misma queda a su criterio.

Además, el mensaje final impreso con 'System.out.println' debe mantenerse.

**CONSIDERAR:** Sabemos de la existencia de respuestas en internet para esta pregunta, pero deseamos conocer su capacidad analítica para la resolución de este problema. Esperamos que el candidato tenga buenas habilidades en desarrollo de algoritmos para que pueda trabajar con equipo técnico apropiadamente.

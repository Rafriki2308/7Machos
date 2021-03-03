># Readme 7Machos
>## Bienvenidos al mundo de 7Machos     
<p align ="center">
 <image src="Images/IconoJuego.png"></image>
 </p>

Siete machos es un juego basado en la película homónima de Mario Moreno "Cantinflas". En dicha película existe un escena en la cual "Cantinflas", junto con un malo malísimo se retan a un duelo a ruleta rusa, por el amor de una mujer (que anticuado). 
He añadido un cambio que pasaré a explicar dentro de las instrucciones del juego. Espero que disfrutéis el juego tanto como yo he disfrutado desarrollándolo.

Lo he desarrollado en lenguaje JAVA con el entorno de desarrollo NetBeans.

<p align ="center">
 <image src="Images/IconoJavaNetbeans.png"></image>
 </p>
 
### 1. Instalación.

 Para comenzar deberemos descargarnos el directorio donde se encuentran los archivos del programa. 
 Para ello debemos ingresar la dirección de GitHub.

Solo hay que descargar el paquete de los archivos y descomprimirlos en la misma carpeta.

### 2. Ejecución

Para que se pueda ejecutar el juego, puesto que nuestros conocimientos no llegan, todavía, a la realización de archivos ejecutables en el sistema operativo, es necesario utilizar la consola de comandos de Windows para compilar los archivos y poder ejecutarlos.

Para ello una vez en la consola de comandos, debemos ejecutar los siguientes comandos:

    c:\Directorio Juego\Javac JugadorRuso.java
    c:\Directorio Juego\Javac Revolver.java
    c:\Directorio Juego\Javac JugadorRuso.java

Una vez que tenemos los archivos compilados, tendrán el mismo nombre que los anteriores pero la extensión cambiaran por .class.

Ya solo tenemos que ejecutarlo:

    c:\Directorio Juego\Java JugadorRuso
Ahora a disfrutarlo.

### 3. Instrucciones de uso

Cuando ejecutemos el programa se iniciara con el jugador activo, y el jugador al que se esta apuntando.
La idea es que un jugador esta apuntando la pistola al siguiente jugador. Cuando se dispara la pistola pasa al siguiente jugador, y este apunta al siguiente, y así sucesivamente, o hasta que un jugador muere. Es un juego para seis jugadores, cuando acabamos la ronda, se reinicia y vuelta a comenzar.

El jugador puede realizar varias cosas:

    1- Seleccionar Pistola.
 
 Esta selección es obligatoria, obviamente es necesario apuntar con un pistola.
   

    2- Mirar Posiciones
 Esta opción nos permite ver la posición de la bala en el tambor de la pistola, con respecto al cañón.

    3- Girar Cilindro
Esta opción, como su nombre indica gira el tambor, para varia la posición de la bala con respecto al cañón. 
Pero OJO cuando activamos esta opción, automáticamente el turno pasa al siguiente jugador.

    4- Aplicar Disparo

Esta opción, creo que se define por si sola, creo que no necesito explicar mas.

    0- Salir

Sale directamente del juego.

### 3 . FAQ

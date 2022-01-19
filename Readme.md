># Readme 7Machos totales
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

 Para comenzar deberemos introducir el enlace ofrecido en el navegador. Cuando entramos en el proyecto correcto dentro de Github, solo tenemos que seleccionar  
 Para ello debemos ingresar la dirección de GitHub. Una vez dentro de la página del proyecto solo tenemos que descargarnos el paquete con el proyecto. Esto se hace en la sección Code, dentro del menú que se despliega seleccionamos Download y guardamos el archivo zip.
 
 <p align ="center">
 <image src="Images/Download.png"></image>
 </p>
 

Solo hay que descargar el paquete de los archivos y descomprimir la carpeta. Solo hay que descomprimir el contenido del directorio Juego dentro del directorio donde deseas almacenar el juego.

### 2. Ejecución

Para que se pueda ejecutar el juego, puesto que nuestros conocimientos no llegan, todavía, a la realización de archivos ejecutables en el sistema operativo, es necesario utilizar la consola de comandos de Windows para compilar los archivos y poder ejecutarlos.

Para ello basta con pulsar el boton de inicio de windows y escribir sobre el "cmd", con ello aparecerá un menu donde ofrecera la aplicación de la consola de comandos.

<p align ="center">
 <image src="Images/cmd.png"></image>
 </p>

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

<p align ="center">
 <image src="Images/MenuJuego.png"></image>
 </p>

El jugador puede realizar varias cosas:

    1- Seleccionar Pistola.
 
 Esta selección es obligatoria, obviamente es necesario apuntar con un pistola.
 
 <p align ="center">
 <image src="Images/Menu2Juego.png"></image>
 </p>
   

    2- Mirar Posiciones
 Esta opción nos permite ver la posición de la bala en el tambor de la pistola, con respecto al cañón.
 
 
 <p align ="center">
 <image src="Images/menu3Juego.png"></image>
 </p>

    3- Girar Cilindro
Esta opción, como su nombre indica gira el tambor, para varia la posición de la bala con respecto al cañón. 
Pero OJO cuando activamos esta opción, automáticamente el turno pasa al siguiente jugador.

    4- Aplicar Disparo

Esta opción, creo que se define por si sola, creo que no necesito explicar mas.

    0- Salir

Sale directamente del juego.

### 3 . FAQ

Javac no se reconoce como un programa externo o interno, programa o archivo.

<p align ="center">
 <image src="Images/fallo.png"></image>
 </p>

 

Así mismo, una de las causas por las que javac no se reconoce como archivo interno o externo, es precisamente no tener instalado el programa Java JDK, lo primero que tienes que hacer es instalarlo desde Google y luego manipular los comandos que a continuación te explicaré:

 

Paso 1: Una vez que tengas descargado e instalado el programa, vas a abrir la ventana de comandos presionando las teclas “Windows + R”

 

Paso 2: Una vez abierta la ventana de comandos vas a proceder a escribir “Java” para abrir todas las configuraciones que necesitas.

 

Paso 3: Vas a ir directo a la unidad y verificar en cuál de todas las rutas es la que instalaste el programa Java JDK y la vas a copiar.

 

Paso 4: Una vez hecho esto, vas a ir directo a la interfaz gráfica y buscar “Mi pc”,vas a dar clic derecho y seleccionar “Propiedades”

 

Paso 5: Dentro de las opciones que te aparecen aquí, vas a proceder a buscar una que diga  si tienes Windows 7 “Configuración avanzada del sistema” y le daremos clic luego a “Variables del entorno”.

<p align ="center">
 <image src="Images/entornovariable.png"></image>
 </p>


Paso 6: Se abrirá una ventana con varios códigos o variables, y vas a darle clic a la fila que diga “Path” y presionaras “Editar”.

<p align ="center">
 <image src="Images/entornovariable2.png"></image>
 </p>
 

Paso 7: Una vez aquí, vas a proceder a pegar la ruta que habías copiado en la pestaña de comandos en el campo del valor de la variable.

<p align ="center">
 <image src="Images/path.png"></image>
 </p>

 

Paso 8: Ya sólo queda cerrar la ventana de comandos donde el Java presentaba el error y reiniciar el programa, ya debería haberse solucionado.

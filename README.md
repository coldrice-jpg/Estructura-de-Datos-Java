
<h1 align="center"> Codigos de java de Estructura de Datos </h1>

## Descripción del proyecto
Este proyecto de Github es para entregar los codigos realizados en Java para la materia de Estructura de datos. A fin de mantener un registro del avance en las clases de la materia.

## Requisitos previos
Para poder usar este repositorio de manera correcta nos valemos de varias herramientas para el funcionamiento de los codigos. Los requisitos son los siguientes:
1. La versión más reciente de JDK, puede funcionar con versiones superiores.
2. Un entorno de desarrollo integrado, en mi caso uso IntelliJ IDEA.

## Instrucciones de instalación
Para instalar las herramientas usadas se tienen que seguir los siguientes pasos:
1. Instalar el JDK (Java Development Kit)
    IntelliJ IDEA es el entorno de desarrollo (IDE), pero no incluye el lenguaje Java en sí. Primero necesitas instalar el JDK.
    
    - Ve al sitio web: Visita la página de descargas de Oracle JDK.
    
    - Selecciona la versión: Elige una versión LTS (Long-Term Support) como JDK 21 o JDK 17.
    
    - Descarga el instalador: Busca tu sistema operativo (Windows) y descarga el "x64 Installer" (archivo .exe).
    
    - Ejecuta el instalador: Abre el archivo .exe y sigue las instrucciones. Es seguro aceptar todas las opciones predeterminadas. El instalador configurará automáticamente las variables de entorno necesarias.

2. Descarga e Instalación de IntelliJ IDEA

   1. Ir a la Página Web:

      - Abre tu navegador y ve al sitio web oficial de JetBrains para IntelliJ IDEA: jetbrains.com/idea/
   
    2. Seleccionar la Edición:
   
       - Habrán dos opciones: Ultimate y Community.
   
        - Haz clic en el botón de descarga de la Community Edition.
   
    3. Descargar el Instalador:
   
        - La descarga del archivo .exe comenzará automáticamente.

    4. Ejecutar el Instalador:
   
        - Una vez descargado, abra el archivo .exe para iniciar el asistente de instalación.
   
    5. Pantallas del Asistente de Instalación:
       - Welcome: Haga clic en "Next".
   
        - Destination Folder: Elija dónde quiere instalar el programa. La carpeta predeterminada (en C:\Program Files\JetBrains\...) suele ser la mejor opción. Haga clic en "Next".
   
        - Installation Options: Aquí se configuraran accesos directos. Es recomendable seleccionar:
   
          - Create Desktop Shortcut: Marca "IntelliJ IDEA Community Edition" para crear un acceso directo en el escritorio.
   
          - Update "Open Folder as Project": Marque esta opción. Le permitirá hacer clic derecho en una carpeta y abrirla como un proyecto.
   
          - Create Associations: Marque .java, .groovy, etc., esto hará que IntelliJ sea el programa predeterminado para abrir esos archivos.
   
          - Update PATH variable: Marque esta opción. Es importante para poder usar herramientas de línea de comandos.

         - Haga clic en "Next".

    6. Start Menu Folder:

          - Déjelo como está ("JetBrains") y haga clic en "Install".

    7. Finalizar:

       - La instalación tomará unos minutos. Una vez completada, le puede pedir que reinicie el ordenador. Hagalo si se lo solicita.

3. Crear un Proyecto y Seleccionar la Carpeta de Trabajo
Abrir IntelliJ IDEA:

Inicia el programa desde tu escritorio.

Crear un Nuevo Proyecto:

En la pantalla de bienvenida, haz clic en "New Project".

Configurar el Proyecto:

Name: Dale un nombre a tu proyecto (ej. "MiPrimerProyecto").

Location: Esta es la "carpeta de trabajo" que mencionaste. Es la carpeta en tu ordenador donde se guardarán todos los archivos de este proyecto (ej. C:\Users\TuUsuario\IdeaProjects\MiPrimerProyecto). Puedes cambiarla si lo deseas.

Language: Asegúrate de que "Java" esté seleccionado.

Build System: Para un proyecto simple, puedes seleccionar "IntelliJ". (Si trabajas en algo más complejo, aquí es donde elegirías "Maven" o "Gradle").

JDK: Aquí es donde vinculas el JDK que instalaste en el Paso 0. IntelliJ IDEA es muy bueno detectando automáticamente los JDKs instalados. Debería aparecer tu versión (ej. "Oracle OpenJDK 21") en la lista desplegable. Si no, haz clic en "Add JDK..." y busca la carpeta donde se instaló (usualmente en C:\Program Files\Java\jdk-21).

Add sample code: Marca esta casilla. Es muy útil, ya que creará automáticamente un archivo Main.java con un "Hola Mundo" para que puedas probar que todo funciona.

Crear:

Haz clic en el botón "Create".

Verificar la Configuración:

El IDE se abrirá. Puede que tarde unos segundos en "indexar" los archivos.

A la izquierda, verás la estructura de tu proyecto. Ve a src > Main.java.

Haz clic en el botón verde de "Play" (ejecutar) junto a la línea public static void main(String[] args) o en la barra superior.

En la parte inferior, en la pestaña "Run", deberías ver la salida: "Hello and welcome!".

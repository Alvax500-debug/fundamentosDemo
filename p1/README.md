#                    Reporte Practica 1

##                      Resumen 

Se trabajo por primera vez con git y github para crear, manejar y actualizar repositorios, asi como un par de ejercicios de java, aunque el enfoque principal fue el uso de git mediante linea de comandos para hacer lo antes mencionado ademas de incluir comandos utiles para trabajar desde linea de comandos lo que se necesite o se realice durante el curso.

##                      Desarrollo

Como **herramientas** se utilizaron: _git bash_ (herramienta que instala _git_ y sus comandos en windows), _VS Code_ (editor de codigo para windows de visual studio), _JDK V1.8.0_251_ (Kit de Desarrollo de Java en su version 8), una cuenta de _github_ para almacenar nuestros repositorios de practicas.

Primero que nada el detalle era instalar cada herramienta de sotware para windows 7, eso no represento problema, ya que los instaladores vienen con instrucciones y preconfigurados y crear la cuenta de github era igual de facil, posteriormente el detalle se presento con el JDK.

Segundo paso fue, el repasar algunos comandos utiles que se usan generalmente en Linux pero con _git bash_ se pueden ejecutar en windows, pero unicamente desde _git bash_ y con lo aprendido (movernos entre directorios, crear directorios, ver el contenido de los directorios y crear archivos, asi como ejecutar _VS Code_ desde la ruta donde nos encontramos en ese momento) empezamos a trabajar en la practica, y revisamos rapido el compilador de java con el comando ````javac -version```.

Con el JDK se instalaba el compilador de Java (javac) el cual en un inicio no lo reconocia el interprete de comandos ni de windows ni de _git bash_, entonces tuve que seguir las siguientes instruciones:

1. Abrir un explorador de archivos.
2. Clic derecho sobre ”Este equipo” y en ”Propiedades”
3. Clic sobre ”Configuraci´on avanzada del sistema”
4. Clic sobre ”Variables de entorno”
5. En ”Variables del sistema” buscar ”Path”
6. Seleccionarla y dar clic en ”Editar” ¡CON CUIDADO!
7. Clic en ”Nuevo”
8. Escribir la ruta en la que se instal´o el jdk, por ejemplo:
    _C:\Program Files\Java\jdk1.8.0_251\bin_
9. Aceptar (o cerrar) en todas las ventanas abiertas.
10. Terminamos de configurar las variables de entorno

**Instrucciones disponibles en el apartado 4.3 del enunciado de la practica 1 (La ruta puede variar dependiendo del equipo y la instalacion realizada)**

Posteriormente cerrar y volver a abrir el interprete de comandos para que reconociera las nuevas configuraciones realizadas y listo, ya funcionaba el compilador de java de manera normal y se realizo un programa simple en java de un "Hola Mundo" y que realizaba una suma simple, se compilo y se jecuto debidamente

Lo siguiente era crear un repositorio (remoto o en la nube) en _github_ y vincularlo con una carpeta existente en nuestra computadora (local), la cual debia tener el mismo nombre y seguir los siguientes pasos:

1. usar el siguiente comando: ```echo "# fundamentos" >> README.md```
2. ejecutar el comando: ```git init```, en el directorio que se desea vincular con el repositorio, el nombre debe ser el mismo que el del repositorio creado en github
3. usar el comando: ```echo "*.class" >> .gitignore```
4. ejecutar el comando: ```git add .```, para añadir los archivos nuevos y los cambios realizados a cualquier archio ya existente el repositorio, en caso de haberlos
5. ejecutar el comando: ```git commit -m "mensaje"```, para confirmar los cambios a subir y un mensaje para identificar que se hizo con ese cambio
6. ejecutar el comando: ```git remote add origin https://github.com/cuenta_github/repositorio.git```, para vincular el repositorio local con el creado desde la cuenta de github (el link puede cambiar dependiendo la cuenta y el repositorio de _github_ al que se referencia)
7. ejecutar el comando: ```git push -u origin master```,  para subir los cambios de local al repositorio en la rama master o principal

Una vez vinculado y comprendido un poco mejor como funciona la herramienta _git_ y el uso de _github_, lo restante es proceder con la parte que evalua la practica, la parte 5 del enunciado de la practica.

En cuanto a la parte que se evalua de la practica (parte 5) empezaba con lo siguiente, crear un repositorio de _github_ desde el mismo con el nombre de pila de cada uno de nosotros, lo mas facil, pues ya se habia hecho antes en esta practica, despues asociarlo a un repositorio local, tal como se hizo en la parte previa de esta practica y posteriormente crear dentro de ese repositorio una carpeta por cada practica y en cada una un archivo **README.md** para sus respectivos reportes, despues los incisos 4 y 5 de esta seccion de la practica consistian en crear 2 programas en java.

El primero para convertir grados C° a F°, donde el principal detalle o problema a resolver fue la division, ya que la formula para la convesion es la siguiente ```F = (C * (9/5)) + 32```, y el problema consistia en la division, ya que java por defecto en las divisiones solo devuelven valores enteros; por lo que habia que hacer un cast (conversion) al tipo de dato que deseabamos obtener como por ejemplo un real (float) en el caso de la division de ```9/5```, eso se conseguia de la siuiente manera ```float division = (float)9/5;``` y de esa manera conseguir el valor exacto **1.8**, una vez realizada esta conversion, lo siguiente era poder leer datos ingresados por el usuario desde el teclado, para eso era necesario importar y usar una clase llamada Scanner que servia para ese proposito y que permite indicar el tipo de dato que se espera sea introducido desde teclado para poder procesarlo.

Ya habiendo resuelto ambos inconvenientes el inciso 4 y 5 (determinar el salario de un empleado de acuerdo con las horas trabajadas) fueron mas faciles de realizar, despues guardar y subir todos los cambios al repositorio ya vinculado y contestar las preguntas de los incisos 7 al 9.

##                        Conclusion

7. Se utiliza el comando `git clone tipo_url`, donde el **_tipo_url_** varia dependiendo del tipo de clonado que se hara al repositorio, ya sea via **http** (autenticacion de usuario mediante logueo en el shell) o via **ssh** (autenticado via clave ssh generada por la maquina que se esta usando y que se registra en la cuenta de github del usuario).

8. Se usa el comando `git pull` para actualizar el repositorio local con los cambios que se subieron al repositorio almacenado en github.

9. Posiblemente haya algun conflicto si es que el archivo que modificaste ya habia sido modificaco por alguien mas, en cuyo caso se debe revisar cuales serian los cambios y arreglar los posibles conflictos, para posteriormente subir los cambios o usar el comando `git stash` antes de usar `git pull`.
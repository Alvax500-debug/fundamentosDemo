#                    Reporte Practica 4

##                      Resumen 

Para esta practica se empezo con la descarga y ejecucion del software _PSeInt_, que era el principal objetivo de la practica, aprender a utilizar este sofware de aplicacion diseñado para la documentacion previa a la codificacion de un algoritmo (diagramas de flujo y pseudocodigos); asi como la resolucion de otros ejercicios para mejorar nuestra forma de resolver problemas y generar algoritmos para su respectiva resolucion.

##                      Desarrollo

El principal punto de esta practica era el uso de un software llamado _PSeInt_, un software muy popular y conocido cuyo enfoque es el diseño de **pseudocodigo** y generar los respectivos **diagramas de flujo** para cualquier algoritmo que se tenga diseñado previamente y tambien el uso de perfiles en el mismo, que en este caso el perfil que se va a utilizar para toda practica futura es el de _UACM-SLT_, eso con un par de ejercicios, algunos realizados durante clase y otros que debiamos realizar nosotros mismos, los ejercicios realizados durante la clase son:

1. Escribir Hola Mundo

2. Encontrar el mayor de 2 numeros dados por el usuario

3. Modificar el ejercicio anterior para que ahora tambien indique si ambos numeros son iguales

4. Calcular el promedio de 3 numeros dados por el usuario

5. Modificar el ejercicio anterior para que ahora haga ese proceso para _"n"_ numeros donde la _"n"_ cantidad sera dada por el usuario ademas de los numeros

* Se agrego un ejercicio extra que no estaba en el enunciado de la practica, que se denomino como _13_ y tambien se hizo durante la clase

13. Realizar **pseudocodigo** y **diagrama de flujo** del ejercicio **5.1** de la practica **3**

##                        Resultados

Como resultados se debe empezar por un fallo en la sintaxis de un ejemplo en la estructura _DO-WHILE_ por una variable incorrecta, lo que resulto en un error de compilacion por una variable que no existe y se menciona en el codigo, en el archivo _principal.java_, posteriormente se procedio a realizar los ejercicios de ejemplo de la seccion **4.2** de la practica **3** y de los cuales se hacen algunas anotaciones a continuacion.

Para esta parte de la practica se acordo usar como nombre de los archivos del codigo fuente las letras _Ejx.java_ que se referian a ejercicios y la x cambiada por el numero correspondiente al ejercicio, estos realizados durante la sesion y en los cuales todos quedaron resueltos guiados por el profesor, donde tambien aprendimos que para comparar _Strings_ se debe usar el metodo _equals()_ que pertenece a la clase _String_ y regresa **true** o **false** dependiendo de si las cadenas de texto coinciden o no; una vez realizados estos ejercicios, lo siguiente es la seccion **5** de la practica **3** y se comenta mas al respecto de cada ejercicio enel siguiente parrafo.

Para esta seccion de la practica opte por nombrar a los archivos de codigo como *Cinco_xxxx.java*, que _Cinco_ es por la seccion de la practica y _xxxx_ se reemplazaria por el numero del ejercicio escrito con letras (uno,tres,etc.), aqui cada ejercicio tenias ddefinidas las reglas y restricciones que se debian respetar y seguir, asi como sus formulas matematicas; no resulto dificil resolver los ejercicios despues de analizar y pensar a fondo un poco cada uno, por lo que al final todos quedaron resueltos y compilados correctamente, como detalle adicional cabe resaltar que el objeto que se utilizaba para leer los datos desde teclado en cada archivo se denomino _leer_, instanciado de la clase _Scanner_.

##                        Discusion

Aqui una comparacion mas que evidente son los ejercicios _3_ de la seccion **4.2** y el _1_ de la seccion **5** son el mismo y bajo la misma logica son resueltos, pero ya en codigo la diferencia es la estructura de control usada para resolverlo, aqui algunas de las observaciones son:

* En comparacion usando la estructura **switch** es mas sencillo y eficiente que usar multiples **if**

* La diferencia mas notable en esto, es que no se compara o se utiliza como parametro un valor _boolean_ sino el contanido exacto de la variable _String_ y de ahi se asigna al caso correspondiente

* Es importante mencionar que aqui importa mucho la cadena de texto asignada a cada _Case_, ya que es sensible a mayusculas y minusculas, por ese motivo se debe ser muy exacto y preciso a la hora de asignar y comparar las cadenas con los _case_, para que estos puedan ser ejecutados correctamente

##                        Conclusion

Esta practica sirvio bastante para identificar las estructuras de control existentes en _java_ asi como determinar en que momento y como usarlas al resolver algoritmos mediante _java_, fueron ejercicios bastante interesantes ademas el repaso de hacer algortimos antes de codificar la solucion, incluyendo tambien el haber aprendido cosas como el metodo _equals()_ y la forma correcta de implementar la estructura **switch** con _Strings_. 
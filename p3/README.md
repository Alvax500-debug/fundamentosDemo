#                    Reporte Practica 3

##                      Resumen 

Esta practica consistio en repasar y mejorar nuestro dominio sobre las estructuras basicas de control en java (bucles y estructuras selectivas) con ejemplos y unos ejercicios realizados durante la sesion, asi como tambien ir mejorando nuestra manera de resolver problemas mediante el desarrollo y codificacion de algoritmos en lenguaje Java, ya conociendo y usando todas las herramientas basicas que el mismo lenguaje ofrece.

##                      Desarrollo

Comenzamos con el inciso 4, la seccion 4.1 donde se dio un repaso de todas las estructuras de control basicas de Java, todo en el archivo _principal.java_, posteriormente en el inciso 4.2 se resolvieron unos ejercicios usando las estructuras de control ya vistas para comprender mejor su uso en la practica, los ejercicios son los siguientes:

4. 2. 1. Programa que te pregunta si estas registrado y te saludo si lo estas, en caso contrario, te solicita ingresar tu nombre y posteriormente te saluda.
* El algoritmo seguido fue el siguiente:

1. Preguntar si el usuario esta registrado
2. SI (respuesta == no) ENTONCES
  2. 1.     Preguntar nombre del usuario
  2. 2.     Saludar al usuario
3. SINO
  3. 1.     Saludar al usuario
4. FIN SI
5. FIN 

**NOTA 421:** en java para determinar si el contenido de una variable de tipo _String (objetos)_ es igual a una cadena de texto determinada, se usa un metodo llamado _equals()_ y determina si ambas cadenas de texto coinciden regresando un dato _boolean_; el algortimo codificado en *Java* se encuentra en el archivo llamado *Ej1.java* 

4. 2. 2. Programa que dira si el numero ingresado por el usuario es par o impar.
* El algoritmo es el siguiente:

1. Solicitar un numero
2. SI (numero%2 == 0) ENTONCES
  2. 1.     El numero es par
3. SINO 
  3. 1.     El numero es impar
4. FIN SI
5. FIN

**NOTA 422:** para determinar facilmente si un numero es par o no en java es mediante el residuo de la division de un numero entre 2, si el residuo es exactamente igual a 0, entonces el numero es par SINO es impar; el algortimo codificado en *Java* se encuentra en el archivo llamado *Ej2.java*

4. 2. 3. Programa que determina el promedio de un alumno mediante sus calificaciones que se tomaran atraves de las siguientes letras:
_MB =  10_
_B = 8.7_
_s = 6_
_NA = 5_
Y una ves que se introduzca la palabra _FIN_ se detendra el programa.
* El algoritmo a seguir es el siguiente:

1. MIENTRAS (calificacion != "FIN") 
  1. 1.     Ingresar Calificacion
  1. 2.     SI (calificacion == "NA") ENTONCES
    1. 2. 1.        suma = suma + 5
    1. 2. 2.        contador = contador + 1
  1. 3.     FIN SI
  1. 4.     SI (calificacion == "S") ENTONCES
    1. 4. 1.        suma = suma + 6
    1. 4. 2.        contador = contador + 1
  1. 5.     FIN SI
  1. 6.     SI (calificacion == "B") ENTONCES
    1. 6. 1.        suma = suma + 8.7
    1. 6. 2.        contador = contador + 1
  1. 7.     FIN SI
  1. 8.     SI (calificacion == "MB") ENTONCES
    1. 8. 1.        suma = suma + 10
    1. 8. 2.        contador = contador + 1
  19.     FIN SI
2. FIN MIENTRAS
3. SI (contador == 0) ENTONCES
  3. 1.     El programa termino sin recibir valores
  3. 2.     Ir al paso 6
4. SINO
  4. 1.     promedio = suma / contador
  4. 2.     Escribir (promedio)
5. FIN SI
6. FIN

**NOTA 423:** en este caso se uso igualmente el metodo _equals()_ de los objetos de tipo _String_ junto con la _negacion (!)_ para cambiar el resultado del metodo antes mencionado y asi verificar la adecuada ejecucion del ciclo MIENTRAS bajo la condicion de termino con la palabra "FIN"; el algortimo codificado en *Java* se encuentra en el archivo llamado *Ej3.java*

4. 2. 4. Programa que determinara el mayor de todos los numeros positivos ingresados por el usuario y una vez que se ingrese un numero negativo, el programa terminara y mostrara en pantalla el mayor de todos los numeros ingresados.
* El algortimo a seguir fue:

1. MIENTRAS (numero >= 0)
  1. 1.     Ingrese un numero
  1. 2.     SI (numero > mayor) ENTONCES
    1. 2. 1.        mayor = numero
  1. 3.     FIN SI
2. FIN MIENTRAS
3. Escribir (mayor)
4. FIN

**NOTA 424:** el algortimo codificado en *Java* se encuentra en el archivo llamado *Ej4.java*

4. 2. 5. Realizar un programa que ingreados 10 numeros por el usuario, contar los numeros pares e impares y al final mostrara el conteo de cada uno.
* El algortimo usado para resolver el problema es el siguiente:

1. PARA (i=0; i<10; i++) HACER
  1. 1.     Ingresa un numero
  1. 2.     SI (numero%2 == 0) ENTONCES
    1. 2. 1.         par = par + 1
  1. 3.     SINO 
    1. 3. 1.         impar = impar + 1
  1. 4.     FIN SI
2. FIN PARA
3. Escribir (par)
4. Escribir (impar)
5. FIN

**NOTA 425:** para este problema se reuso la logica del ejercicio 4.2.2 con un ligero ajuste del algoritmo para que en vez de que escribiera un mensaje, contara dependiendo el caso; el algortimo codificado en *Java* se encuentra en el archivo llamado *Ej5.java*

Ahora se analizan y se resuelven los problemas planteados en la seccion **5** de la practica:

5. 1. Realizar el programa del inciso _3_ en la seccion **4.2** de la practica, pero con la estructura de control **switch** (seleccion multiple).
* El algoritmo paera resolver dicho problema es el siguiente:

1. MIENTRAS (calificacion != "FIN") 
  1. 1.     Ingresar Calificacion
  1. 2.     OPCION (calificacion) ELEGIR
  1. 2. 1.     Caso "NA":
    1. 2. 1. 1.       suma = suma + 5
    1. 2. 1. 2.       contador = contador + 1
  1. 2. 2.     Caso "S":
    1. 2. 2. 1.       suma = suma + 6
    1. 2. 2. 2.       contador = contador + 1
  1. 2. 3.     Caso "B":
    1. 2. 3. 1.       suma = suma + 8.7
    1. 2. 3. 2.       contador = contador + 1
  1. 2. 4.     Caso "MB":
    1. 2. 4. 1.       suma = suma + 10
    1. 2. 4. 2.       contador = contador + 1
  1. 2. 5.     Por defecto:
    1. 2. 5. 1.        No se recibio ningun valor valido para el sistema
  1. 3.     FIN OPCION
2. FIN MIENTRAS
3. SI (contador == 0) ENTONCES
  3. 1.     El programa termino sin recibir valores
  3. 2.     Ir al paso 6
4. SINO
  4. 1.     promedio = suma / contador
  4. 2.     Escribir (promedio)
5. FIN SI
6. FIN

**NOTA 51:** para el caso de usar **switch** con _Strings_ o cadenas de texto, se debe ser muy especifico tanto para definir los casos o cada _case_ correspondiente, asi como la respuesta esperada, se debe tener cuidado y ser muy claro ya que la estructura de control **switch** es sensible a mayusculas y minusculas y la respuesta debe ser escrita exactamente igual a la cadena de texto especificada en cada _case_; el algortimo codificado en *Java* se encuentra en el archivo llamado *Cinco_uno.java*

5. 2. Calcular el promedio de los numeros positivos ingresados por el usuario y en caso de ingresar un numero negativo, el programa finalizara y dara el resultado en pantalla.
* Para ello se siguen las instrucciones del algortimo que es:

1.  MIENTRAS (numero >= 0)
  1. 1.   Ingresa un numero
  1. 2.   SI (numero >= 0) ENTONCES
    1. 2. 1.    suma = suma + numero
    1. 2. 2.    contador = contador + 1
  1. 3.   FIN SI
2.  FIN MIENTRAS
3.  SI (contador == 0) ENTONCES
  3. 1.   No se recibio ningun valor positivo, finaliza el programa en 0´s
  3. 2.   Ir al paso 6
4.  SINO
  4. 1.   promedio = suma / contador
  4. 2.   Escribir (promedio)
5.  FIN SI
6.  FIN

**NOTA 52:** el algortimo codificado en *Java* se encuentra en el archivo llamado *Cinco_dos.java*

5. 3. Un programa que solicita 3 longitudes reales y te indicara si se puede formar un triangulo con ella o no, en base al criterio de _si la longitud de cualquiera de los 3 lados es mayor a la suma de los otros 2_.
* El algortimo quedaria escrito de la siguiente manera:

1.  PARA (i=0; i<3; i++) HACER
  1. 1.     OPCION (i) ELEGIR
  1. 1. 1.      Caso 0:
  1. 1. 1. 1.       leer (lado_uno)
  1. 1. 2.      Caso 1:
  1. 1. 2. 1.       leer (lado_dos)
  1. 1. 3.      Caso 0:
  1. 1. 3. 1.       leer (lado_tres)
  1. 2.     FIN OPCION    
2.  FIN PARA
3.  Mayor = (lado_uno > (lado_dos + lado_tres))
4.  SI (Mayor == false) ENTONCES
  4. 1.   Mayor = (lado_dos > (lado_uno + lado_tres))
5.  FIN SI
6.  SI (Mayor == false) ENTONCES
  6. 1.   Mayor = (lado_tres > (lado_uno + lado_dos))
7.  FIN SI
8.  SI (Mayor == false) ENTONCES
  8. 1.   No se puede formar un triangulo con esas medidas
9.  SINO
  9. 1.   Si se puede formar un triangulo con esas medidas
10. FIN SI
11. FIN

**NOTA 53:** en este caso se compara un lado con la suma de los otros 2, uno por uno para verificar que se puede construir el triangulo con las medidas ingresadas y al final si no se puede, esto te lo indicara en pantalla; el algortimo codificado en *Java* se encuentra en el archivo llamado *Cinco_tres.java*

5. 4. Un programa que dado un numero mayor que 1 y proporcionado por el usuario, indique si el numero es primo o no, para saberlo el residuo de la division sera la clave, donde si el residuo de del numero "n" entre [ _2, ... n-1_ ] debe ser diferente de 0, si es 0 en alguno de los casos, el numero no es primo.
* El algoritmo solucion seria:

1. HACER
  1. 1.   Solicitar un numero
  1. 2.   SI (numero < 2) ENTONCES
    1. 2. 1.  El numero no es valido, intentelo de nuevo
    1. 2. 2.  repetir = true
  1. 3.   SINO
    1. 3. 1.  repetir = false
    1. 3. 2.  PARA (i=2;i < numero;i++) HACER
      1. 3. 2. 1.   residuo = numero%i
      1. 3. 2. 2.   SI (residuo == 0) ENTONCES
      1. 3. 2. 2. 1.  El numero no es primo
      1. 3. 2. 2. 2.  break
      1. 3. 2. 3.   FIN SI
    1. 3. 3.  FIN PARA
  1. 4.   FIN SI
2.  MIENTRAS (repetir == true)
3.  SI (residuo != 0) ENTONCES
  3. 1.   El numero es primo
4.  FIN SI
5. FIN

**NOTA 54:** en este caso la forma mas idonea de corroborar si un numero es primo es usando la estructura de control **for** con un numero _inicial_ igual a 2 y un limite final de _n - 1_ o _numeroIngresado - 1_ y mediante el residuo, si el residuo es 0, el ciclo se rompe y te lo indica en la pantalla, pero si durante el ciclo nunca arroja como residuo 0, el ciclo finaliza y te indica que el numero es primo; el algortimo codificado en *Java* se encuentra en el archivo llamado *Cinco_cuatro.java*

5. 5. Determinar el n-esimo numero Fibonacci de un numero "n" dado por el usuario, cumpliendo las siguientes restricciones:
* _fn = (n-1) + (n-2) para n>=2_
* _Y por definicion: f(0)=0 y f(1)=1_.
* El algoritmo para resolver este problema es:

1.  HACER
  1. 1. Ingresa un numero
  1. 2.   SI (numero < 0) ENTONCES
    1. 2. 1.  Este numero no es valido para el sistema, intentelo de nuevo
  1. 3.   SINO
    1. 3. 1.  OPCION (numero) HACER
      1. 3. 1. 1.   Caso 0:
        1. 3. 1. 1. 1.  fn = 0
        1. 3. 1. 1. 2.  escribir(fn)
      1. 3. 1. 2.   Caso 1:
        1. 3. 1. 2. 1.  fn = 1
        1. 3. 1. 2. 2.  escribir(fn)
      1. 3. 1. 3.   Por defecto:
        1. 3. 1. 3. 1.  fn = (numero-1) + (numero-2)
        1. 3. 1. 3. 2.  escribir(fn)
    1. 3. 2.  FIN OPCION
  1. 4.   FIN SI
2.  MIENTRAS (numero < 0)
3. FIN

**NOTA 55:** el algortimo codificado en *Java* se encuentra en el archivo llamado *Cinco_cinco.java*

5. 6. Mostrar los primeros "n" numeros de Padovan de un "n" numero dado por el usuario, siguiendo las reglas:
* _pn = (n-2) + (n-3) para n>=3_
* _Y por definicion: p(0)=1, p(1)=1, p(2)=1_.
* El algoritmo para resolver este problema es:

1. HACER
  1. 1.   Ingresa un numero
  1. 2.   SI (numero < 0) ENTONCES
    1. 2. 1.  Este numero no es valido para el sistema, intentelo de nuevo
  1. 3.   SINO
    1. 3. 1.  OPCION (numero) HACER
      1. 3. 1. 1.   Caso 0:
        1. 3. 1. 1. 1.  pn = 1
        1. 3. 1. 1. 2.  escribir(pn)
      1. 3. 1. 2.   Caso 1:
        1. 3. 1. 2. 1.  pn = 1
        1. 3. 1. 2. 2.  escribir(pn)
      1. 3. 1. 2.   Caso 2:
        1. 3. 1. 2. 1.  pn = 1
        1. 3. 1. 2. 2.  escribir(pn)
      1. 3. 1. 3.   Por defecto:
        1. 3. 1. 3. 1.  pn = (numero-2) + (numero-3)
        1. 3. 1. 3. 2.  escribir(fn)
    1. 3. 2.  FIN OPCION
  1. 4.   FIN SI
2. MIENTRAS (numero < 0)
3. FIN

**NOTA 56:** el algortimo codificado en *Java* se encuentra en el archivo llamado *Cinco_seis.java*

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
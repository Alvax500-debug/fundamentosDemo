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

* Los ejercicios que se realizaron fuera de clase son los siguientes, en algunos fue necesario hacer investigacion adicional para poder resolver estos ejercicios:

6. Determinar el area de un circulo (ejercicio **4.2** de la practica **2**)

7. Contar cuantos numeros pares e impares hay en 10 numeros ingresados por el usuario (ejercicio **4.2.5** de la practica **3**)

8. Calcular la suma de los primeros _"n"_ numeros naturales utilizando la formula **suma=(n*(n+1))/2** (ejercicio **4.3** de la practica **2**)

9. De _"n"_ numeros dados por el usuario indicar cual es el mayor y cual es el menor. Tanto _"n"_ como los numeros son dados por el usuario (modificacion del ejercicio **4.2.4** de la practica **3**)

10. Para poder determinar el _Maximo Común Divisor (MCD)_ de 2 numeros (A,B) usando el algortimo de **Euclides** y con las condiciones plateadas en el ejercicio, era necesario investigar, el algoritmo de **Euclides** indica lo siguiente:
* _Si A = 0 entonces MCD(A,B)=B, ya que el MCD(0,B)=B, y podemos detenernos._ 
* _Si B = 0 entonces MCD(A,B)=A, ya que el MCD(A,0)=A, y podemos detenernos._
* _Escribe A en la forma cociente y residuo (A = B * Q + R)._
* _Encuentra MCD(B,R) al usar el algoritmo de Euclides, ya que MCD(A,B) = MCD(B,R)._

* Siguiendo estas reglas del algoritmo se puede generar la siguiente solucion:

1. HACER
  1. 1.     HACER
    1. 1. 1.    Ingresa el valor de a
    1. 1. 2.    SI a < 0 ENTONCES
      1. 1. 2. 1.   Valor no permitido, intentelo de nuevo
    1. 1. 3.    FIN SI
  1. 2.     MIENTRAS a < 0
  1. 3.     HACER
    1. 3. 1.    Ingresa el valor de b
    1. 3. 2.    SI b < 0 ENTONCES
      1. 3. 2. 1.   Valor no permitido, intentelo de nuevo
    1. 3. 3.    FIN SI
  1. 4.     MIENTRAS b < 0
  1. 5.     SI a < b ENTONCES
    1. 5. 1.    a debe ser mayor que b, intentelo de nuevo
  1. 6.     FIN SI
2. MIENTRAS a < b
3. HACER
  3. 1.     MCD(a,b)
  3. 2.     q = (Entero)a/b
  3. 3.     r = a%b
  3. 4.     Escribir(a, "=", b, "*", q, "+", r)
  3. 5.     a = b
  3. 6.     b = r
4. MIENTRAS r > 0
5. MCD(a,b)
6. SI a != 0 ENTONCES
  6. 1.     El MCD de ambos numeros es a
7. SINO
  7. 1.     SI b != 0 ENTONCES
    7. 1. 1.    El MCD de ambos numeros es b
  7. 2.     SINO
    7. 2. 1.    Ocurrio un error inesperado
  7. 3.     FIN SI
8. FIN SI
9. FIN

**NOTA 10:** para no perder el hilo del ejemplo que segui de la fuente _https://es.khanacademy.org/computing/computer-science/cryptography/modarithmetic/a/the-euclidean-algorithm_, fue necesario imprimir cada ciclo de acuerdo a la nomenclatura previamente descrita. 


11. El programa que determina si un numero es **perfecto** o no, aunque el propio ejercicio indicaba las condiciones que debia cumpliar un numero para ser **perfecto** realice una investigacion adicional para tener ejemplos mas claros de numeros perfectos.

* El algoritmo que se utiliza para resolver este problema es:

1. HACER
  1. 1.     Ingresa un numero para verificar si es perfecto
  1. 2.     SI num < 2 ENTONCES
    1. 2. 1.    Valor no valido, intentelo de nuevo
  1. 3.     FIN SI
2. MIENTRAS num < 2
3. PARA (i = 1; i < (num-1); i++) HACER
  3. 1.     SI num%i==0 ENTONCES
    3. 1. 1.    suma = suma + i
  3. 2.     FIN SI
4. FIN PARA
5. SI suma == num ENTONCES
  5. 1. El numero es perfecto
6. SINO
  6. 1. El numero no es perfecto
7. FIN SI
8. FIN

**NOTA 11:** con base en la pagina _https://matematicascercanas.com/2015/03/04/numeros-perfectos/_, utilice algunos de estos ejemplos para verificar la funcionalidad de mi algoritmo.

12. Encontrar los primeros 6 numeros **perfectos**, con base en el ejercicio anterior, ahora se deben mostrar en pantalla los 6 primeros numeros perfectos.

* Los ajustes al algoritmo quedan de la siguiente manera:

1. num = 2, contador = 0, suma = 0
2. MIENTRAS contador < 6
  2. 1.     PARA (i = 1; i < (num-1); i++) HACER
    2. 1. 1.         SI num%i==0 ENTONCES
      2. 1. 1. 1.        suma = suma + i
    2. 1. 2.         FIN SI
  2. 2.     FIN PARA
  2. 3.     SI suma == num ENTONCES
    2. 3. 1.    contador = contador + 1
    2. 3. 2.    OPCION (contador) ELEGIR
        2. 3. 2. 1.      Caso 1:
        2. 3. 2. 1. 1.       El primer numero perfecto es, num
        2. 3. 2. 2.      Caso 2:
        2. 3. 2. 2. 1.       El segundo numero perfecto es, num
        2. 3. 2. 3.      Caso 3:
        2. 3. 2. 3. 1.       El tercer numero perfecto es, num
        2. 3. 2. 4.      Caso 4:
        2. 3. 2. 4. 1.       El cuarto numero perfecto es, num
        2. 3. 2. 5.      Caso 5:
        2. 3. 2. 5. 1.       El quinto numero perfecto es, num
        2. 3. 2. 6.      Caso 6:
        2. 3. 2. 6. 1.       El sexto numero perfecto es, num
    2. 3. 3.     FIN OPCION
  2. 4.     FIN SI
  2. 5.     num = num + 1
  2. 6.     suma = 0
3. FIN MIENTRAS
4. FIN

**NOTA 12:** de la misma fuente mencionada en la **NOTA 11** se tomo la referencia de las primeros 6 numeros **perfectos** para comprobar que el sistema funcionaba de forma correcta.

##                        Resultados

En este caso todos los ejercicios fueron resueltos correctamente y se pudieron realizar, todos bajo el nombre de _Ejx_, un archivo de cada tipo por ejercicio y algunos de los ejercicios mas destacables de esta practica son:

10. Ya que el algoritmo de **Euclides** es nuevo para mi tuve que seguir casi al pie de la letra el ejemplo de la fuente citada en la **NOTA 10**, ya que a pesar de ser algo sencillo, el ejemplo me confundia, hasta que resolviendo el problema lo fui entendiendo, sin embargo deje la logica usada intacta para el _diagrama de flujo_, el _pseudocodigo_ y el _codigo fuente_ en java, ya que era mas sencillo para mi el comprenderlo de esa manera y siento que es mas claro asi.

11. Los numeros **perfectos** era algo bastante comprensible, sin embargo solo venia uno en la redaccion del ejercicio, opte por investigar para tener mas ejemplos de estos numeros y fue mas facil de esa forma revisar que el algoritmo funcionaba, basandome en los numeros que indicaba la fuente de la **NOTA 11** en lugar de revisarlos yo mismo, uno por uno.

12. Aqui hay una ligera diferencia entre el _pseudocodigo_ y el _codigo fuente_ es el tipo de dato utilizado y de nuevo como referencia se uso la funte citada en la **NOTA 11**.

##                        Discusion

Algunas comparaciones que se pueden hacer es con los ejercicios **12** y **13**, mas que nada en las diferencias existentes entre los _pseudocodigos_ y los _codigos fuentes_, debido a las limitaciones del perfil usado para _PSeInt_ comparado con el lenguaje _Java_:

12. Ya que por las abismales dimensiones del 5to y 6to numeros **perfectos** opte por usar el tipo _long_ en lugar de _int_ en _Java_

13. Aqui la comparacion que se hace es que el _pseudocodigo_ se tuvo que realizar con variables y switch para _char_ en lugar de _String_ como en _Java_

Fuera de esos ejercicios, los demas tanto el _diagrama de flujo_ como el _pseudocodigo_ y el _codigo fuente_ quedaron practicamente iguales, excepto por los ciclos _for_ ya que para estos en el _pseudocodigo_, la variable que fungia como contador debia ser declara desde antes y fuera de este.

##                        Conclusion

Al final, despues de un par de ejercicios se hizo mas facil e intuitivo el uso del software _PSeInt_, ademas de aprender las diferentes limitaciones del perfil usado comparados con _Java_ y la forma de expresar nuestros algoritmos en varias formas, llevarlo de algoritmo a _diagrama de flujo_ o _pseudocodigo_ y posteriormente a _codigo fuente_ en _Java_.
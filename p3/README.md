#                    Reporte Practica 3

##                      Resumen 

Esta practica consistio en repasar y mejorar nuestro dominio sobre las estructuras basicas de control en java (bucles y estructuras selectivas) con ejemplos y unos ejercicios realizados durante la sesion, asi como tambien ir mejorando nuestra manera de resolver problemas mediante el desarrollo y codificacion de algoritmos en lenguaje Java, ya conociendo y usando todas las herramientas basicas que el mismo lenguaje ofrece.

##                      Desarrollo

Comenzamos con el inciso 4, la seccion 4.1 donde se dio un repaso de todas las estructuras de control basicas de Java, todo en el archivo _principal.java_, posteriormente en el inciso 4.2 se resolvieron unos ejercicios usando las estructuras de control ya vistas para comprender mejor su uso en la practica, los ejercicios son los siguientes:

421. Programa que te pregunta si estas registrado y te saludo si lo estas, en caso contrario, te solicita ingresar tu nombre y posteriormente te saluda, el algoritmo seguido fue el siguiente:

1. Preguntar si el usuario esta registrado
2. SI (respuesta == no) ENTONCES
21.     Preguntar nombre del usuario
22.     Saludar al usuario
3. SINO
31.     Saludar al usuario
4. FIN SI
5. FIN 

**NOTA 421:** en java para determinar si el contenido de una variable de tipo _String (objetos)_ es igual a una cadena de texto determinada, se usa un metodo llamado _equals()_ y determina si ambas cadenas de texto coinciden regresando un dato _boolean_

422. Programa que dira si el numero ingresado por el usuario es par o impar, el algoritmo es el siguiente

1. Solicitar un numero
2. SI (numero%2 == 0) ENTONCES
21.     El numero es par
3. SINO 
31.     El numero es impar
4. FIN SI
5. FIN

**NOTA 422:** para determinar facilmente si un numero es par o no en java es mediante el residuo de la division de un numero entre 2, si el residuo es exactamente igual a 0, entonces el numero es par SINO es impar

423. Programa que determina el promedio de un alumno mediante sus calificaciones que se tomaran atraves de las siguientes letras:
_MB =  10_
_B = 8.7_
_s = 6_
_NA = 5_
Y una ves que se introduzca la palabra _FIN_ se detendra el programa, el algoritmo a seguir es el siguiente:

1. MIENTRAS (calificacion != "FIN") HACER
11.     Ingresar Calificacion
12.     SI (calificacion == "NA") ENTONCES
121.        suma = suma + 5
122.        contador = contador + 1
13.     FIN SI
14.     SI (calificacion == "S") ENTONCES
141.        suma = suma + 6
142.        contador = contador + 1
15.     FIN SI
16.     SI (calificacion == "B") ENTONCES
161.        suma = suma + 8.7
162.        contador = contador + 1
17.     FIN SI
18.     SI (calificacion == "MB") ENTONCES
181.        suma = suma + 10
182.        contador = contador + 1
19.     FIN SI
2. FIN MIENTRAS
3. SI (contador == 0) ENTONCES
31.     El programa termino sin recibir valores
32.     Ir al paso 6
4. SINO
41.     promedio = suma / contador
42.     Escribir (promedio)
5. FIN SI
6. FIN

**NOTA 423:** en este caso se uso igualmente el metodo _equals()_ de los objetos de tipo _String_ junto con la _negacion (!)_ para cambiar el resultado del metodo antes mencionado y asi verificar la adecuada ejecucion del ciclo MIENTRAS bajo la condicion de termino con la palabra "FIN"

424. Programa que determinara el mayor de todos los numeros positivos ingresados por el usuario y una vez que se ingrese un numero negativo, el programa terminara y mostrara en pantalla el mayor de todos los numeros ingresados, el algortimo a seguir fue:

1. MIENTRAS (numero >= 0) HACER
11.     Ingrese un numero
12.     SI (numero > mayor) ENTONCES
121.        mayor = numero
13.     FIN SI
2. FIN MIENTRAS
3. Escribir (mayor)
4. FIN

**NOTA 424:**

425. Realizar un programa que ingreados 10 numeros por el usuario, contar los numeros pares e impares y al final mostrara el conteo de cada uno, el algortimo usado para resolver el problema es el siguiente:

1. PARA (i=0; i<10; i++) HACER
11.     Ingresa un numero
12.      SI (numero%2 == 0) ENTONCES
121.         par = par + 1
13.      SINO 
131.         impar = impar + 1
14.      FIN SI
2. FIN PARA
3. Escribir (par)
4. Escribir (impar)
5. FIN

**NOTA 425:** para este problema se reuso la logica del ejercicio 4.2.1 con un ligero ajuste del algoritmo para que en vez de que escribiera un mensaje, contara dependiendo el caso

##                        Conclusion


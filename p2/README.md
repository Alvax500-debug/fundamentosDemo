#                    Reporte Practica 2

##                      Resumen 

Se profundizo acerca del lenguaje de programacion java, por ejemplo sobre las variables y su uso, las instrucciones de asignacion, lectura y escritura, asi como algunos tipos de operadores (logicos y arimeticos) y su precedencia y comportamientos, ademas de algunos ejercicios bastante practicos e interasantes de programacion en java, algunos de los cuales se detallarana mas adelante. 

##                      Desarrollo

Empezando se vio de manera practica lo basico referente al lenguaje de programacion java y como se comportaba ya una vez compilado y ejecutado, todo incluido en la clase _principal.java_, posteriormente realizamos un par de ejercicios durante la sesion de practica, primeramente se realizo el programa para calcular la velocidad de un objeto en base a la distancia recorrida y el tiempo ocupado para dicho desplazamiento (4.1), mas tarde fue el programa que determinaba cual numero era mayor de 3 numeros dados por el usuario(4.5).

Por parte del resto de la practica:

42. Determinar el area de un circulo de radio r, donde r es introducido por el usuario, para ello primero recordar la formula ```a = PI * r^2```, entonces los pasos a seguir fueron:

1. leer (r)
2. r2 <- r * r
3. area <- r2 * PI(Usando la clase Math de java)
4. escribir (area)

43. Calcular la suma de los primeros "n" numeros naturales usando la formula ```suma = (n * (n + 1) / 2)```, realizando el siguiente algoritmo se logro concretar el programa con exito:

1. leer (n)
2. n_plus <- n + 1
3. suma <- (n * n_plus) / 2
4. escribir (suma)

44. Calcular la distancia entre 2 puntos con la formula ```d = sqrt ((x2 - x1)^2 + (y2 - y1)^2)```, donde las x´s y las y´s son las coordenadas de los puntos, para ello  se siguio el siguiente algoritmo:

1. leer (x1)
2. leer (y1)
3. leer (x2)
4. leer (y2)
5. restax <- x2 - x1
6. restax <- restax * restax
7. restay <- y2 - y1
8. restay <- restay * restay
9. d <- restax + restay
10. SI (d >= 0) ENTONCES // Como consideracion especial hay que decir que matematicamente no existen raices de numeros negativos en el conjunto de los realies
101. d <- sqrt(d)
102. escribir (d)
11. SINO
111. escribir ("Error al obtener la raiz cuadrada de un numero negativo")
12. FIN SINO

45. El mayor de 3 numeros dados por el usuario, este ejercicio se comenzo a realizar durante la clase, pero a falta de tiempo cada quien debia resolverlo a su manera, el algoritmo que yo enconntre era algo complejo, por ende tratare de resumirlo lo mayor posible, cabe destacar que aqui el mayor desafio era si se introducia 2 numeros iguales y mayores que el tercero o que los 3 fueran el mismo numero,resumire mi algoritmo a continuacion:

1. leer (uno)
2. leer (dos)
3. leer (tres)
4. SI (uno > dos && uno != dos) ENTONCES
41. mayor_1 <- true, mayor_2 <- false
5. SINO
51. SI (uno >= dos) ENTONCES
511. mayor_1 <- true, mayor_2 <- true
52. SINO
521. mayor_1 <- false, mayor_2 <- true
53. FIN SINO
6. FIN SINO
7. SI (uno > tres && uno != tres) ENTONCES
71. mayor_1 <- true, mayor_3 <- false
8. SINO
81. SI (uno >= tres) ENTONCES
811. mayor_1 <- true, mayor_3 <- true
82. SINO
821. mayor_1 <- false, mayor_3 <- true
83. FIN SINO
9. FIN SINO
10. SI (dos > tres && dos != tres) ENTONCES
101. mayor_2 <- true, mayor_3 <- false
11. SINO
111. SI (dos >= tres) ENTONCES
1111. mayor_2 <- true, mayor_3 <- true
112. SINO
1121. mayor_2 <- false, mayor_3 <- true
113. FIN SINO
12. FIN SINO
13. //Consideraciones adicionales para numeros iguales
14. //Comparar evaluaciones para determinar al numero mayor

46. Resolver una ecuacion de segundo grado, para lo cual fue necesario ocupar la formula general: ````x = (-b +/- sqrt((b^2 - 4ac)))/2a```, entonces se obtienen los 2 posibles valores de x para resolver la ecuacion, el algoritmo quedo de la siguiente manera:

1. leer (a)
2. leer (b)
3. leer (c)
4. factor_cuadrado <- (b * b) - (4 * a * c)
5. SI (factor_cuadrado >= 0 && a != 0) ENTONCES //Consideracion especial de la raiz cuadrada de numeros negativos, mencionada arriba y tambien evitar la division entre 0 ya que en java eso provoca un error
51. factor_cuadrado <- sqrt(factor_cuadrado)
52. x1 <- ((-1 * b) - factor_cuadrado) / (2 * a)
53. x2 <- ((-1 * b) + factor_cuadrado) / (2 * a)
54. escribir (x1)
55. escribir (x2)
6. SINO
61. escribir ("Error detectado en division por 0 o posible raiz negativa")
7. FIN SINO


##                        Conclusion

Esta practica ayudo sobre todo a desarrollar la parte de diseño e implementacion de un algoritmo, asi como mejorar la parte de codificar el algoritmo y ser capaz de deúrar nuestros propios errores
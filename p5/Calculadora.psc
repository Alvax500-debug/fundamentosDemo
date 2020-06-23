Proceso Calculadora
	Definir a,b,res,n Como Real;
	Definir op Como Entero;
	Repetir
		Escribir 'Menu \n1)Sumar \n2)Restar \n3)Multiplicar \n4)Dividir \n5)Salir \nElige una opcion:';
		Leer op;
		Si op>0 Y op<5 Entonces
			n <- leerNumero;
			a <- n;
			n <- leerNumero;
			b <- n;
		FinSi
		Segun op  Hacer
			1:
				res <- sumar(a,b);
				imprimeResultado(res);
			2:
				res <- restar(a,b);
				imprimeResultado(res);
			3:
				res <- multiplicar(a,b);
				imprimeResultado(res);
			4:
				res <- dividir(a,b);
				imprimeResultado(res);
			5:
				Escribir 'Adios';
			De Otro Modo:
				Escribir 'Lo sentimos, ingresaste un valor no valido, intentalo de nuevo';
		FinSegun
	Hasta Que op=5
	Escribir 'Apagando Calculadora';
FinProceso

SubProceso n <- leerNumero
	Definir n Como Real;
	n <- 0;
	Mientras n=0 Hacer
		Leer n;
	FinMientras
FinSubProceso

SubProceso imprimeResultado (res)
	Escribir 'El resultado es ',res;
FinSubProceso

SubProceso res <- sumar (a,b)
	Definir res Como Real;
	res <- a+b;
FinSubProceso

SubProceso res <- restar (a,b)
	Definir res Como Real;
	res <- a-b;
FinSubProceso

SubProceso res <- multiplicar (a,b)
	Definir res Como Real;
	res <- a*b;
FinSubProceso

SubProceso res <- dividir (a,b)
	Definir res Como Real;
	res <- a/b;
FinSubProceso

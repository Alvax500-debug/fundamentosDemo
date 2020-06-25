Proceso Calculadora
	Definir a,b,res,n Como Real;
	Definir op Como Entero;
	Repetir
		Escribir 'Menu: ';
		Escribir '1)Sumar';
		Escribir '2)Restar';
		Escribir '3)Multiplicar';
		Escribir '4)Dividir';
		Escribir '5)Factorial';
		Escribir '6)Combinatoria';
		Escribir '7)Funcion Exponencial, Exp(x), e^x';
		Escribir '8)Salir';
		Escribir 'Elige una opcion:';
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
				n <- leerNumero;
				a <- n;
				res <- factorial(a);
				imprimeResultado(res);
			6:
				Repetir
					n <- leerNumero;
					a <- n;
					n <- leerNumero;
					b <- n;
				Hasta Que b<a
				res <- combinatoria(a,b);
				Escribir res;
				imprimeResultado(res);
			7:
				n <- leerNumero;
				a <- n;
				res <- exponencial(a);
				imprimeResultado(res);
			8:
				Escribir 'Adios';
			De Otro Modo:
				Escribir 'Lo sentimos, ingresaste un valor no valido, intentalo de nuevo';
		FinSegun
	Hasta Que op=8
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

SubProceso res <- factorial (a)
	Definir res Como Real;
	Definir contador Como Entero;
	res <- a;
	Para contador<-a Hasta 2 Con Paso -1 Hacer
		res <- res*(contador-1);
	FinPara
FinSubProceso

SubProceso res <- combinatoria (a,b)
	Definir res,n,k Como Real;
	n <- factorial(a);
	Escribir 'N = ',n;
	k <- factorial(b);
	Escribir 'K = ',k;
	res <- (n/(k*factorial((a-b))));
FinSubProceso

SubProceso res <- exponencial (a)
	Definir res Como Real;
	res <- 1;
	Definir i,n,x Como Entero;
	n <- 50;
	Para i<-1 Hasta n Hacer
		x <- a^i;
		res <- res+(x/factorial(i));
	FinPara
	Escribir 'La aproximacion es ',res;
FinSubProceso

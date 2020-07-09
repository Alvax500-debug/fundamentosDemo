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
		Escribir '8)Aproximacion Seno(x)';
		Escribir '9)Salir';
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
			8:
				n <- leerNumero;
				a <- n;
				aproximacionSeno(a);
			9:
				Escribir 'Adios';
			De Otro Modo:
				Escribir 'Lo sentimos, ingresaste un valor no valido, intentalo de nuevo';
		FinSegun
	Hasta Que op=9
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
	Si a>2 Entonces
		Para contador<-a Hasta 2 Con Paso -1 Hacer
			res <- res*(contador-1);
		FinPara
	FinSi
FinSubProceso

SubProceso res <- combinatoria (a,b)
	Definir res,n,k Como Real;
	n <- factorial(a);
	k <- factorial(b);
	res <- (n/(k*factorial((a-b))));
FinSubProceso

SubProceso res <- exponencial (a)
	Definir res,x Como Real;
	res <- 1;
	Definir i,n Como Entero;
	n <- 50;
	Para i<-1 Hasta n Hacer
		x <- (a^i);
		res <- res+(x/factorial(i));
	FinPara
	Escribir 'El resultado es un valor aproximado a ',res;
FinSubProceso

SubProceso aproximacionSeno (a)
	Definir res,cociente,fc,n1,n2,p1,p2 Como Real;
	res <- a;
	Definir n,i Como Entero;
	n <- 74;
	Para i<-1 Hasta n Hacer
		fc <- ((2*i)+1);
		n1 <- (-1^i);
		n2 <- (a^fc);
		cociente <- factorial(fc);
		p1 <- n1*n2;
		p2 <- p1/cociente;
		res <- res+p2;
	FinPara
	Escribir 'La aproximacion de sen(',a,') es ',res;
FinSubProceso

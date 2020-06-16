Proceso Ej10
	Definir a,b,q,r Como Entero;
	Repetir
		Repetir
			Leer a;
			Si a<=0 Entonces
				Escribir 'Valor no permitido, intentalo de nuevo';
			FinSi
		Hasta Que a>0
		Repetir
			Leer b;
			Si b<=0 Entonces
				Escribir 'Valor no permitido, intentalo de nuevo';
			FinSi
		Hasta Que b>0
		Si a<b Entonces
			Escribir 'a debe ser mayor que b, intentalo de nuevo';
		FinSi
	Hasta Que a>b
	Repetir
		Escribir 'MCD(A,B)';
		Escribir 'MCD(',a,',',b,')';
		q <- trunc(a/b);
		r <- a MOD b;
		Escribir 'A = B * Q + R';
		Escribir a,' = ',b,' * ',q,' + ',r;
		a <- b;
		b <- r;
	Hasta Que r=0
	Escribir 'MCD(A,B)';
	Escribir 'MCD(',a,',',b,')';
	Si a!=0 Entonces
		Escribir 'El MCD de ambos numeros es ',a;
	SiNo
		Si b!=0 Entonces
			Escribir 'EL MCD de ambos numeros es ',b;
		SiNo
			Escribir 'Ocurrio un error inesperado';
		FinSi
	FinSi
FinProceso

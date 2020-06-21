Proceso Ej11
	Definir num,suma,divisor Como Entero;
	suma <- 0;
	Repetir
		Leer num;
		Si num<2 Entonces
			Escribir 'Valor no valido, intentelo de nuevo';
		FinSi
	Hasta Que num>1
	Para divisor<-1 Hasta num-1 Hacer
		Si num MOD divisor=0 Entonces
			suma <- suma+divisor;
		FinSi
	FinPara
	Si suma=num Entonces
		Escribir 'El numero ',num,' es pefecto';
	SiNo
		Escribir 'El numero ',num,' no es perfecto';
	FinSi
FinProceso

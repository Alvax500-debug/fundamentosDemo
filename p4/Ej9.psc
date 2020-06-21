Proceso Ej9
	Definir num,mayo,meno Como Real;
	mayo <- 0;
	meno <- 1000;
	Definir n,i Como Entero;
	Leer n;
	Para i<-1 Hasta n Hacer
		Leer num;
		Si num>mayo Entonces
			mayo <- num;
		FinSi
		Si num<meno Entonces
			meno <- num;
		FinSi
	FinPara
	Escribir 'El mayor numero de todos fue ',mayo;
	Escribir 'El menor numero de todos fue ',meno;
FinProceso

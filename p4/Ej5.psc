Proceso Ej5
	Definir n,num,suma,contador,i Como Entero;
	contador <- 0;
	suma <- 0;
	Definir promedio Como Real;
	Leer n;
	Para i<-1 Hasta n Hacer
		Leer num;
		suma <- suma+num;
		contador <- contador+1;
	FinPara
	promedio <- suma/contador;
	Escribir 'El promedio es: ',promedio;
FinProceso

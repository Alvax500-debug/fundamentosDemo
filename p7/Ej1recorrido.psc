Proceso Ej1recorrido
	Definir arr,arr2,arr3 Como Entero;
	Definir i,fil,col,pla Como Entero;
	Dimension arr[10];
	Dimension arr2[2,3];
	Dimension arr3[3,3,2];
	Escribir '1 Dimension';
	Para i<-0 Hasta 9 Hacer
		arr[i] <- i;
		Escribir arr[i];
	FinPara
	Escribir '2 Dimensiones';
	Para fil<-0 Hasta 1 Hacer
		Para col<-0 Hasta 2 Hacer
			arr2[fil,col]<-fil+col;
			Escribir arr2[fil,col];
		FinPara
	FinPara
	Escribir '3 Dimensiones';
	Para pla<-0 Hasta 1 Hacer
		Para fil<-0 Hasta 2 Hacer
			Para col<-0 Hasta 2 Hacer
				arr3[fil,col,pla]<-fil+3+pla;
				Escribir arr3[fil,col,pla];
			FinPara
		FinPara
	FinPara
FinProceso

Proceso Ej2Busqueda
	Definir n,x,ind Como Entero;
	Definir esta Como Logico;
	n <- 50;
	Definir arr Como Entero;
	Dimension arr[50];
	Para ind<-0 Hasta n-1 Hacer
		arr[ind] <- azar(100);
	FinPara
	Para ind<-0 Hasta n-1 Hacer
		Escribir arr[ind],' ';
	FinPara
	Escribir 'Ingresa un numero para buscarlo';
	Leer x;
	esta <- falso;
	Para ind<-0 Hasta n-1 Hacer
		Si arr[ind]=x Entonces
			// Aqui se deberia de poner un break,
			// a falta de dicha instruccion, se optara por otra soluxion
			esta <- Verdadero;
		FinSi
	FinPara
	Escribir 'Esta: ',esta;
FinProceso

Proceso Ej3Ordenacion
	Definir arr,arrOrd Como Entero;
	Definir n,r Como Entero;
	n <- 50;
	r <- 99;
	Dimension arr[50];
	Dimension arrOrd[50];
	arr <- generArreglo(n,r);
	imprimirArreglo(n,arr);
	arrOrd <- ordenArreglo(n,arr);
	imprimirArreglo(n,arrOrd);
FinProceso

SubProceso arre <- generArreglo(n,r)
	Definir arre Como Entero;
	Definir ind Como Entero;
	Dimension arre[50];
	Para ind<-0 Hasta n-1 Hacer
		arre[ind] <- 1+azar(r);
	FinPara
FinSubProceso

SubProceso imprimirArreglo(n,arr)
	Definir ind Como Entero;
	Para ind<-0 Hasta n-1 Hacer
		Escribir arr[ind];
	FinPara
FinSubProceso

SubProceso aux <- ordenArreglo(n,arr)
	Definir aux Como Entero;
	Definir x,p,ind,i Como Entero;
	p <- 0;
	Dimension aux[50];
	Para ind<-0 Hasta n-1 Hacer
		x <- arr[ind];
		Para i<-0 Hasta n-1 Hacer
			Si arr[i]>=x Entonces
				x <- arr[i];
				p <- i;
			FinSi
		FinPara
		aux[ind] <- x;
		arr[p] <- 0;
	FinPara
FinSubProceso

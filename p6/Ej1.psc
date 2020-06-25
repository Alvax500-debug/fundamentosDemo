Proceso Ej1
	Definir a,b,c,n,precio,at,ar,areaT Como Real;
	Repetir
		n <- leerNumero;
		a <- n;
		n <- leerNumero;
		b <- n;
		n <- leerNumero;
		c <- n;
		Si a<=c Entonces
			Escribir 'Lo sentimos alguna medida no es admitida en el sistema (a o c), intentelo nuevamente';
		FinSi
	Hasta Que a>c
	at <- areaTri(a,b,c);
	ar <- areaRec(b,c);
	areaT <- areaTotal(ar,at);
	n <- leerNumero;
	precio <- n;
	precioTerreno(precio,areaT);
FinProceso

SubProceso n <- leerNumero
	Definir n Como Real;
	n <- 0;
	Mientras n<=0 Hacer
		Leer n;
		Si n<=0 Entonces
			Escribir 'Lo sentimos ingresaste un valor no valido, intetalo de nuevo';
		FinSi
	FinMientras
FinSubProceso

SubProceso at <- areaTri (a,b,c)
	Definir at,recorte Como Real;
	recorte <- a-c;
	at <- (b*recorte)/2;
FinSubProceso

SubProceso ar <- areaRec (b,c)
	Definir ar Como Real;
	ar <- b*c;
FinSubProceso

SubProceso areaT <- areaTotal (ar,at)
	Definir areaT Como Real;
	areaT <- ar+at;
	Escribir 'El area total del terreno es ',areaT,'m2';
FinSubProceso

SubProceso precioTerreno (precio,areaT)
	Definir pt Como Real;
	pt <- precio*areaT;
	Escribir 'El valor del terreno es $',pt;
FinSubProceso

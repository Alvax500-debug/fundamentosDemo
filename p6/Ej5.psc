Proceso Ej5
	Definir N,CN,V,T1,T2,T3,TT Como Real;
	Definir A,B,C Como Entero;
	A <- 0;
	B <- 0;
	C <- 0;
	N <- 0;
	CN <- 0;
	V <- 0;
	T1 <- 0;
	T2 <- 0;
	T3 <- 0;
	TT <- 0;
	Escribir 'Ingrese la cantidad de ventas realizadas al dia de hoy: ';
	Leer N;
	Mientras CN<N Hacer
		Repetir
			Escribir 'Ingrese el monto de cada venta:';
			Leer V;
			Si V<1 Entonces
				Escribir 'Valor no admitido, intentelo de nuevo';
			FinSi
		Hasta Que V>=1
		TT <- TT+V;
		CN <- CN+1;
		Si V>=1 Y V<=500 Entonces
			C <- C+1;
			T3 <- T3+V;
		FinSi
		Si V>500 Y V<=1000 Entonces
			B <- B+1;
			T2 <- T2+V;
		FinSi
		Si V>1000 Entonces
			A <- A+1;
			T1 <- T1+V;
		FinSi
	FinMientras
	Escribir 'Muy bien, repasando, tus ventas totales del dia de hoy fueron ',CN;
	Escribir 'El monto global de todas ellas fue $',TT;
	Escribir 'Y por categorias, los resultados son los siguientes:';
	Escribir 'Del Tipo A tu ventas fueron ',A,' y el monto correspondiente es de $',T1;
	Escribir 'Del Tipo B tu ventas fueron ',B,' y el monto correspondiente es de $',T2;
	Escribir 'Del Tipo C tu ventas fueron ',C,' y el monto correspondiente es de $',T3;
FinProceso

Proceso Ej4
	Definir AH,CA Como Real;
	CA <- 0;
	Definir M Como Entero;
	M <- 1;
	Mientras M<13 Hacer
		Repetir
			Escribir 'Ingrese la cantidad que desea ahorrar este mes ',M;
			Leer AH;
			Si AH<1 Entonces
				Escribir 'Valor no admitido para el sistema, intentelo de nuevo';
			FinSi
		Hasta Que AH>1
		CA <- CA+AH;
		Si M>=2 Entonces
			Escribir 'El promedio de ahorro mensual hasta ahora es de $',CA/M;
		FinSi
		M <- M+1;
	FinMientras
	Escribir 'El ahorro total al finalizar este año es de $',CA;
FinProceso

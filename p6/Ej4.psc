Proceso Ej4
	Definir AH Como Real;
	AH <- 0;
	Definir M,CA Como Entero;
	M <- 1;
	Mientras M<13 Hacer
		Repetir
			Escribir 'Ingrese la cantidad que desea ahorrar este mes ',M;
			Leer CA;
			Si CA<1 Entonces
				Escribir 'Valor no admitido para el sistema, intentelo de nuevo';
			FinSi
		Hasta Que CA>1
		AH <- AH+CA;
		Si M>=2 Entonces
			Escribir 'El promedio de ahorro mensual hasta ahora es de $',AH/M;
		FinSi
		M <- M+1;
	FinMientras
	Escribir 'El ahorro total al finalizar este año es de $',AH;
FinProceso

Proceso Ej13
	Definir calificacion Como Caracter;
	calificacion <- 'a';
	Definir suma,promedio Como Real;
	suma <- 0;
	Definir contador Como Entero;
	contador <- 0;
	Mientras calificacion!='F' Hacer
		Leer calificacion;
		Segun calificacion  Hacer
			'N':
				suma <- suma+5;
				contador <- contador+1;
			'S':
				suma <- suma+6;
				contador <- contador+1;
			'B':
				suma <- suma+8.7;
				contador <- contador+1;
			'M':
				suma <- suma+10;
				contador <- contador+1;
			De Otro Modo:
				Escribir 'Ingreso un valor no valido para el sistema';
		FinSegun
	FinMientras
	Si contador=0 Entonces
		Escribir 'No has escrito nada';
	SiNo
		promedio <- suma/contador;
		Escribir 'Tu promedio es: ',promedio;
	FinSi
FinProceso

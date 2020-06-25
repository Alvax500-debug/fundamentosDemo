Proceso Ej2
	Definir TI,TP Como Caracter;
	Definir N Como Entero;
	Definir PA,CA,TO,TOT Como Real;
	Escribir 'Bienvenido al Naufrago Satisfecho';
	Repetir
		Escribir 'Que tipo de hamburguesa desea ordenar hoy? s)Sencilla d)Doble t)Triple';
		Leer TI;
		Segun TI  Hacer
			's':
				PA <- 20;
			'd':
				PA <- 25;
			't':
				PA <- 28;
			De Otro Modo:
				Escribir 'Ese valor no es valido para el sistema, intentelo de nuevo';
		FinSegun
	Hasta Que TI='s' O TI='d' O TI='t'
	Escribir 'Cuantas hamburguesas desea ordenar';
	Leer N;
	TO <- PA*N;
	Escribir 'El total de su compra seria $',TO;
	Repetir
		Escribir '¿Cual seria la forma de pago?';
		Leer TP;
		Segun TP  Hacer
			'c':
				Escribir 'Se realiza un cargo extra del 5% al pagar con tarjeta de credito';
				CA <- TO*0.05;
				TOT <- TO+CA;
				Escribir 'Ahora el total con todo y el cargo es de $',TOT;
				Escribir 'Imprimiendo ticket';
			'd':
				Escribir 'Imprimiendo ticket';
			'e':
				Escribir 'Imprimiendo ticket';
			De Otro Modo:
				Escribir 'Ese valor no es valido para el sistema, intentelo de nuevo';
		FinSegun
	Hasta Que TP='c' O TP='d' O TP='e'
	Escribir 'Que tenga un buen dia y gracias por su preferencia';
FinProceso

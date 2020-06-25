Proceso Ej3
	Definir TT,tar,CT,respuesta_cliente,i Como Entero;
	TT <- 1;
	Definir LA,AC,NC Como Real;
	Escribir 'El cliente es candidato a un aumento en su limite de credito';
	Escribir 'Solicite al cliente la cantidad de tarjetas de credito que maneja';
	Leer CT;
	Repetir
		Escribir 'El cliente indica en que tipo de tarjeta desea aumentar su credito';
		Escribir 'Respuestas 1)Si 2)No';
		Leer respuesta_cliente;
		Si respuesta_cliente<0 O respuesta_cliente>3 Entonces
			Escribir 'Respuesta no aceptada, intentelo de nuevo';
		FinSi
	Hasta Que respuesta_cliente>0 Y respuesta_cliente<3
	Si respuesta_cliente=1 Entonces
		Escribir 'Tipo de tarjeta a aumentar el limite';
		Leer TT;
		Escribir 'Solicite el limite de credito actual del cliente con la tarjeta de tipo ',TT;
		Leer LA;
	SiNo
		Para i<-1 Hasta CT Hacer
			Escribir 'Solicitar el tipo de tarjeta';
			Leer tar;
			Si tar>TT Entonces
				TT <- tar;
			FinSi
		FinPara
		Escribir 'Solicite el limite de credito actual del cliente con la tarjeta de tipo ',TT;
		Leer LA;
	FinSi
	Segun TT  Hacer
		1:
			AC <- LA*0.25;
			NC <- AC+LA;
		2:
			AC <- LA*0.35;
			NC <- AC+LA;
		3:
			AC <- LA*0.40;
			NC <- AC+LA;
		De Otro Modo:
			AC <- LA*0.50;
			NC <- AC+LA;
	FinSegun
	Escribir 'Informele al cliente que su nuevo limite de credito es $',NC,' para la tarjeta de tipo ',TT;
FinProceso

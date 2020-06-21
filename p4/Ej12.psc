Proceso Ej12
	Definir num,divisor,suma,contador Como Entero;
	num <- 2;
	suma <- 0;
	contador <- 0;
	Escribir 'Los primeros 6 numeros perfectos: ';
	Mientras contador<6 Hacer
		Para divisor<-1 Hasta num-1 Hacer
			Si num MOD divisor=0 Entonces
				suma <- suma+divisor;
			FinSi
		FinPara
		Si suma=num Entonces
			contador <- contador+1;
			Segun contador  Hacer
				1:
					Escribir 'El primero es ',num;
				2:
					Escribir 'El segundo es ',num;
				3:
					Escribir 'El tercero es ',num;
				4:
					Escribir 'El cuarto es ',num;
				5:
					Escribir 'El quinto es ',num;
				6:
					Escribir 'Y finalmente el sexto es ',num;
			FinSegun
		FinSi
		num <- num+1;
		suma <- 0;
	FinMientras
FinProceso

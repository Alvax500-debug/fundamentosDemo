Proceso Ej7
	Definir num,cpar,cimpar,i Como Entero;
	cpar <- 0;
	cimpar <- 0;
	Para i<-1 Hasta 10 Hacer
		Leer num;
		Si num MOD 2=0 Entonces
			cpar <- cpar+1;
		SiNo
			cimpar <- cimpar+1;
		FinSi
	FinPara
	Escribir 'Los numeros pares totales fueron: ',cpar;
	Escribir 'Los numeros impares totales fueron: ',cimpar;
FinProceso

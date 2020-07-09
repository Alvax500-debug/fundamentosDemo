Proceso Ej2
	Definir C,T,N,i,j,k Como Entero;
	Definir VE,VT,VC,VG Como Real;
	VE <- 0;
	VT <- 0;
	VC <- 0;
	VG <- 0;
	Repetir
		Escribir 'Ingrese la cantidad de ciudades que cuentan con nuestras sucursales';
		Leer C;
		Si C<=0 Entonces
			Escribir 'Valor innadmisible, intentelo de nuevo';
		FinSi
	Hasta Que C>0
	Para i<-1 Hasta C Hacer
		Escribir "---------------------------------";
		Repetir
			Escribir 'Ingrese la cantidad de tiendas en la ciudad ',i;
			Leer T;
			Si T<=0 Entonces
				Escribir 'Valor innadmisible, intentelo de nuevo';
			FinSi
		Hasta Que T>0
		Para j<-1 Hasta T Hacer
			Escribir "**********************";
			Repetir
				Escribir 'Ingrese la cantidad de empleados de la tienda ',j;
				Leer N;
				Si N<=0 Entonces
					Escribir 'Valor innadmisible, intentelo de nuevo';
				FinSi
			Hasta Que N>0
			Para k<-1 Hasta N Hacer
				Escribir "Ingrese la cantidad vendida por el empleado ", k;
				Leer VE;
				VT <- VT + VE;
			FinPara
			Escribir "Las ventas de la tienda ",j," de la ciudad ",i," son:$",VT;
			VC <- VC + VT;
			VT <- 0;
		FinPara
		Escribir "Las ventas de la ciudad ",i," son:$",VC;
		VG <- VG + VC;
		VC <- 0;
	FinPara
	Escribir "Las Ventas Generales de hoy fueron:$",VG;
FinProceso

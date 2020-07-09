Proceso Ej1
	Definir R,H,A,ac,at,AF Como Real;
	Repetir
		Escribir 'Para la medida R ';
		R <- leerNumero;
		Escribir 'Para la medida H ';
		H <- leerNumero;
		Si R>H Entonces
			Escribir 'Lo sentimos, R>H no es admitible para el sistema, intentelo de nuevo';
		FinSi
	Hasta Que H>R
	A <- altura(R,H);
	at <- areaTri(R,A);
	ac <- areaCir(R);
	AF <- at+ac;
	Escribir 'El area total de la figura es de ',AF;
FinProceso

SubProceso n <- leerNumero
	Definir n Como Real;
	Repetir
		Escribir 'Ingrese un valor:';
		Leer n;
		Si n=0 Entonces
			Escribir 'Lo sentimos, el 0 no es un valor valido para el sistema, intentelo de nuevo';
		FinSi
	Hasta Que n<>0
FinSubProceso

SubProceso res <- altura (R,H)
	Definir res Como Real;
	// Para determinar la altura de un triangulo recatngulo, la formula seria:
	// altura=raiz(H^2 - R^2)
	res <- rc((H^2-R^2));
FinSubProceso

SubProceso res <- areaTri (R,A)
	Definir res Como Real;
	res <- (R*A)/2;
	// Ya que son 2 triangulos iguales
	// El resultado se duplica antes de retornarlo
	res <- res*2;
FinSubProceso

SubProceso res <- areaCir (R)
	Definir res Como Real;
	res <- PI*(R^2);
	// Ya que solo se considera la mitad de la circuferencia
	// El resultado final se divide a la mitad antes de retornarlo
	res <- res/2;
FinSubProceso

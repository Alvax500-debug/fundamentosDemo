Proceso Ej4gato
	Definir tablero Como Caracter;
	Dimension tablero[3,3];
	Definir tiro Como Entero;
	Dimension tiro[2];
	Definir fallida,detener Como Logico;
	Definir i Como Entero;
	iniciaTablero(tablero);
	dibujaTablero(tablero);
	Para i<-0 Hasta 8 Hacer
		Si (i MOD 2)=0 Entonces
			Repetir
				juegaUsuario(tiro);
				fallida <- actualizaTablero(tiro,tablero,'X');
			Hasta Que fallida
		SiNo
			Repetir
				juegaCPU(tiro);
				fallida <- actualizaTablero(tiro,tablero,'O');
			Hasta Que fallida
		FinSi
		detener <- analiza(tablero);
		dibujaTablero(tablero);
		Si detener Entonces
			i <- 8;
		FinSi
	FinPara
FinProceso

SubProceso parar <- analiza(tablero)
	Definir jugador Como Caracter;
	jugador <- ' ';
	Definir parar Como Logico;
	parar <- Falso;
	Definir i Como Entero;
	Para i<-0 Hasta 2 Hacer
		Si (tablero[i,0]=tablero[i,1]) Y (tablero[i,0]=tablero[i,2]) Y (tablero[i,1]=tablero[i,2]) Entonces
			Si (tablero[i,0]<>' ') Y (tablero[i,1]<>' ') Y (tablero[i,2]<>' ') Entonces
				Escribir 'La fila coincide';
				jugador <- tablero[i,0];
				parar <- verdadero;
			FinSi
		FinSi
		Si (tablero[0,i]=tablero[1,i]) Y (tablero[0,i]=tablero[2,i]) Y (tablero[1,i]=tablero[2,i]) Entonces
			Si (tablero[0,i]<>' ') Y (tablero[1,i]<>' ') Y (tablero[2,i]<>' ') Entonces
				Escribir 'La columna coincide';
				jugador <- tablero[0,i];
				parar <- verdadero;
			FinSi
		FinSi
	FinPara
	Si (tablero[0,0]=tablero[1,1]) Y (tablero[0,0]=tablero[2,2]) Y (tablero[1,1]=tablero[2,2]) Entonces
		Si (tablero[0,0]<>' ') Y (tablero[1,1]<>' ') Y (tablero[2,2]<>' ') Entonces
			Escribir 'La diagonal I-D coincide';
			jugador <- tablero[0,0];
			parar <- verdadero;
		FinSi
	FinSi
	Si (tablero[0,2]=tablero[1,1]) Y (tablero[0,2]=tablero[2,0]) Y (tablero[1,1]=tablero[2,0]) Entonces
		Si (tablero[0,2]<>' ') Y (tablero[1,1]<>' ') Y (tablero[2,0]<>' ') Entonces
			Escribir 'La diagonal D-I coincide';
			jugador <- tablero[0,2];
			parar <- verdadero;
		FinSi
	FinSi
	Segun jugador  Hacer
		'X':
			Escribir 'El ganador es P1';
		'O':
			Escribir 'El ganador es CPU';
	FinSegun
FinSubProceso

SubProceso juegaCPU(tiro)
	tiro[0] <- azar(2);
	tiro[1] <- azar(2);
FinSubProceso

SubProceso jugada <- actualizaTablero(tiro,tablero,c)
	Definir jugada Como Logico;
	jugada <- Falso;
	Si tablero[tiro[0],tiro[1]]=' ' Entonces
		tablero[tiro[0],tiro[1]]<-c;
		jugada <- verdadero;
	FinSi
FinSubProceso

SubProceso juegaUsuario(tiro)
	
FinSubProceso

SubProceso dibujaTablero(tablero)
	
FinSubProceso

SubProceso iniciaTablero(tablero)
	
FinSubProceso

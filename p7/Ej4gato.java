import java.util.Scanner;

public class Ej4gato{

    static char tablero[][] = new char[3][3];

    public static void main(String[] args) {

        int tiro[] = new int[2];
        boolean fallida, detener;
        
        iniciaTablero();
        dibujaTablero();

        for (int i = 0; i < 9; i++) {

            if (i%2 == 0) {

                //Turno del jugador
                do {
                    juegaUsuario(tiro);
                    fallida = actualizaTablero(tiro,'X');
                    //System.out.println("Jugada de P1 fallida? "+ fallida);
                } while (fallida);
                
            } else {

                //Turno de CPU
                do {
                    juegaCPU(tiro);
                    fallida = actualizaTablero(tiro,'O');
                    //System.out.println("Jugada del CPU fallida? "+ fallida);
                } while (fallida);
                
            }       
                        
            detener = analiza();
            dibujaTablero();

            if (detener) {
                break;
            }
            
        }

        //analiza();
        //dibujaTablero();

    }

    public static boolean analiza(){

        char jugador = ' ';
        boolean parar = false;

        for (int i = 0; i < 3; i++) {
            
            //Comparar filas
            if ( (tablero[i][0] == tablero[i][1]) && (tablero[i][0]==tablero[i][2]) && (tablero[i][1]==tablero[i][2]) ) {
                if ( (tablero[i][0]!=' ')&&(tablero[i][1]!=' ')&&(tablero[i][2]!=' ') ) {
                    System.out.println("La fila coincide");
                    jugador = tablero[i][0];
                    parar = true;
                }
                
            }

            //Comparar columnas
            if ( (tablero[0][i] == tablero[1][i]) && (tablero[0][i]==tablero[2][i]) && (tablero[1][i]==tablero[2][i]) ) {
                if ( (tablero[0][i]!=' ')&&(tablero[1][i]!=' ')&&(tablero[2][i]!=' ') ) {
                    System.out.println("La columna coincide");
                    jugador = tablero[0][i];
                    parar = true;
                }
                
            }
            
        }

        //Comparar Diagonal I-D
        if ( (tablero[0][0] == tablero[1][1]) && (tablero[0][0]==tablero[2][2]) && (tablero[1][1]==tablero[2][2]) ) {
            if ( (tablero[0][0]!=' ')&&(tablero[1][1]!=' ')&&(tablero[2][2]!=' ') ) {
                System.out.println("La diagonal I-D coincide");
                jugador = tablero[0][0];
                parar = true;
            }
            
        }

        //Comparar Diagonal D-I
        if ( (tablero[0][2] == tablero[1][1]) && (tablero[0][2]==tablero[2][0]) && (tablero[1][1]==tablero[2][0]) ) {
            if ( (tablero[0][2]!=' ')&&(tablero[1][1]!=' ')&&(tablero[2][0]!=' ') ) {
                System.out.println("La diagonal D-I coincide");
                jugador = tablero[0][2];
                parar = true;
            }
            
        }

        switch (jugador) {
            case 'X':
                System.out.println("El ganador es P1");
                break;

            case 'O':
                System.out.println("El ganador es CPU");
                break;
        
            default:
                break;
        }

        return parar;

    }

    public static void juegaCPU(int tiro[]){
        //tiro[0]=0;
        //tiro[1]=0;
        //generar fila y columna aleatorias, localidades descupadas.

        tiro[0] = (int)(Math.random()*3);
        tiro[1] = (int)(Math.random()*3);
    }

    public static boolean actualizaTablero(int tiro[],char c){
        
        boolean jugada = true;
        
        if (tablero[tiro[0]][tiro[1]] == ' ') {

            tablero[tiro[0]][tiro[1]] = c;
            jugada = false;
            
        }/*else{
            System.out.println("El espacio "+tiro[0]+","+tiro[1]+" ya esta ocupado");
            jugada = true;
        }*/

        return jugada;
        
    }

    public static void juegaUsuario(int tiro[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Turno del usuario, Juega con X:");
        System.out.print("fil: ");
        tiro[0] = sc.nextInt();
        System.out.print("col: ");
        tiro[1] = sc.nextInt();

        //sc.close();
    }

    public static void dibujaTablero(){
        System.out.println("     c0   c1   c2 ");
        System.out.println("        |    |    ");
        System.out.println("f0   "+tablero[0][0]+"  | "+tablero[0][1]+"  | "+tablero[0][2]);
        System.out.println("    ____|____|____");
        System.out.println("        |    |    ");
        System.out.println("f1   "+tablero[1][0]+"  | "+tablero[1][1]+"  | "+tablero[1][2]);
        System.out.println("    ____|____|____");
        System.out.println("        |    |    ");
        System.out.println("f2   "+tablero[2][0]+"  | "+tablero[2][1]+"  | "+tablero[2][2]);
        System.out.println("        |    |    ");
    }

    public static void iniciaTablero(){

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                tablero[i][j] = ' ';
            }
        }
    } 

}
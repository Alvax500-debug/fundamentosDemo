import java.util.Scanner;
import java.util.Random;

public class semana4{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Juego de piedra, papel o tijera");

        int totalMenos3%;

        String usrResp = " ", pcResp = " ";

        System.out.print("Escoge tu opcion (piedra, papel o tijera): ");

        usrResp = leer.nextLine();

    }

    public static String cpuAnswer(){
        int valor = 0;
        Random random = new Random();
        String answer = " ";

        valor = random.nextInt(2) + 1;

        switch(valor){
            case 1:
                break;

            case 2:
                break;

            case 3:
                break;

            default:
                break;
        }

    }

}
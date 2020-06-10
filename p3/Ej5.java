import java.util.Scanner;

public class Ej5{
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int numero = 0, par = 0, impar = 0;

        for(int i = 0; i<10; i++){

            System.out.print("Escribe un numero: ");

            numero = leer.nextInt();

            if (numero%2 == 0) {
                //System.out.println("El numero es par");
                par+=1;
            } else {
                //System.out.println("El numero es impar");
                impar+=1;
            }

        }

        System.out.println("El total de pares es: " + par);
        System.out.println("El total de impares es: " + impar);
        
    }
}
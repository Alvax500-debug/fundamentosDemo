import java.util.Scanner;

public class Ej4{
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int numero = 0, mayor = 0;

        while (numero >= 0) {
            System.out.print("\nIngresa un numero: ");
            numero = leer.nextInt();
            if (numero > mayor) {
                mayor = numero;
            }
        }

        System.out.println("El mayor numero que ingresaste fue: " + mayor);
        
    }
}
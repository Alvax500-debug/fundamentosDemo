import java.util.Scanner;

public class Ej2{
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double n1 = 0, n2 = 0;

        System.out.print("\nIngresa el primer numero:");
        n1 = leer.nextDouble();

        System.out.print("\nIngresa el segundo numero:");
        n2 = leer.nextDouble();

        if (n1 > n2) {
            System.out.println("\nEl mayor es el numero " + n1);
        } else {
            System.out.println("\nEl mayor es el numero " + n2);
        }
    }
}
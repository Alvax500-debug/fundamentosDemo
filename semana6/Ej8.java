import java.util.Scanner;

public class Ej8{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int n = 0, n_plus = 0, suma = 0;

        System.out.println("Calcular la suma de los primeros n numeros naturales");

        System.out.println("Ingresa la cantidad n de numeros a sumar: ");

        n = leer.nextInt();

        n_plus = n + 1;

        suma = (n * n_plus)/2; 

        System.out.println("La suma resultante es " + suma);

    }
}
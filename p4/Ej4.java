import java.util.Scanner;

public class Ej4{
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int contador = 0;

        double n1 = 0, n2 = 0, n3 = 0, suma = 0, promedio = 0;

        System.out.print("\nIngresa el primer numero:");
        n1 = leer.nextDouble();
        contador+=1;

        System.out.print("\nIngresa el segundo numero:");
        n2 = leer.nextDouble();
        contador+=1;

        System.out.print("\nIngresa el tercer numero:");
        n3 = leer.nextDouble();
        contador+=1;

        suma = n1 + n2 + n3;
        promedio = suma / contador;

        System.out.println("\nEl promedio es " + promedio);
    }
}
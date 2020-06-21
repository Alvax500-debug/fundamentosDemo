import java.util.Scanner;

public class Ej5{
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int contador = 0, numero = 0, suma = 0, n = 0;

        double promedio = 0;

        System.out.print("\nIngresa el maximo de numeros a promediar: ");
            n = leer.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("\nIngresa un numero: ");
            numero = leer.nextInt();
            if (numero >= 0) {
                suma += numero;
                contador += 1;
            }
        }

        promedio = suma/contador;
        System.out.println("\nEL promedio es: " + promedio);
        
        
    }
}
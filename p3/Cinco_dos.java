import java.util.Scanner;

public class Cinco_dos{
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int contador = 0;

        double numero = 0, suma = 0, promedio = 0;

        while (numero >= 0) {
            System.out.print("\nIngresa un numero: ");
            numero = leer.nextInt();
            if (numero >= 0) {
                suma += numero;
                contador += 1;
            }
        }

        if (contador == 0) {
            System.out.println("No has ingresado ningun valor positivo");
        } else {
            promedio = suma/contador;
            System.out.println("\nEL promedio es: " + promedio);
        }
        
    }
}
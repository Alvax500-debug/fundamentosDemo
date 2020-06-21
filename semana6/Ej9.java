import java.util.Scanner;

public class Ej9{
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int n = 0;

        double numero = 0, mayor = 0, menor = 1000;

        System.out.print("\nCuantos numeros deseas ingresar: ");
        n = leer.nextInt();

        for (int i = 1; i <= n;i++) {
            System.out.print("\nIngresa un numero: ");
            numero = leer.nextDouble();
            if (numero > mayor) {
                mayor = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("El mayor numero que ingresaste fue: " + mayor);
        System.out.println("El menor numero que ingresaste fue: " + menor);
        
    }
}
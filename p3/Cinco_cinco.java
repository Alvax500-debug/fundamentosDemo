import java.util.Scanner;

public class Cinco_cinco{
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int numero = 0, fn = 0;

        do {
            System.out.print("\nIngrese un numero entero positivo: ");
            numero = leer.nextInt();
            if (numero < 0) {
                System.out.println("\nEl numero no es valido, intentelo de nuevo");
            } else {
                switch (numero) {
                    case 0:
                        fn = 0;
                        System.out.println("\nEl numero de Fibonacci es " + fn);
                        break;
                    
                    case 1:
                        fn = 1;
                        System.out.println("\nEl numero de Fibonacci es " + fn);
                        break;
                
                    default:
                        fn = (numero-1) + (numero-2);
                        System.out.println("\nEl numero de Fibonacci es " + fn);
                        break;
                }
            }
            //System.out.println("\nSigo en el bucle grande COMPA");
        } while (numero < 0);

    }
}
import java.util.Scanner;

public class Cinco_cuatro{
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int numero = 0, residuo = 0;

        boolean repetir;

        do {
            System.out.print("\nIngrese un numero entero mayor a 2: ");
            numero = leer.nextInt();
            if (numero < 2) {
                System.out.println("\nEl numero no es valido, intentelo de nuevo");
                repetir = true;
            } else {
                repetir = false;
                for (int i = 2; i < numero; i++) {
                    residuo = numero % i;
                    if (residuo == 0) {
                        System.out.println("\nEl numero ingresado no es primo");
                        break;
                    }
                }
            }
            //System.out.println("\nSigo en el bucle grande COMPA");
        } while (repetir == true);

        if (residuo != 0) {
            System.out.println("\nEl numero ingresado es primo");
        }
        
    }
}
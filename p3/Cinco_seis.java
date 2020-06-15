import java.util.Scanner;

public class Cinco_seis{
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int numero = 0, pn = 0;

        do {
            System.out.print("\nIngrese un numero entero positivo: ");
            numero = leer.nextInt();
            if (numero < 0) {
                System.out.println("\nEl numero no es valido, intentelo de nuevo");
            } else {
                switch (numero) {
                    case 0:
                        pn = 1;
                        System.out.println("\nEl numero de Padovan es " + pn);
                        break;
                    
                    case 1:
                        pn = 1;
                        System.out.println("\nEl numero de Padovan es " + pn);
                        break;

                    case 2:
                        pn = 1;
                        System.out.println("\nEl numero de Padovan es " + pn);
                        break;
                
                    default:
                        pn = (numero-2) + (numero-3);
                        System.out.println("\nEl numero de Padovan es " + pn);
                        break;
                }
            }
            //System.out.println("\nSigo en el bucle grande COMPA");
        } while (numero < 0);

    }
}
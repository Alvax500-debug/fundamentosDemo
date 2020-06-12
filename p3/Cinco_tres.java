import java.util.Scanner;

public class Cinco_tres{
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double lado_uno = 0, lado_dos = 0, lado_tres = 0;

        boolean mayor;

        for (int i = 0; i < 3; i++) {
            
            switch (i) {
                case 0:
                    System.out.print("\nIngresa tu calificacion: ");
                    lado_uno = leer.nextDouble();
                    break;

                case 1:
                    System.out.print("\nIngresa tu calificacion: ");
                    lado_dos = leer.nextDouble();
                    break;

                case 2:
                    System.out.print("\nIngresa tu calificacion: ");
                    lado_tres = leer.nextDouble();
                    break;
            }

        }

        mayor = lado_uno > (lado_dos + lado_tres);

        if (mayor == false) {
            mayor = lado_dos > (lado_uno + lado_tres);
        }

        if (mayor == false) {
            mayor = lado_tres > (lado_uno + lado_dos);
        }

        if (mayor == false) {
            System.out.println("\nNo se puede formar un triangulo con esas medidas");
        } else {
            System.out.println("\nSi se puede formar un triangulo con esas medidas");
        }
        
    }
}
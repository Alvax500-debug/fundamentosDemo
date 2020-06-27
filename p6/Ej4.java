import java.util.Scanner;

public class Ej4{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double CA = 0, AH = 0;

        int M = 1;

        while (M < 13) {
            do {
                System.out.print("\nIngrese la cantidad que desea ahorrar este mes " + M + " :");
                AH = leer.nextDouble();
                if (AH < 1) {
                    System.out.println("\nValor no valido para el sistema, intentelo de nuevo");
                }
            } while (AH < 1);
            CA = CA + AH;
            if (M>=2) {
                System.out.println("\nEl promedio de ahorro mensual hasta ahora es de $" + (CA/M));
            }
            M+=1;
        }
        System.out.println("\nEl ahorro total al finalizar este año es de $" + CA);
    }
}
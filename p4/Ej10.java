import java.util.Scanner;

public class Ej10{
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        int a = 0, b = 0, q = 0, r = 0;

        int aOriginal = 0, bOriginal = 0;

        //Solicitar los valores a y b, este proceso termina hasta que a>b
        do {
            //Solicitando a, a>0
            do {
                System.out.print("\nIngresa el primer numero:");
                a = leer.nextInt();
                if (a<=0) {
                    System.out.println("\nValor no permitido para el sistema, intentalo de nuevo");
                }
            } while (a<=0);

            //Solicitando b, b>0
            do {
                System.out.print("\nIngresa el segundo numero:");
                b = leer.nextInt();
                if (b<=0) {
                    System.out.println("\nValor no permitido para el sistema, intentalo de nuevo");
                }
            } while (b<=0);

            //Verificar que a>b, pero sino, mandar la alerta de que se debe reintentar
            if (a<=b) {
                System.out.println("\na debe ser mayor que b, intentalo de nuevo");
            }

        } while (a<=b);

        //Las siguientes variables mantendran los valores originales de a y b

        aOriginal = a;
        bOriginal = b;

        //Continua con el proceso MCD, donde al final entre a y b alguno debe ser 0 y el MCD seria el otro valor
        do {
            System.out.println("\n----------------------------------------------------------------");
            System.out.println("\nMCD(A,B)");
            System.out.println("\nMCD(" + a + "," + b +")");

            q = a / b;
            r = a % b;

            System.out.println("\nA = B * Q + R");
            System.out.println("\n" + a + " = " + b + " * " + q + " + " + r);

            a = b;
            b = r;
            
        } while (r>0);

        System.out.println("\n***********************************************************************");
        System.out.println("\nMCD(A,B)");
        System.out.println("\nMCD(" + aOriginal + "," + bOriginal +")");

        if (a != 0) {
            System.out.println("\nEl MCD de ambos numeros es " + a);
        } else {
            if (b != 0) {
                System.out.println("\nEl MCD de ambos numeros es " + b);
            } else {
                System.out.println("\nOcurrio un error inesperado");
            }
        }
    }
}
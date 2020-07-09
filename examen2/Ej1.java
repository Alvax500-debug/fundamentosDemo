import java.util.Scanner;

public class Ej1{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double R, H, A, ac, at, AF;

        do {
            System.out.println("\nPara la medida R");
            R = leerNumero(leer);
            System.out.println("\nPara la medida H");
            H = leerNumero(leer);
            if (R>H) {
                System.out.println("\nLo sentimos, R>H no es admitible para el sistema, intentelo de nuevo");
            }
        } while (R>H);
        A = altura(R, H);
        at = areaTri(R, A);
        ac = areaCir(R);
        AF = at + ac;
        System.out.println("\nEl area total de la figura es de " + AF);
    }

    public static double leerNumero(Scanner leer) {
        double n;
        do {
            System.out.print("\nIngrese un valor:");
            n = leer.nextDouble();
            if (n==0) {
                System.out.println("\nLo sentimos, el 0 no es un valor valido para el sistema, intentelo de nuevo");
            }
        } while (n==0);
        return n;
    }

    public static double altura(double R, double H) {
        double a;
        // Para determinar la altura de un triangulo recatngulo, la formula seria:
        // altura=raiz(H^2 - R^2)
        a = Math.sqrt((Math.pow(H, 2) - Math.pow(R, 2)));
        return a;
    }

    public static double areaTri(double R, double A) {
        double r;
        r = (R * A)/2;
        // Ya que son 2 triangulos iguales
        // El resultado se duplica antes de retornarlo
        r = r * 2;
        return r;
    }

    public static double areaCir(double R) {
        double r;
        r = Math.PI * (Math.pow(R, 2));
        // Ya que solo se considera la mitad de la circuferencia
        // El resultado final se divide a la mitad antes de retornarlo
        r = r / 2;
        return r;
    }
}
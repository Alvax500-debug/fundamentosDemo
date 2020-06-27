import java.util.Scanner;

public class Ej5{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double N = 0, CN = 0, V = 0, T1 = 0, T2 = 0, T3 = 0, TT = 0;

        int A = 0, B = 0, C = 0;

        System.out.print("\nIngrese la cantidad de ventas realizadas al dia de hoy:");
        N = leer.nextDouble();

        while (CN < N) {
            do {
                System.out.print("\nIngrese el monto de cada venta:");
                V = leer.nextDouble();
                if (V < 1) {
                    System.out.println("\nValor no valido para el sistema, intentelo de nuevo");
                }
            } while (V < 1);

            TT = TT + V;
            CN = CN + 1;

            //Ventas Tipo C
            if (V>=1 && V<=500) {
                C = C + 1;
                T3 = T3 + V;
            }

            //Ventas Tipo B
            if (V>500 && V<=1000) {
                B = B + 1;
                T2 = T2 + V;
            }

            //Ventas Tipo A
            if (V>1000) {
                A = A + 1;
                T1 = T1 + V;
            }
        }

        System.out.println("\nMuy bien, repasando, tus ventas totales del dia de hoy fueron " + CN);
        System.out.println("\nEl monto global de todas ellas fue $" + TT);
        System.out.println("\nY por categorias, los resultados son los siguientes:");
        System.out.println("\nDel Tipo A tus ventas fueron " + A + " y el monto correspondiente es de $" + T1);
        System.out.println("\nDel Tipo B tus ventas fueron " + B + " y el monto correspondiente es de $" + T2);
        System.out.println("\nDel Tipo C tus ventas fueron " + C + " y el monto correspondiente es de $" + T3);

    }
}
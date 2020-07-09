import java.util.Scanner;

import org.omg.IOP.TAG_CODE_SETS;

public class Ej2{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int C, T, N;

        double VE = 0, VT = 0, VC = 0, VG = 0;

        do {
            System.out.print("\nIngrese la cantidad de ciudades que cuentan con nuestras sucursales:");
            C = leer.nextInt();
            if (C<=0) {
                System.out.println("\nValor inadmisible, intentelo de nuevo");
            }
        } while (C<=0);

        for (int i = 1; i <= C; i++) {
            System.out.println("\n----------------------------------------------------------");
            do {
                System.out.print("\nIngrese la cantidad de tiendas en la ciudad " + i + ":");
                T = leer.nextInt();
                if (T<=0) {
                    System.out.println("\nValor inadmisible, intentelo de nuevo");
                }
            } while (T<=0);

            for (int j = 1; j <= T; j++) {
                System.out.println("\n********************************************");
                do {
                    System.out.print("\nIngrese la cantidad de empleados de la tienda " + j + ":");
                    N = leer.nextInt();
                    if (N<=0) {
                        System.out.println("\nValor inadmisible, intentelo de nuevo");
                    }
                } while (N<=0);

                for (int k = 1; k <= N; k++) {
                   
                    System.out.print("\nIngrese la cantidad vendida por el empleado " + k + ":");
                    VE = leer.nextDouble();
                    VT = VT + VE;
                }

                System.out.println("\nLas ventas de la tienda "+j+" de la ciudad "+i+" son:$"+VT);
                VC = VC + VT;
                VT = 0;
            }

            System.out.println("\nLas ventas de la ciudad "+i+" son:$"+VC);
            VG = VG + VC;
            VC = 0;
        }
        System.out.println("\nLas Ventas Generales de hoy fueron:$"+VG);
    }
}
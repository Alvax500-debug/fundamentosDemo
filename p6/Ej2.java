import java.util.Scanner;

public class Ej2{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String TI, TP;

        int N = 0;

        double PA = 0, CA= 0, TO = 0, TOT = 0;

        boolean tipo_burger, tipo_pago;

        System.out.println("\nBienvenido al Naufrago Satisfecho ");

        do {
            System.out.println("\nQue tipo de hamburguesa desea ordenar hoy? \nsencilla \ndoble \ntriple");
            System.out.print("\nSu orden:");
            TI = leer.nextLine();
            switch (TI) {
                case "sencilla":
                    PA = 20;
                    tipo_burger = true;
                    break;

                case "doble":
                    PA = 25;
                    tipo_burger = true;
                    break;

                case "triple":
                    PA = 28;
                    tipo_burger = true;
                    break;
            
                default:
                    tipo_burger = false;
                    System.out.println("\nLo sentimos su orden no se encuentra en el menu, intentelo nuevamente");
                    break;
            }
        } while (tipo_burger == false);

        System.out.print("\nCuantas hamburguesas desea ordenar:");
        N = leer.nextInt();

        TO = PA * N;

        System.out.println("\nEl total de su compra seria $" + TO);

        do {
            System.out.println("\nCual seria su forma de pago? \nefectivo \ntjt_debito \ntjt_credito");
            System.out.print("\nForma de pago:");
            TP = leer.nextLine();
            switch (TP) {
                case "tjt_credito":
                    System.out.println("\nSe realiza un cargo extra del 5% al pagar con tarjeta de credito");
                    CA = TO * 0.05;
                    TOT = TO + CA;
                    System.out.println("\nAhora el total con todo y el cargo es de $" + TOT);
                    System.out.println("\nImprimiendo ticket");
                    tipo_pago = true;
                    break;

                case "tjt_debito":
                    System.out.println("\nImprimiendo ticket");
                    tipo_pago = true;
                    break;

                case "efectivo":
                    System.out.println("\nImprimiendo ticket");
                    tipo_pago = true;
                    break;
            
                default:
                    tipo_pago = false;
                    System.out.println("\nLo sentimos no aceptamos esa forma de pago, intentelo nuevamente");
                    break;
            }
        } while (tipo_pago == false);
        System.out.println("\nQue tenga un buen dia y gracias por su preferencia");
    }
}
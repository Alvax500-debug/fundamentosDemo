import java.util.Scanner;

public class Ej3{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int TT = 1, tar = 0, CT = 0, respuesta_cliente = 0;

        double LA = 0, AC = 0, NC = 0;

        System.out.println("\nEl cliente es candidato a un aumento en su limite de credito");
        System.out.print("\nSolicite al cliente la cantidad de tarjetas de credito que maneja con nosotros:");
        CT = leer.nextInt();

        do {
            System.out.println("\nEl cliente indica en que tipo de tarjeta desea aumentar su credito");
            System.out.print("\nRespuestas 1)Si 2)No:");
            respuesta_cliente = leer.nextInt();
            if (respuesta_cliente<1 || respuesta_cliente>2) {
                System.out.println("\nRespuesta no aceptada, intentelo de nuevo");
            }
        } while (respuesta_cliente<1 || respuesta_cliente>2);

        if (respuesta_cliente == 1) {
            System.out.print("\nTipo de tarjeta a aumentar el limite:");
            TT = leer.nextInt();
            System.out.print("\nSolicite el limite de credito actual del cliente con la tarjeta de tipo " + TT + " :");
            LA = leer.nextDouble();
        } else {
            for (int i = 0; i < CT; i++) {
                System.out.print("\nSolicitar el tipo de tarjeta:");
                tar = leer.nextInt();
                if (tar > TT) {
                    TT = tar;
                }
            }
            System.out.print("\nSolicite el limite de credito actual del cliente con la tarjeta de tipo " + TT + " :");
            LA = leer.nextDouble();
        }

        switch (TT) {
            case 1:
                AC = LA * 0.25;
                NC = AC + LA;
                break;

            case 2:
                AC = LA * 0.35;
                NC = AC + LA;
                break;

            case 3:
                AC = LA * 0.40;
                NC = AC + LA;
                break;
        
            default:
                AC = LA * 0.50;
                NC = AC + LA;
                break;
        }

        System.out.println("\nInformele al cliente que su nuevo limite de credito es $" + NC + " para la tarjeta de tipo " + TT);
    }
}
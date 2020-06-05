import java.util.Scanner;

public class Cinco_tres{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double c = 0;

        System.out.println("Sistema de calificacion");

        System.out.print("Ingrese la calificacion del alumno: ");

        c = leer.nextDouble();

        if (c >= 0 && c < 6) {
            System.out.println("La calificacion es NA");
        } else {
            if (c >=6 && c < 7.5) {
                System.out.println("La calificacion es B");
            } else {
                if (c >= 7.5 && c <= 10) {
                    System.out.println("La calificacion es MB");
                } else {
                    System.out.println("Calificacion no valida para el sistema, vuelva a intentarlo por favor");
                }
            }
        }
    }
}
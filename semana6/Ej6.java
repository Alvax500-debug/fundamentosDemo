import java.util.Scanner;

public class Ej6{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double r = 0, r2 = 0, area = 0;

        System.out.println("Calcular el Area de un circulo de radio r");

        System.out.println("Ingresa el radio del circulo: ");

        r = leer.nextDouble();

        r2 = r * r;

        area = r2 * Math.PI;

        System.out.println("El area de la circunferencia es " + area);
        
    }
}
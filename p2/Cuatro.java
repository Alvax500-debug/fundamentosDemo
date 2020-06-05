import java.util.Scanner;

public class Cuatro{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double d = 0, x1 = 0, y1 = 0, x2 = 0, y2 = 0, restax = 0, restay = 0;

        System.out.println("Calcular la distancia entre 2 puntos dadas sus coordenadas");

        System.out.println("Ingresa la coordenada x del primer punto");

        x1 = leer.nextDouble();

        System.out.println("Ingresa la coordenada y del primer punto");

        y1 = leer.nextDouble();

        System.out.println("Ingresa la coordenada x del segundo punto");

        x2 = leer.nextDouble();

        System.out.println("Ingresa la coordenada y del segundo punto");

        y2 = leer.nextDouble();

        restax = x2 - x1;
        restax = restax * restax;

        restay = y2 - y1;
        restay = restay * restay;

        d = restax + restay;

        if (d >= 0) {
            d = Math.sqrt(d);

            System.out.println("La distancia que hay entre ambos puntos es " + d);

        } else {
            
            System.out.println("Error al calcular la raiz cuadrada");

        }
        
    }
}
import java.util.Scanner;

public class Uno{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double distancia = 0, tiempo = 0, velocidad = 0;

        System.out.println("Obtener la velocidad en base a la distancia y el tiempo");

        System.out.println("Ingrese la distancia que ha recorrido el objeto: ");
        distancia = leer.nextDouble();

        System.out.println("Ingrese el tiempo que le tomo recorrer al objeto la distancia indicada: ");
        tiempo = leer.nextDouble();

        velocidad = distancia / tiempo;

        System.out.println("La velocidad promedio del recorrido del objeto es: "+velocidad);
    }
}
import java.util.Scanner;

public class GradosCF{
    public static void main(String[] args) {
        //Formula F = (C * (9/5)) + 32
        //Donde C es la temperatura en grados Celsius y F la temperatura en Fahrenheit
        System.out.println("\nPrograma de conversion de Celsius a Fahrenheit");

        //Nuevo objeto para la clase Scanner para leer datos desde teclado
        Scanner leer = new Scanner(System.in);

        //Comienza el programa
        System.out.print("\nIngresa la temperatura en Celsius que deseas convertir: ");

        double celsius = leer.nextDouble();

        //System.out.println(celsius);

        //NOTA: para operaciones con numeros decimales se debe hacer el cast o conversion al tipo de dato que deseas obtener, 
        //ya que la division entre enteros da como resultado otro entero
        double factorCF = (double)9/5;

        //System.out.println("\nEl factor de conversion C a F es "+factorCF);

        //System.out.println(parseFloat(9/5));

        double fahrenheit = 0;

        fahrenheit = (celsius * factorCF) + 32;

        System.out.println("\nLa conversion a fahrenheit es F="+fahrenheit);
    }
}
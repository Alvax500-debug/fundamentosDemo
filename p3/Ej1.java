import java.util.Scanner;

public class Ej1{
    public static void main(String[] args) {
        String nombre = "Alvaro";
        String respuesta = "";

        Scanner leer = new Scanner(System.in);

        System.out.println("¿Estas registrado? (si/no)");

        respuesta = leer.nextLine();

        if (respuesta.equals("no")) {
            System.out.print("Por favor ingresa tu nombre: ");
            nombre = leer.nextLine();
            System.out.println("Hola " + nombre);
        } else {
            System.out.println("Hola " + nombre);
        }
    }
}
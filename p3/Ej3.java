import java.util.Scanner;

public class Ej3{
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double suma = 0, contador = 0, promedio = 0;

        String calificacion = "";

        while (!calificacion.equals("FIN")) {
            System.out.print("\nIngresa tu calificacion: ");
            calificacion = leer.nextLine();

            if (calificacion.equals("NA")) {
                suma += 5;
                contador+=1;
            }

            if (calificacion.equals("S")) {
                suma += 6;
                contador+=1;
            }

            if (calificacion.equals("B")) {
                suma += 8.7;
                contador+=1;
            }

            if (calificacion.equals("MB")) {
                suma += 10;
                contador+=1;
            }

        }

        //System.out.println(contador);

        if (contador == 0) {
            System.out.println("No has escrito nada");
        } else {
            promedio = suma/contador;
            System.out.println("Tu promedio es: " + promedio);
        }
        
    }
}
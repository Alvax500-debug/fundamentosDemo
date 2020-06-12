import java.util.Scanner;

public class Cinco_uno{
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double suma = 0, contador = 0, promedio = 0;

        String calificacion = "";

        while (!calificacion.equals("FIN")) {
            System.out.print("\nIngresa tu calificacion: ");
            calificacion = leer.nextLine();

            switch (calificacion) {
                case "NA":
                    suma += 5;
                    contador+=1;
                    break;

                case "S":
                    suma += 6;
                    contador+=1;
                    break;

                case "B":
                    suma += 8.7;
                    contador+=1;
                    break;

                case "MB":
                    suma += 10;
                    contador+=1;
                    break;
            
                default:
                    System.out.println("No has escrito una calificacion valida para el sistema");
                    break;
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
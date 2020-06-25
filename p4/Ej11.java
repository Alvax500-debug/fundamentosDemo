import java.util.Scanner;

public class Ej11{
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int num = 0, suma = 0;

        //Recibiendo un valor de parte del usuario, no se aceptan valores menores a 2
        do {
            System.out.print("\nIngresa un numero:");
            num = leer.nextInt();

            if (num < 2) {
                System.out.println("\nValor no valido, intentelo de nuevo");
            }
        } while (num<2);

        //De acuerdo con la condicion de un numero perfecto:
        for (int i = 1; i < num; i++) {
            //Se deben sumar los divisores naturales del numero exceptuando al mismo, 
            //para que se sumen de forma correcta estos divisores, estos deben dar como residuo 0
            if (num%i == 0) {
                suma = suma + i;
            }
        }

        //Finalmente, el numero es perfecto si el numero ingresado es igual a la suma de sus respectivos divisores
        if (num == suma) {
            System.out.println("\nEl numero " + num + " es perfecto");
        } else {
            System.out.println("\nEl numero " + num + " no es perfecto");
        }
    }
}
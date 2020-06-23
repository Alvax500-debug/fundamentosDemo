import java.util.Scanner;

public class Ej12{
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int num = 2, suma = 0, contador = 0;

        System.out.println("\nLos primeros 6 numeros perfectos son: ");

        while (contador < 6) {
            //De acuerdo con la condicion de un numero perfecto:
            for (int i = 1; i <= num; i++) {
                //Se deben sumar los divisores naturales del numero exceptuando al mismo, 
                //para que se sumen de forma correcta estos divisores, estos deben dar como residuo 0
                if (num%i == 0) {
                    suma = suma + i;
                }
            }

            //Finalmente, el numero es perfecto si el numero ingresado es igual a la suma de sus respectivos divisores
            if (num == suma) {
                contador = contador + 1;
                System.out.println("\nEl contador es " + contador);
                switch (contador) {
                    case 1:
                        System.out.println("\nEl primer numero es " + num);
                        break;

                    case 2:
                        System.out.println("\nEl segundo numero es " + num);
                        break;

                    case 3:
                        System.out.println("\nEl tercer numero es " + num);
                        break;

                    case 4:
                        System.out.println("\nEl cuarto numero es " + num);
                        break;

                    case 5:
                        System.out.println("\nEl quinto numero es " + num);
                        break;

                    case 6:
                        System.out.println("\nEl sexto numero es " + num);
                        break;
                
                    default:
                        break;
                }
                
            }

            //System.out.println("\nEl numero es " + num); 

            num += 1;
            suma = 0;
        }

    }
}
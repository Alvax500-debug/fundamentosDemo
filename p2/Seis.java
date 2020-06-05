import java.util.Scanner;

public class Seis{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double a = 0, b = 0, c = 0, x1 = 0, x2 = 0, factor_cuadrado = 0;

        System.out.println("Formula general de ecuacion de segundo grado");

        System.out.print("Ingrese el valor del elemento a: ");

        a = leer.nextDouble();

        System.out.print("Ingrese el valor del elemento b: ");

        b = leer.nextDouble();

        System.out.print("Ingrese el valor del elemento c: ");

        c = leer.nextDouble();

        //La formula general de la ecuacion de segundo grado es la siguiente:
        //-b (+/-) raiz(b^2 - 4ac)/2a
        //y con ella se obtienen los 2 posibles valores de x para la ecuacion

        factor_cuadrado = (b * b) - (4 * a * c);

        //Las consideraciones especiales antes de continuar son las siguientes:
        //1) el resultado de (b^2 - 4ac) debe ser >= 0
        //2) el valor de a != 0
        //Para evitar cualquier error posible que pueda arrojar el programa por la logica matematica que se utiliza

        if (factor_cuadrado >= 0 && a != 0) {
            
            factor_cuadrado = Math.sqrt(factor_cuadrado);
            x1 = ((-1 * b) + factor_cuadrado) / (2 * a);
            x2 = ((-1 * b) - factor_cuadrado) / (2 * a);

            System.out.println("Los 2 posibles valores de x son respectivamente: ");
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);

        } else {

            System.out.println("Error en los valores ingresados, no es posible determinar la raiz de un numero < 0 ó la division entre 0, favor de corroborar los valores ingresados");
            
        }

        //System.out.println("El valor del factor cuadrado es " + factor_cuadrado);

    }
}
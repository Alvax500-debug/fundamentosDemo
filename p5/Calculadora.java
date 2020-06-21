import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int opcion = 0;

        double a = 0, b = 0, res = 0;

        do {
            System.out.println("\nHoli, que operacion deseas realizar");

            System.out.println("\n1)Suma \n2)Resta \n3)Multiplicacion \n4)Division \n5)Salir");

            System.out.print("\nOperacion: ");

            opcion = leer.nextInt();

            if (opcion > 0 && opcion < 5) {
                a = leerNumero(leer);
                b = leerNumero(leer);
            }

            switch (opcion) {
                case 1: //Suma
                    res = sumar(a,b);
                    imprimirResultado(res);
                    break;

                case 2: //Resta
                    res = restar(a,b);
                    imprimirResultado(res);
                    break;

                case 3: //Multiplicacion
                    res = multiplicar(a,b);
                    imprimirResultado(res);
                    break;

                case 4: //Division
                    res = dividir(a,b);
                    imprimirResultado(res);
                    break;

                case 5: //Despedida
                    System.out.println("\nAdios n.n");
                    break;
            
                default: //Error
                    System.out.println("\nOperacion no valida, intentelo de nuevo");
                    break;
            }
        } while (opcion != 5);

        System.out.println("\nApagando calculadora");

    }

    public static double leerNumero(Scanner sc){
        double n = 0;
        System.out.print("\nIngrese un valor:");
        n = sc.nextDouble();
        return n;
    }

    public static void imprimirResultado(double resultado){
        System.out.println("\nEl resultado es "+ resultado);
    }

    public static double sumar(double a, double b){
        double r;
        r = a + b;
        return r;
    }

    public static double restar(double a, double b){
        double r;
        r = a - b;
        return r;
    }

    public static double multiplicar(double a, double b){
        double r;
        r = a * b;
        return r;
    }

    public static double dividir(double a, double b){
        double r;
        r = a / b;
        return r;
    }
}
import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int opcion = 0;

        double a = 0, b = 0, res = 0;

        do {
            System.out.println("\nHoli, que operacion deseas realizar");

            System.out.println("\n1)Suma \n2)Resta \n3)Multiplicacion \n4)Division \n5)Factorial \n6)Combinatoria \n7)Funcion Exponencial, Exp(x), e^x \n8)Aproximacion Seno(x) \n9)Salir");

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

                case 5: //Factorial
                    a = leerNumero(leer);
                    res = factorial(a);
                    imprimirResultado(res);
                    break;

                case 6: //Combinatoria
                    do {
                        a = leerNumero(leer);
                        b = leerNumero(leer);    
                    } while (b>a);
                    
                    res = combinatoria(a, b);
                    imprimirResultado(res);
                    break;

                case 7: //Factorial
                    a = leerNumero(leer);
                    exponencial(a);
                    break;

                case 8: //Aproximacion Seno
                    a = leerNumero(leer);
                    aproximacionSeno(a);
                    break;

                case 9: //Despedida
                    System.out.println("\nAdios n.n");
                    break;
            
                default: //Error
                    System.out.println("\nOperacion no valida, intentelo de nuevo");
                    break;
            }
        } while (opcion != 9);

        System.out.println("\nApagando calculadora");

    }

    public static double leerNumero(Scanner sc){
        double n = 0;
        while (n==0) {
            System.out.print("\nIngrese un valor:");
            n = sc.nextDouble();
        }
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

    public static double factorial(double a) {
        double r, contador = a;
        r = a;
        //System.out.println("El factorial");
        while (contador > 2) {
            r = multiplicar(r, restar(contador, 1));
            //System.out.println(r);
            contador = restar(contador, 1);
        }
        return r;
    }

    public static double combinatoria(double a, double b) {
        double r, n, k;
        n = factorial(a);
        //System.out.println(n);
        k = factorial(b);
        //System.out.println(b);
        r = dividir(n, multiplicar(k, factorial(restar(a,b))));
        return r;
    }

    public static void exponencial(double a) {
        double r = 1, x = 0;
        int n = 50;
        for (int i = 1; i <= n; i++) {
            x = Math.pow(a, i);
            r = sumar(r, dividir(x, factorial(i)));
        }
        System.out.println("\nEl resultado es un valor aproximado a "+ r);
    }

    public static void aproximacionSeno(double a) {
        double r=a, cociente, fc, n1, n2, p1, p2;
        //de 0 a 30, n = 74
        int n = 74;

        for (int i = 1; i <= n; i++) {
            fc = sumar(multiplicar(2, i),1);
            n1 = Math.pow(-1, i);
            n2 = Math.pow(a, fc);
            cociente = factorial(fc);
            p1 = multiplicar(n1, n2);
            p2 = dividir(p1,cociente);
            r = sumar(r, p2);
        }

        System.out.println("La aproximacion de sen("+ a + ") es " + r);

    }
}
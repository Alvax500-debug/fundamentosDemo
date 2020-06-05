import java.util.Scanner;

public class Cinco_dos{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double uno = 0, dos = 0, tres = 0, multiplicacion = 0, suma = 0;
        boolean mayor_uno, mayor_dos, mayor_tres;

        System.out.println("Multiplicar los 2 numeros mayores y sumar el menor");

        System.out.println("Ingrese 3 numeros: ");

        uno = leer.nextDouble();
        dos = leer.nextDouble();
        tres = leer.nextDouble();

        //Revisando uno
        if (uno > dos && uno != dos) {
            //System.out.println("Uno es meramente mayor que dos");
            mayor_uno = true;
            mayor_dos = false;
        } else {
            if (uno >= dos) {
                //System.out.println("Uno es igual a dos");
                mayor_uno = true;
                mayor_dos = true;
            } else {
                //System.out.println("Algo es raro");
                mayor_uno = false;
                mayor_dos = true;
            }
        }

        if (uno > tres && uno != tres) {
            //System.out.println("Uno es meramente mayor que tres");
            mayor_uno = true;
            mayor_tres = false;
        } else {
            if (uno >= tres) {
                //System.out.println("Uno es igual a tres");
                mayor_uno = true;
                mayor_tres = true;
            } else {
                //System.out.println("Algo es raro");
                mayor_uno = false;
                mayor_tres = true;
            }
        }

        //Revisando dos
        if (dos > tres && dos != tres) {
            //System.out.println("Dos es meramente mayor que tres");
            mayor_dos = true;
            mayor_tres = false;
        } else {
            if (dos >= tres) {
                //System.out.println("Dos es igual a tres");
                mayor_dos = true;
                mayor_tres = true;
            } else {
                //System.out.println("Algo es raro");
                mayor_dos = false;
                mayor_tres = true;
            }
        }

        if (mayor_uno == true && uno == tres) {
            mayor_tres = true;
        }

        if (mayor_dos == true && tres > uno && tres != dos) {
            mayor_tres = true;
        }

        if (mayor_tres == true && dos > uno && dos != tres) {
            mayor_dos = true;
        }

        if (mayor_tres == true && uno > dos && tres != uno) {
            mayor_uno = true;
        }

        

        //Evaluando y operando con lo correspondiente
        if (mayor_uno && mayor_dos && mayor_tres == false) {
            System.out.println("Uno y Dos mayores");
            multiplicacion = uno * dos;
            suma = multiplicacion + tres;
            System.out.println("El resultado es " + suma);
            
        } else {
            System.out.println("Espere un momento por favor .");
        }

        if (mayor_uno && mayor_tres && mayor_dos == false) {
            System.out.println("Uno y Tres mayores");
            multiplicacion = uno * tres;
            suma = multiplicacion + dos;
            System.out.println("El resultado es " + suma);
        } else {
            System.out.println("Espere un momento por favor ..");
        }

        if (mayor_tres && mayor_dos && mayor_uno == false) {
            System.out.println("Dos y Tres mayores");
            multiplicacion = tres * dos;
            suma = multiplicacion + uno;
            System.out.println("El resultado es " + suma);
        } else {
            System.out.println("Espere un momento por favor ...");
        }

        if (mayor_uno && mayor_dos && mayor_tres) {
            System.out.println("Todos los numeros son iguales ó solo hay un numero mayor");
        } 
        
    }
}
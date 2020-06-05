import java.util.Scanner;

public class Cinco{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double uno = 0, dos = 0, tres = 0;
        boolean mayor_uno, mayor_dos, mayor_tres;

        System.out.println("El mayor de tres numeros dados");

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

        if (dos > tres && mayor_uno == true && dos != uno) {
            mayor_dos = false;
        }

        if (dos > uno && mayor_uno == true) {
            mayor_dos = true;
            mayor_uno = false;
        }

        if (mayor_dos == false && mayor_tres == false) {
            System.out.println("El mayor es el primer numero");
        } else {
            System.out.println("Espere por favor.");
        }

        if (mayor_uno == false && mayor_tres == false) {
            System.out.println("El mayor es el segundo numero");
        } else {
            System.out.println("Espere por favor..");
        }

        if (mayor_uno == false && mayor_dos == false) {
            System.out.println("El mayor es el tercer numero");
        } else {
            System.out.println("Espere por favor...");
        }

        if (mayor_uno && mayor_dos && mayor_tres) {
            System.out.println("Los tres numeros son iguales o al menos 2 lo son y son mayores que el tercero");
        } 
        
    }
}
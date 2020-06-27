import java.util.Scanner;

public class Ej1{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double a = 0, b = 0, c = 0, precio = 0, at = 0, ar = 0, areaT = 0;

        do {
            System.out.println("\nPara la medida A el valor sera de ");
            a = leerNumero(leer);
            System.out.println("\nPara la medida B el valor sera de ");
            b = leerNumero(leer);
            System.out.println("\nPara la medida C el valor sera de ");
            c = leerNumero(leer);
            if (a<c) {
                System.out.println("\nLo sentimos alguna medida no es admitida en el sistema (A o C), intentelo nuevamente");
            }
        } while (a<c);

        at = areaTri(a, b, c);
        ar = areaRec(b, c);

        areaT = areaTotal(ar, at);
        
        System.out.println("\nEl valor por metro cuadrado del terreno seria ");
        precio = leerNumero(leer);
        precioTerreno(precio, areaT);
    }

    public static double leerNumero(Scanner sc){
        double n = 0;
        while (n<=0) {
            System.out.print("\nIngrese un valor:");
            n = sc.nextDouble();
        }
        return n;
    }

    public static double areaTri(double a, double b, double c){
        double res = 0, recorte = 0;
        recorte = a - c;
        res = (b *recorte)/2;
        return res;
    }

    public static double areaRec(double b, double c) {
        double res = 0;
        res = b * c;
        return res;
    }

    public static double areaTotal(double ar, double at) {
        double res = 0;
        res = ar + at;
        System.out.println("\nEl area total del terreno es " + res + "m2");
        return res;
    }

    public static void precioTerreno(double precio, double areaT) {
        double pt = 0;
        pt = precio * areaT;
        System.out.println("\nEl valor del terreno es $" + pt);
    }
}
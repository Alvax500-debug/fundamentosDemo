import java.util.Scanner;

public class principal{

    char varGlobal;
    static final int CTE_GLOBAL = 2;

    public static void main(String[] args) {
        System.out.println("Hola mundo");

        Scanner sc = new Scanner(System.in);
        
        int x = 5;
        double y = 1.3;
        char letra = 'T';
        char numero = 123;
        boolean vf = true;

        short v = 4000;

        float f = 3.45F;

        int h = 4;
        float i = 2.0F;
        double j;

        j = h/i;

        float k = (float)j;

        //int dato = sc.nextInt();

        int l;

        l = 2 * (4+5);

        System.out.println( l );

        y = Math.sqrt(11);

        System.out.println( y );

        String nombre;

        nombre = sc.nextLine();

        System.out.println("Holi"+nombre);
        System.out.println(nombre.length());
    }
}
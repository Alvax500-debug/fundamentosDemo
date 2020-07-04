import java.util.Scanner;

public class Ej2{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int n=50, x;

        boolean esta;

        int[] arr = new int[n];

        int ind;

        for (ind = 0; ind < n; ind++) {
            arr[ind] = (int)(Math.random()*100);
        }

        for (ind = 0; ind < n; ind++) {
            System.out.print(arr[ind] + " ");
        }

        System.out.print("\nIngresa 1 numero para buscarlo:");
        x = leer.nextInt();

        esta = false;

        for (ind = 0; ind < n; ind++) {
            esta = (arr[ind]==x);
            if (esta) {
                break;
            }
        }

        System.out.print("\nEsta: " + esta);
    }
}
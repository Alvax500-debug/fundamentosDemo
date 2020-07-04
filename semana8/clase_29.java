public class clase_29{
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[][] arr2 = new int[2][3];
        int[][][] arr3 = new int[3][3][2];

        System.out.println("\n1 Dimension");

        for (int i = 0; i < 10; i++) {
            arr[i] = i;
            System.out.println(arr[i]);
        }

        System.out.println("\n2 Dimensiones");

        for (int f = 0; f <= 1; f++) {
            for (int c = 0; c <= 2; c++) {
                arr2[f][c] = f + c;
                System.out.println(arr2[f][c]);
            }
        }

        System.out.println("\n3 Dimensiones");

        for (int p = 0; p <= 1; p++) {
            for (int f = 0; f <= 2; f++) {
                for (int c = 0; c <= 2; c++) {
                    arr3[f][c][p] = f + 3 + p;
                    System.out.println(arr3[f][c][p]);
                }
            }
        }
    }
}
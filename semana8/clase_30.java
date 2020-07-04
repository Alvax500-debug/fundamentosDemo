public class clase_30{
    public static void main(String[] args) {
        int p=3, n=4, m=5;
        
        int[] arr = new int[n];
        int[][] arr2 = new int[n][m];
        int[][][] arr3 = new int[p][n][m];

        int ind;

        System.out.print("\n-----------------------1 Dimension---------------------------\n");

        for (ind = 0; ind < n; ind++) {
            arr[ind] = (int)(Math.random()*10);
        }

        for (ind = 0; ind < n; ind++) {
            System.out.print(arr[ind] + " ");
        }

        System.out.print("\n");

        for (ind = 0; ind < n; ind++) {
            System.out.print("arr[" + ind + "] = " + arr[ind] + " ");
        }

        System.out.print("\n-------------------------------------------------------");

        System.out.print("\n-----------------------2 Dimensiones----------------------------\n");

        for (int fi = 0; fi < n; fi++) {
            for (int col = 0; col < n; col++) {
                arr2[fi][col] = (int)(Math.random()*10);
            }
        }

        for (int fi = 0; fi < n; fi++) {
            for (int col = 0; col < n; col++) {
                System.out.print(arr2[fi][col] + " ");
            }
            System.out.print("\n");
        }
        
        System.out.print("\n");

        for (int fi = 0; fi < n; fi++) {
            for (int col = 0; col < n; col++) {
                System.out.print("arr2[" + fi + "][" + col + "] = " + arr2[fi][col] + " ");
            }
            System.out.print("\n");
        }
        
        System.out.print("\n-------------------------------------------------------");

        System.out.print("\n-----------------------3 Dimensiones----------------------------\n");

        for (int pla = 0; pla < p; pla++) {
            for (int fi = 0; fi < n; fi++) {
                for (int col = 0; col < n; col++) {
                    arr3[pla][fi][col] = (int)(Math.random()*10);
                }
            }
        }
                
        for (int pla = 0; pla < p; pla++) {
            for (int fi = 0; fi < n; fi++) {
                for (int col = 0; col < n; col++) {
                    System.out.print(arr3[pla][fi][col] + " ");
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }
                
        System.out.print("\n");

        for (int pla = 0; pla < p; pla++) {
            for (int fi = 0; fi < n; fi++) {
                for (int col = 0; col < n; col++) {
                    System.out.print("arr3[" + pla + "][" + fi + "][" + col + "] = " + arr3[pla][fi][col] + " ");
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }        
        
        System.out.print("\n-------------------------------------------------------");
    }
}
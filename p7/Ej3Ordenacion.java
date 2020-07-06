public class Ej3Ordenacion{
    public static void main(String[] args) {
        //Acomodar todos los valores de un arreglo de mayor a menor, en un arreglo auxiliar

        int [] arr, arrOrd;
        
        int n = 50; //Tamaño del arreglo
        int r = 99; //Rango de los aleatorios

        arr = generArreglo(n,r);

        imprimirArreglo(n,arr);

        arrOrd = ordenArreglo(n,arr);

        imprimirArreglo(n,arrOrd);

        //imprimirArreglo(n,arr);
    }

    public static int[] generArreglo(int n, int r) {
        int[] arr = new int[n];

        for (int ind = 0; ind < n; ind++) {
            arr[ind] = 1 + (int)(Math.random()*r);
        }

        return arr;
    }

    public static void imprimirArreglo(int n, int[] arr) {
        //Imprimir arreglo

        int x = 1;

        System.out.println("\n");

        for (int ind = 0; ind < n; ind++) {
            System.out.print(arr[ind] + " ");
            if (ind == ((10 * x) -1) && ind > 2) {
                System.out.println("\n");
                x+=1;
            }
        }
    }

    public static int[] ordenArreglo(int n, int[] arr) {
        int[] aux = new int[n];
        int x, p = 0;

        for (int ind = 0; ind < n; ind++) {

            x = arr[ind];
            //System.out.println(ind + " ");
            
            for (int i = 0; i < n; i++) {
            
                if (arr[i] >= x) {
                    x = arr[i];
                    p = i;
                }
                //System.out.println(x+" ");
            }

            //System.out.println("\n");

            //System.out.println(x+"\n");

            aux[ind] = x;
            arr[p] = 0;
        }

        return aux;
    }
}
import java.util.Scanner;

public class testTp {
    public static  int somVect(int [] arr,int n) {
        int som = 0;
        for (int i=0; i < n; i++) {
            som += arr[i];
        }
        return som;

    }

    public static  int indexMaxSomeline(int[][] arr,int n) {

        int imax=1;
        int max = somVect(arr[0], n);

        for (int i = 1; i < n; i++) {
            if (somVect(arr[i],n)>max) {
                imax = i;
                max=somVect(arr[i],n);
            }
        }

        return imax;
    }

    public static int[] permutVect(int vect1[],int vect2[],int n) {

        int temp = 0;
        for (int i = 0; i < n; i++) {
            temp = vect1[i];
            vect1[i] = vect2[i];
            vect2[i] = temp;

        }
        return vect1;


    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("donner le nbr de lignes  : ");
        int n = scan.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("donner valeur de la ligne " + (i + 1) + " et la colomn " + (j + 1));
                arr[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i <n; i++) {
            System.out.println("   ");
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "   ");
            }


        }
        int imax = indexMaxSomeline(arr, n);
        System.out.println("l'indice de la ligne la som de sa collone est plus grand est "+(imax+1));
        int[] vect1 = new int[n];
        int[] vect2 = new int[n];

        for (int i = 0; i < n; i++) {
            vect1[i] = arr[0][i];
        }
        for (int i = 0; i < n; i++) {
            vect2[i] = arr[imax][i];
        }





        System.out.println(" ");
        int[] temp = new int[n];
        temp = permutVect(vect1, vect2, n);
        for (int i = 0; i < n; i++) {

            System.out.print(temp[i]);
        }
        System.out.println(" ");


    }


    }






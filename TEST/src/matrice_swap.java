import java.util.Scanner;

public class matrice_swap {
    public static void main(String[] args) {
        int i, j;

        Scanner scan = new Scanner(System.in);
        System.out.println("donner N : ");
        int n = scan.nextInt();
        int[][] arr= new int[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.println("donner valeur de la ligne "+(i+1)+" et la colomn "+(j+1));
                arr[i][j]= scan.nextInt();
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(arr[i][j]+"  ");

            }
            System.out.println("  ");
        }
        System.out.println("+----------------------------+");



        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(arr[j][i]+"  ");

            }
            System.out.println("  ");
        }

    }
}

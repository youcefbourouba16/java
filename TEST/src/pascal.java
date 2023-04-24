import java.util.Scanner;

public class pascal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Donner N");
        int n = scan.nextInt();
        int [][] arr=new int[n][n];
        int i, j;


        for ( i = 0; i < n; i++) {
            arr[i][0]=1;
        }

        for ( i = 0; i < n; i++) {
            for ( j = 0; j < n; j++) {

                if (i == j) {
                    arr[i][j] = 1;

                }
            }}
        for (i = 2; i < n; i++) {
            for (j = 1; j < i; j++) {

                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }




        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(arr[i][j]+"  ");

            }
            System.out.println("  ");
        }
}}

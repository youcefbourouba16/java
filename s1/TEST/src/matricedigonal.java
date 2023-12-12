import java.util.Scanner;

public class matricedigonal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("donner N");
        int n = scan.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {


            arr[i][n-(i+1)] = 1;
        }
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    arr[i][j] = 1;

                }
            }
        }

        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "   ");
            }

            System.out.println("   ");
        }
    }

}

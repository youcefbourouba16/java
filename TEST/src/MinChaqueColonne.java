import java.util.Scanner;

public class MinChaqueColonne {
    public static void main(String[] args) {
        int i, j;

        Scanner scan = new Scanner(System.in);
        System.out.println("donner N : ");
        int n = scan.nextInt();
        System.out.println("donner M : ");
        int m = scan.nextInt();

        int[][] arr = new int[n][m];
        int[] MinColonne = new int[m];

        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.println("donner valeur de la ligne " + (i + 1) + " et la colomn " + (j + 1));
                arr[i][j] = scan.nextInt();


            }
        }

        for (j = 0; j < m; j++) {
            int min = arr[0][j];

            for (i = 1; i < n; i++) {


                if (arr[i][j] < min) {

                    min = arr[i][j];


                }
            }
            MinColonne[j] = min;

        }


        for (j = 0; j < m; j++)
        {
            System.out.print(MinColonne[j]);
        }

    }}
import java.util.Scanner;

public class matrice_orderMaxtoMin {
    public static void main(String[] args) {
        int i,j;
        Scanner scan = new Scanner(System.in);
        System.out.println("donner N ligne");
        int n = scan.nextInt();
        System.out.println("donner X colomn");
        int x = scan.nextInt();
        int[][] arr = new int[n][x];
        for (i = 0; i < n; i++) {
            for (j = 0; j < x; j++) {
                System.out.println("donner valeur de la ligne " + (i + 1) + " et la colomn " + (j + 1));
                arr[i][j] = scan.nextInt();
            }
        }

        for (i = 0; i < n; i++) {
            for (j = 0; j < x; j++) {
                for (int k = i; k < n; k++) {
                    for (int p = 0; p < x; p++) {
                        if (arr[i][j] < arr[k][p]) {
                            int tempo = arr[i][j];
                            arr[i][j] = arr[k][p];
                            arr[k][p] = tempo;

                        }
                        }

                    }
                }
            }

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(arr[j][i]+"  ");

            }
            System.out.println("  ");
        }


    }
}

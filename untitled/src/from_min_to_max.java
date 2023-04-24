import java.util.Scanner;

public class from_min_to_max {
    public static void main(String[] args) {
        int n, m, i, j,x,y;
        Scanner scan = new Scanner(System.in);
        System.out.println("Donner nbr de ligne :");
        n = scan.nextInt();
        System.out.println("Donner nbr de de colomn:");
        m = scan.nextInt();
        int[][] arr = new int[n][m];

        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.println("Enter l'element de ligne " + (i + 1) + "et de colomn :" + (j + 1));
                arr[i][j] = scan.nextInt();


            }
        }
        for (i = 1; i < n ; i++) {
            for (j = 1; j < m; j++) {
                for (x = 0; x < n; x++) {
                    for (y = 0; y < m; y++) {
                        if (arr[x][y] > arr[i][j]) {
                            int min = arr[i][j];
                            arr[i][j] = arr[x][y];
                            arr[x][y] = min;

                        }
                    }
                }
            }
        }


        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print(arr[i][j]);
            }
        }


    }}
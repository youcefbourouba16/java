import java.util.Scanner;

public class matrice_orderMaxtoMin {
    public static void affich(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[j][i] + "  ");

            }
            System.out.println("  ");
        }
    }
    public static int[][] MaxToMin(int [][] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int m = arr[i].length;
            for (int j = 0; j < m; j++) {
                for (int k = i; k < n; k++) {
                    for (int p = 0; p < m; p++) {
                        if (arr[i][j] < arr[k][p]) {
                            int tempo = arr[i][j];
                            arr[i][j] = arr[k][p];
                            arr[k][p] = tempo;
                        }
                    }

                }
            }
        }
        return arr;
    }
    public static int[][] Remplisage(int n,int m){
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[n][m];
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("donner valeur de la ligne  " + (i + 1) + " et la colomn " + (j + 1));

                arr[i][j] = check();

            }
        }
        return arr;
    }

    public static int check() {
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            System.out.println("PLEASE ENTER ENTIGER VALUE");
            scan.nextLine();
        }
        int x = scan.nextInt();
        return x;


    }

    public static void main(String[] args) {
        int i,j;
        Scanner scan = new Scanner(System.in);
        System.out.println("donner N ligne");
        int n=check();

        System.out.println("donner X colomn");

        int x=check();
        int[][] arr = new int[n][x];

        Remplisage(n, x);
        MaxToMin(arr);
        affich(arr);

    }
}


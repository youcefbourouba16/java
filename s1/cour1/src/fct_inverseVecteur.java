import java.util.Scanner;

public class fct_inverseVecteur {

    public static int[][] inverseTabe(int[][] arr, int m, int x) {
        int i = 0;
        int j = m-1;
        int temp = 0;

        while (i < j) {
            temp = arr[x][i];
            arr[x][i] = arr[x][j];
            arr[x][j] = temp;
            i++;
            j--;
        }

        return arr;
    }


    static int verfiyy(int x){
        Scanner scan=new Scanner(System.in);
        while (!scan.hasNextInt()) {
            System.out.println(" doit etre un nombre entier");
            scan.nextLine();
        }
        x=scan.nextInt();
        return x;
    }
    public static int[][] affiche(int n,int m,int [][] arr) {
        for (int i = 0; i < n; i++) {
            System.out.println(" ");
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "  ");
            }

        }
        return arr;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("donner le nbr de ligne ");
        int n=0;
        int m=0;
        n=verfiyy(n);
        System.out.println("Donner le nbr de collone");
        m = verfiyy(m);
        int[][] T = new int[n][m];
        int temp=0;
        for (int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Donner la val de la ligne "+(i+1)+" est la collone "+(j+1));
                T[i][j] = verfiyy(temp);

            }
        }
        affiche(n,m,T);
        System.out.println(" ");
        int x=0;
        System.out.println("donner la ligne vous voyyer inverser");
        x = scan.nextInt();
        while ((x > m) || (x < 0)) {
            System.out.println("doint etre entre 0 et "+m);
            x = scan.nextInt();
            scan.nextLine();
        }
        inverseTabe(T, m, x);
        affiche(n, m, T);
    }}
//// menu html css JS

import java.util.Scanner;

public class invesr {




    static public int[] inversee(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        int temp;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

    static public int[] indexligne(int[][] arr, int m,int l) {

        int t[] = new int[m];
        for (int j = 0; j < m; j++) {
            t[j] = arr[l][j];
        }
        return t;

    }

    public static void main(String[] args) {
        Scanner lire = new Scanner(System.in);

        System.out.println("Donner le nombre de ligne");
        int l=lire.nextInt();

        System.out.println("Donner le nombre de colonne");
        int c=lire.nextInt();

        int Matrice[][]=new int[l][c];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {

                System.out.println("Donner la valeur de la ligne "+i+"et la colonne "+j);
                Matrice[i][j]=lire.nextInt();

            }

        }


        for (int i = 0; i < l; i++) {
            System.out.println("  ");

            for (int j = 0; j < c; j++) {

                System.out.print(Matrice[i][j]+"  ");


            }
        }
        System.out.println(" donner la ligne");
        int z = lire.nextInt();
        int vect1[] = new int[c];
        vect1=indexligne(Matrice, c, z);
        inversee(vect1);
        for (int j = 0; j < c; j++) {
            Matrice[z][j] = vect1[j];
        }

        for (int i = 0; i < l; i++) {
            System.out.println("  ");

            for (int j = 0; j < c; j++) {

                System.out.print(Matrice[i][j]+"  ");


            }
        }

    }

}

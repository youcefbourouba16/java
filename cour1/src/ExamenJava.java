import java.util.Scanner;
public class ExamenJava {

    //////verfier la variable est entier//////////
    /////////////////////////////////////////////
    public static int verifyINT() {
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            System.out.println("PLEASE ENTRER UNE VELEUR ENTIER !!!!!");
            scan.nextLine();
        }
        int x = scan.nextInt();
        return x;

    }

    ///////////+++ 1/ method pour remplire une matrice de L*C tant que (L=C)
    ///////////////////////////////////////////////////////////////////////
    static public int[][] remplirMat(int l) {
        int t[][] = new int[l][l];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {

                System.out.println("donner valeur de la ligne "
                        + " et la colomn " +"Matrice["+i+"]"+"["+j+"]");
                t[i][j] = verifyINT();
            }
        }
        return t;
    }
    ///////////+++ 2/ La somme de diagonal
    ///////////////////////////////////////////////////////////////////////
    static public int sommeDigonal(int t[][], int l) {
        int som = 0;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if (i==j) som += t[i][j];
            }
        }
        return som;
    }


    ///////////+++ 3/ determine le max de la matrice est sa ligne est collone
    ///////////////////////////////////////////////////////////////////////
    static public void DetemineMax_Mat(int t[][], int l) {
        int max = t[0][0];

        int ligne=0, collone=0;
        for (int q=0;q<l;q++) {
            for (int i=0;i<l;i++) {
                for (int j=0;j<l;j++) {
                    for (int m=0;m<l;m++) {
                        for (int k = 0; k < l; k++) {
                            if (t[m][k]>=max) {
                                max = t[m][k];

                                ligne = m;
                                collone = k;


                            }


                        }

                    }

                }


            }


            System.out.println(" le max est "+max+"la ligne "+ligne+" et collone "+collone);



        }




    }

    ///////////+++ 4/ echangent deux ligne d'une matrice
    ///////////////////////////////////////////////////////////////////////
    public static int[][] echanger_deux_ligne(int t[][],int l,int ligne1,int ligne2) {
        int x;
        for (int j = 0; j < l; j++) {
            x = t[ligne1][j];
            t[ligne1][j] = t[ligne2][j];
            t[ligne2][j] = x;

        }
        return t;
    }

    ///////////+++ 5/ afficher la matrice
    ///////////////////////////////////////////////////////////////////////
    public static void afficher(int t[][], int l) {
        for (int i = 0; i < l; i++) {
            System.out.println(" ");
            for (int j = 0; j < l; j++) {
                System.out.print(t[i][j]+" ");
            }
        }
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" - Donner le nombre de ligne (nombre ligne =collones)");
        int l = verifyINT();
        while (l <= 0) {
            System.out.println(" le nbr de linge doit etre sup striquetement a 0 !!");
            l = verifyINT();

        }
        int M[][] = new int[l][l];
        M = remplirMat(l);
        DetemineMax_Mat(M, l);
        afficher(M, l);
        int somme=sommeDigonal(M, l);
        System.out.println("LA SOMME DE DIAGONALE EST = :" + somme);
        int ligne1,ligne2;

        do {
            System.out.println(" -Donner la ligne que vous souhiet de remplacer");
            System.out.println(" ligne 1 doit etre different ligne 2");
            ligne1 = verifyINT();
            while ((ligne1 < 0) || (ligne1 >=l)) {
                System.out.println(" la valeur doit etre entre 0 et " + (l-1));
                ligne1 = verifyINT();
            }
            System.out.println(" -remplacer par ??");
            System.out.println(" ligne 1 doit etre different ligne 2");
            ligne2 = verifyINT();
            while ((ligne2 < 0) || (ligne2 >= l)) {
                System.out.println(" la valeur doit etre entre 0 et " + (l-1));
                ligne2 = verifyINT();
            }


        } while (ligne1==ligne2);

        System.out.println(ligne1 +" "+ligne2);
        if (l == 1) {
            System.out.println(" ne peut pas cahnger les ligne car le nbr de ligne est colone" +
                    "doit etre different a 1");
        }
        echanger_deux_ligne(M, l, ligne1, ligne2);
        afficher(M,l);
    }

}

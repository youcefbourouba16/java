import java.util.Scanner;

public class moy {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("donner le nbr d'etudiants");
        while (!scan.hasNextInt()) {
            System.out.println("donner un entier");
            scan.nextLine();
        }

        double x = scan.nextDouble();
        double g = 0;
        int elem;
        double moy,som;


        for (int i = 1; i <= x; i++) {
            moy=0;som=0;elem=0;
            for (int m=1;m<=6;m++){
                System.out.println("donner la note de l'examen num "+m+" de l'etudiant num :"+i);
                while (!scan.hasNextDouble()) {
                    System.out.println("donner un entier");
                    scan.nextLine();

                }
                double n = scan.nextDouble();
                while (n < 0 || n > 20) {
                    System.out.println("la note doit etre entre 0 et 20 ");
                    n = scan.nextDouble();
                }
                if(n<=5)  elem+=1;
                som+=n;

            }
            moy=som/6;
            System.out.println("la moy de l'etudian num "+i+" est "+moy);
            if (elem==0 && moy>=10){
                System.out.println("admis");
                if(moy<12) System.out.print(" montion Passable");
                else if (moy<14) System.out.print(" montion Assez Bien");
                else if (moy<16) System.out.println(" montion Bien");
                else if (moy<18) System.out.println(" montion tres Bien");
                else System.out.println(" montion Exellent");

            }else System.out.println("Ajourne");

            //g=g+x;
            g+=moy;
        }
        double moy1 = (double) g / x;
        System.out.println("la moy de group est = " + moy1);
    }
}

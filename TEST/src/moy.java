import java.util.Scanner;

public class moy {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("donner le nbr d'etudiants");
        while (!scan.hasNextInt()) {
            System.out.println("donner un entier");
            scan.nextLine();
        }

        int x = scan.nextInt();
        int g = 0;

        for (int i = 0; i < x; i++) {
            System.out.println("donner la note de l'etudiant num :"+(i+1));
            while (!scan.hasNextInt()) {
                System.out.println("donner un entier");
                scan.nextLine();

            }
            int n = scan.nextInt();
            while (n < 0 || n > 20) {
                System.out.println("la note doit etre entre 0 et 20 ");
                n=scan.nextInt();
            }
            //g=g+x;
            g+=n;
        }
        double moy = (double) g / x;
        System.out.println("la moy est = " + moy);
    }
}

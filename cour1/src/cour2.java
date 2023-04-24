/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*+++++++++++++++++++++++(EQUATION DE 2 EME DEGREE)+++++++++++++++++++++++++++++++++++++++++++*//////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

public class cour2 {
    public static void main(String[] args) {
        double a, b, c, delta;
        Scanner scan = new Scanner(System.in);

        /*
        System.out.println("donner A :");
        a = scan.nextDouble();
        while (a==0) {
            System.out.println("veuillez introduire une valeur #0");
            System.out.println("donner A :");
            a = scan.nextDouble();
        } */

        do {
            System.out.println("donner A :");
            a = scan.nextDouble();
            if (a==0)  System.out.println("veuillez introduire une valeur #0");
        } while (a==0);

        System.out.println("donner B :"); //sout
        b = scan.nextDouble();

        System.out.println("donner C :");
        c = scan.nextDouble();

        delta = Math.pow(b, 2) - 4 * (a * c);

        if (delta>0) {
            System.out.println("Il exist deux solutions x1 =" + ((-b - Math.sqrt(delta) / 2 * a))
                    + "X2=" + ((-b + Math.sqrt(delta) / 2 * a)));
        } else if (delta == 0) {

            System.out.println("Il exist une seul solution x1=" + (-b) / 2 * a);
        } else {

            System.out.println("ERROR-404");

        }

    }
}

/*
  exo1: ecrire un prog java demande a l'autilisateur d'indroduire deux variable et une operation (-,+,*,/,!)
  apres affiche le resultats (etudier tout les cas)

  n!----> n<0===> ERROR

 */
import java.util.Scanner;

public class Method {
    static void affich(String s) {
        System.out.println("Message : " +s);
    }
    static double sommeXY() {
        double x,y;
        Scanner scan = new Scanner(System.in);
        affich("Donner X :");
        x=scan.nextDouble();
        affich("Donner Y");
        y = scan.nextDouble();
        return x+y;
    }

    public static void main(String[] args) {
        affich("cour java");

        char c;
        Scanner scan = new Scanner(System.in);
        do {
            affich("la somme est : " +sommeXY());
            affich("une autre operation oui ou non(O/N)");
            c=scan.next().charAt(0);

        } while (c=='o');

    }
}


/*
Ecrire une method java nome equationDeg qui resourdre une equation de 2 eme degre
static
string equationDeuxDEg (double a,double B,double C)
 */

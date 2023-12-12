import java.util.Scanner;

public class fact_exo {
    /// declarer une method
    static int fact(int facto) {
        int fa=1,i;
        for (i = 1; i <= facto; i++) {
            fa *= i;
        }
        return fa;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Donner  X :  ");
        ///verfier  si X et Y sont de entier et se sont positive a
        while(!scan.hasNextInt()) {
            System.out.println("Donner  x entier positive :  ");
            scan.next();
        }
        int x=scan.nextInt();



        System.out.println("Donner  Y :  ");
        while (!scan.hasNextInt()) {
            System.out.println("Donner  Y entier :  ");
            scan.next();

        }
         int y=scan.nextInt();


        if ((x<0 && y<0) || x==y) {
            System.out.println("ERROR , Veuillez inserer (x<>y)");

        }else
        {

        ///calcul factoriel de X
        /*int x1 = 1;
        for (int i = 1; i <= x; i++) {
            x1*= i;
        }
        ///calcul factoriel de Y
        int  y1= 1;
        for (int i = 1; i <= y; i++) {
            y1*= i;
        }
        int  yx1= 1;
        for (int i = 1; i <= (y+x); i++) {
            yx1*= i;
        } */


        //// calculer ((x!*y!)) / ((x-y)*(x!+y!))fds

            double resuls;
            resuls=((double)(fact(x)*fact(y))) / ((x-y)*(fact(x+y)));
            System.out.println("resulats est  : "+resuls);

    }}}


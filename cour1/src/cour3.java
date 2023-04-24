import java.util.Scanner;

public class cour3 {
    public static void main(String[] args) {
        double a;
        System.out.println("Donner le nbr A : ");
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextDouble()==false) {
            System.out.println("Donner le nbr A : ");
            scan.nextLine();
        }
        a = scan.nextDouble();
        System.out.println(a);
        //pour fermer la Class Scanner;
        scan.close();

    }
}
/*
    Ecrire un program Java Qui calcul la fontion for ;

 */
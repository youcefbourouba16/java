import java.util.Scanner;

public class moy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("donner le nbr des etudiants :");
        int n = scan.nextInt();
        int g = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("donner la note de l'etudiant num " + (i + 1));
            int x = scan.nextInt();
            while (x > 20) {
                System.out.println("la note doit etre inf a 20");
                x=scan.nextInt();

            }



            g = g + x;




        }
        double m = g / n;
        System.out.println("la moyenne est : " + m);
    }
}

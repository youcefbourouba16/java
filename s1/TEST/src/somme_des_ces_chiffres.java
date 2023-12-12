import java.util.Scanner;

public class somme_des_ces_chiffres {
    public static void main(String[] args) {
        int n;
        int i = 1;
        do {
            System.out.println("donner le nomre num "+i+" :");
            Scanner scan = new Scanner(System.in);
            n = scan.nextInt();
            int div = n,sum=0;
            while (div != 0) {
                int r = div % 10;
                div = div / 10;
                sum+=r;

            }
            System.out.println("le nombre est "+n);
            System.out.println("la somme des ces chiffres est "+sum);
            i++;
        } while (n!=0);
        System.out.println("thank you Good bye !!");
    }
}

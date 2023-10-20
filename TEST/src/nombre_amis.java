import java.util.Scanner;

public class nombre_amis {

    public static void nbr_amis(int x,int y){
        int sum = 0;
        for (int i = 1; i <= (x / 2); i++) {
            if ((x % i) == 0) sum += i;
        }
        if (sum == y) System.out.println("c'est un nbr amis");
        else System.out.println("n'est pas un nbr amis");
    }



    public static void main(String[] args) {
        System.out.println("donner votre nomre 1 ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("donner votre nomre 2 ");
        int sum = 0;
        int m = scan.nextInt();

        if (m > n) nbr_amis(m, n);
        else if (m==n) System.out.println("n'est pas amis");
        else nbr_amis(n,m);






    }
}

import java.util.Scanner;

public class facotiral {
    static public int facorial(int x) {

        int fact = 1;

        for (int i = 1; i <= x; i++) {
            fact = fact * i;

        }
        return fact;


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("donner votre num");
        int n = scan.nextInt();


    }
}

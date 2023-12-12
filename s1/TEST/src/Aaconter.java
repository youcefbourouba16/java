import java.util.Scanner;

public class Aaconter {
    public static void main(String[] args) {
        int cpm = 1, cpM = 1;

        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Donner N : ");
            scan.nextLine();
        } while ( !scan.hasNextInt());
        int n = scan.nextInt();



        for (int i = 1; i <= n; i++) {
            System.out.println("donner X : ");
            char x = scan.next().charAt(0);


            if (x=='a') cpm = cpm + 1;
            if (x=='A') cpM = cpM + 1;
        }
        System.out.println("nbr de A est : " + cpm+"   nbr de a est : "+cpM);


    }
}

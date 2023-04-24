import java.util.Scanner;

public class puisane {
    public static void main(String[] args) {
        double p=1,x;

        Scanner scan = new Scanner(System.in);
        System.out.println("Donner X : ");

        while (scan.hasNextDouble()==false) {
            System.out.println("Donner X hh : ");
            scan.nextLine();
        }
        x = scan.nextDouble();


        do {
            System.out.println("Donner Y : ");
            scan.nextLine();

        } while (!scan.hasNextDouble());
        int n = scan.nextInt();


        for (int i = 1; i <= n; i++) {

            p = p * x;
        }
        System.out.println(p);
    }
}

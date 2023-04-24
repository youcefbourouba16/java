import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int i,t;
        System.out.println("donner x :");
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        System.out.println("donner Y:");
        int n=scan.nextInt();

        t=x;

        for (i = 2; i <= n; i++) {
            t=t*x;
        }
        System.out.println(t);

    }
}

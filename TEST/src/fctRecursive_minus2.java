import java.util.Scanner;

public class fctRecursive_minus2 {
    static public int minus2(int n) {
        int temp, i=0,som=0;
        while (minus2(n - i)>=0) {

            som = som + minus2(n - i);
            i = i - 2;



        }


        return som;
    }


    public static void main(String[] args) {
        System.out.println("donner n");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println(minus2(x));

    }

}

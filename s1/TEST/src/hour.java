import java.util.Scanner;

public class hour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("donner s : ");
        int s = scan.nextInt();
        int m,h,r;
        h = s / 3600;
        r = s % 3600;
        m = r / 60;
        s = r % 60;

        System.out.println(h +" hour :" + m + " min  : " + s+  " Sec " );


    }
}

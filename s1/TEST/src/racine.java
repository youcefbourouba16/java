import java.util.Scanner;

public class racine {

    public static int closeSubst(int x){
        int m=1,i=1;

        while (m<x) {

            m=m*i;
            i++;
        }
        return i-1;
    }


    public static void main(String[] args) {


        System.out.println("donner X :");
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        int x1=(int)x;

        System.out.println(closeSubst(x1));



}


}

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int i;
        int n=0,p=0,m=0,np=0,nn=0;

        System.out.println("donner nbr de numbre N :");
        Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        for (i = 1; i <= N; i++) {
            System.out.println("Donner le num :" + i);
            int x = scan.nextInt();
            if (x > 0) {
                p=p+1;
                np=np+x;
            }
            if (x < 0 ) {
                n=n+1;
                nn=nn+x;
            }
            if (x == 0) {
                m=m+1;
            }
        }
        System.out.println("nomber de nombre positive est :" + p+"  "+"la somme est:"+np);
        System.out.println("nomber de nombre negativee est :" + n+"  "+"la somme est :"+nn);
        System.out.println("nomber de nombre null est :" + m+"  " +"La somme est: 0");
    }
}

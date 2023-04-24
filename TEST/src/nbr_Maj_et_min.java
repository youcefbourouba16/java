import java.util.Scanner;

    public class nbr_Maj_et_min {

        public static void main(String[] args) {

            char x,m,n;
            int j = 0, g = 0;
            System.out.println("donner X :");
            Scanner scan = new Scanner(System.in);
            x = scan.next().charAt(0);
            while (x!='#') {
                System.out.println("donner X :");

                x = scan.next().charAt(0);
                for (m='A';m<='Z';++m) {
                    if (x==m) g=g+1;
                }
                for (m='a';m<='z';++m) {
                    if (x==m) j=j+1;
                }
            }
            System.out.println("le nbr de char MAj est " + g);
            System.out.println("le nbr de char min est " + j);

        }
    }




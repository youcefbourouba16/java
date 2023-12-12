import java.util.Scanner;

public class nombre_premier {
    static public void nbr_amis(){
        int n;
        boolean b=false;
        do {
            System.out.println("donner votre nomre ");
            Scanner scan = new Scanner(System.in);
            n = scan.nextInt();
            int cpt = 0;
            for (int i = 2; i < (n / 2); i++) {
                if (n%i==0) cpt+=1;


            }
            if (cpt==0) System.out.println("le num est premier");
            else System.out.println("le num n'est pas premier");
            System.out.println(" do you want to contineu yes or no (Y or N)");
            String p = scan.next();

            if (p.equals("Y") || p.equals("YES") || p.equals("Yes") || p.equals("yes")||p.equals("y")) b = false;
            else b = true;

        } while (!b);

    }

    public static void main(String[] args) {

        nbr_amis();
        nbr_amis();





    }
}

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("donner J :");

        while (scan.hasNextInt() == false) {
            System.out.println("donner J :");
            scan.nextLine();
        }
        int j=scan.nextInt();

        switch (j) {
            case 1:  System.out.println("c'est vendredi");
            break;
            case 2:  System.out.println("c'est Dimenche");
                break;
            case 3:  System.out.println("c'est Samedi");
                break;
            case 4:  System.out.println("c'est Lundi");
                break;
            case 5:  System.out.println("c'est Mardi");
                break;
            case 6:  System.out.println("c'est mercredi");
                break;
            case 7:  System.out.println("c'est Jeudi");
                break;

                default:
                    System.out.println("Error ,entre un deferent numero dans (1-7)");
        }
        scan.close();


    }
}

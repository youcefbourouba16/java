import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
        /*
        commentaire.paragraph */
        //variables
        byte b=3;               //1 byte (-128)--->(127)
        int x;                  //4 byte (-32768)--->32767
        float t = 14.3f;        //4 byte
        double n = 3.14;
        boolean v = true;
        String nom = "youcef";
        char c = '@';

        System.out.println("hello Word");
        System.out.println("hello Word," + nom);

        ////////////////////////////// Somme///////////////////////////////////////
        int i, j, som;

        Scanner read = new Scanner(System.in);

        System.out.print("Donner la val de A:");
        i = read.nextInt();
        System.out.print("Donner la val de B:");
        j = read.nextInt();
        som = i + j;
        System.out.print("La somme est :" + som);


    }
}

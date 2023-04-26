import java.util.Scanner;

public class palindrom {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("donner votre phrase : ");
        String srt = scan.nextLine();
        int l = srt.length();
        boolean s = true;
        for (int i = 0; i < l; i++) {
            if (srt.charAt(i)!=srt.charAt(l-1-i)) {
                s = false;
                break;


            }


        }
        if (!s) {

            System.out.println("non");
        } else {
            System.out.println("le mot est Palindrom.");

        }





    }}



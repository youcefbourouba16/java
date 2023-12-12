import java.util.Scanner;

public class palindrom {

    static public boolean palindorme(String str) {
        int j = str.length()-1;
        boolean b = true;
        for (int i=0;i<str.length();i++) {
            if (str.charAt(i)!=str.charAt(j)){ b = false; break;}
            j--;
        }
        return b;
    }

    public static void main(String[] args) {
        String  str;
        Scanner scan = new Scanner(System.in);
        System.out.println("donner votre mot :");
        str = scan.nextLine();
        if (palindorme(str)) {
            System.out.println("le mot est Palindrom.");
        } else {
            System.out.println(" non ");
        }

    }

    }



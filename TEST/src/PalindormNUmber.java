import java.util.Scanner;

public class PalindormNUmber {

    public static void main(String[] args) {
        System.out.println("q");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        boolean bool = true;
        if (a < 0) bool=false;
        else
        {
            int r = 0,i=0,div=a;


            do {
                r = div % 10;
                div = div / 10;
                i++;


            } while (div>0);

            int[] arr = new int[i];

            i = 0;

            do {
                r = a % 10;
                a = a / 10;
                arr[i] = r;
                i++;


            } while (a>0);
            int j = arr.length-1;

            for (i = 0; i < arr.length; i++) {

                if (arr[i] != arr[j]) {
                    bool=false;
                    break;
                }
                j--;
            }

            if (bool) {
                System.out.println("palidonrm");

            }else System.out.println("non");
        }








}}

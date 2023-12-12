import java.util.Scanner;

public class majs_mins {
    public static void main(String[] args) {
        char x;
        int cpm = 0, cpM = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("donner X :");
            x = scan.next().charAt(0);


            for (char i = 'a'; i <= 'z'; i++) {
                if (x==i)  cpm = cpm + 1;
            }
            for (char i = 'A'; i <= 'Z'; i++) { if (x==i)  cpM = cpM + 1;
            }

        } while (x!='#');
        System.out.println("nbr des maj est : " + cpM);
        System.out.println("nbr des min est : " + cpm);
    }}


import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("donner nbr en sec :");
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int H = s / 3600;
        int R = s % 3600;
        int M = R / 60;
        int n = R % 60;

        System.out.println("hour" + H);
        System.out.println("Minutes:" + M);
        System.out.println("secounds" + n);






    }}
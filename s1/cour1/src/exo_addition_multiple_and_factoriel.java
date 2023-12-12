import java.util.Scanner;



public class exo_addition_multiple_and_factoriel {
    public static final String error = "\u001B[31m";
    public static final String nrml = "\u001B[37m";


    public static void main(String[] args) {
        double a = 1.0,b=1.0;

        int i;
        Scanner scan = new Scanner(System.in);
        /*
        In this code, the while loop will continue to prompt the user to enter a number until a valid number is entered.
        The hasNextDouble() method checks if the input is a valid double value. If it is, the value is stored in the variable
        a and the loop is exited using the break statement. If the input is not a valid number, an error message is printed,
        and the nextLine() method is called to clear the input buffer before prompting the user again.
         */
        System.out.println(nrml+"+--------------------+");
        System.out.println("-Donner le nombre A:");

        while (true) {


            if (scan.hasNextDouble()) {
                a = scan.nextDouble();
                break;
            } else {
                System.out.println(error+"+!!!!!!!!!!!!!!!!!!!!!!!!!+");
                System.out.println(error+"-Donner un valid numéro A:");

                scan.nextLine();
            }
        }
        System.out.println(nrml+"+-----------------------------+)");
        System.out.println("insert une operation (+,*,-,/,!) :");


        char o = scan.next().charAt(0);

        if ((o == '!')) {
            long factorial = 1;
            if (a >= 0) {

                for (i = 1; i <= a; i++) {
                    factorial *= i;
                }
                int intpart = (int) a;
                System.out.printf("Factorial de "+ intpart +" est : "+ factorial);

            }else{
                System.out.println(error+"+--------------------------------------------------------+");
                System.out.println(error+"Factoeiel d'un nombre (negative ou réel) n'existe pas !!!!");}

        } else {
            System.out.println(nrml+"+--------------------+");
            System.out.println(nrml+"-Donner le 2eme nbr B:");
            while (true) {


                if (scan.hasNextDouble()) {
                    b = scan.nextDouble();
                    break;
                } else {
                    System.out.println(error+"+-----------------------+");
                    System.out.println(error+"Donner un valid numéro B:");

                    scan.nextLine();
                }
            }

            if ((o == '+')) System.out.println(nrml+"Le resultat est :" + (a + b));
            else if ((o == '-')) System.out.println(nrml+"Le resultat est :" + (a - b));
            else if ((o == '*')) System.out.println(nrml+"Le resultat est :" + (a * b));
            else if ((o == '/')) {
                do {
                    if (b == 0) {
                        System.out.println(error+"+------------------------------+");
                        System.out.println(error+"Donner une valeur different a 0 ");

                        b = scan.nextDouble();
                    }
                } while (b == 0);
                System.out.println(nrml+"Le resultat est : " + (a / b));
            } else {
                System.out.println(error+"ERROR-404 ");
            }
        }
    }
}

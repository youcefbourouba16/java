import java.util.Scanner;

public class exercieOperation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Exercice operation (-,+,/,*,fact)");
        System.out.println("Donner l'operation (-,+,/,*,fact=!) : ");
        char c = scan.next().charAt(0);
        ///test
        //fddf
        ////44
        double a = 1, b = 1;
        System.out.println("donner A : ");
        while (scan.hasNextDouble() == false) {
            System.out.println("donner A : ");
            scan.nextLine();
        }
        a = scan.nextDouble();
        switch (c) {
            case '!': {
                System.out.println("Donner A (entier):");
                while (true) {
                    if (scan.hasNextInt()) {
                        a = scan.nextInt();
                        if (a > 0) {
                            break;
                        } else {
                            System.out.println("Donner un num positive");
                            scan.nextLine();
                        }
                    } else {
                        System.out.println("Donner A (entier):");
                        scan.nextLine();
                    }

                }
                int fact = 1;
                for (int i = 1; i <= a; i++) {
                    fact = fact * i;
                }

                System.out.printf("le factorial de %.0f est : %d", a, fact);
                break;
            }
            case '+': {
                System.out.println("Donner B");
                while (scan.hasNextDouble() == false) {

                    System.out.println("Donner un valid num B");
                    scan.nextLine();

                }
                b = scan.nextDouble();
                System.out.println("la Somme  est :" + (a + b));
            }
            case '-': {
                System.out.println("Donner B");
                while (scan.hasNextDouble() == false) {

                    System.out.println("Donner un valid num B");
                    scan.nextLine();

                }
                b = scan.nextDouble();
                System.out.println("la soustraction  est :" + (a - b));
            }
            case '*': {
                System.out.println("Donner B");
                while (scan.hasNextDouble() == false) {

                    System.out.println("Donner un valid num B");
                    scan.nextLine();

                }
                b = scan.nextDouble();
                System.out.println("la Multiplication  est :" + (a * b));
            }
            case '/': {
                System.out.println("Donner B");
                while (true) {
                    if (scan.hasNextDouble()) {
                        b = scan.nextDouble();

                        if (b != 0) {
                            break;
                        } else {
                            System.out.println("Donner un positive num B");
                            scan.nextLine();

                        }
                    } else {
                        System.out.println("Donner un valid num B");
                        scan.nextLine();
                    }

                }

                System.out.println("la division est :" + (a / b));
            }
            default: System.out.println("Erreur !!!: Veuillez inserer une operation valide (-,+,/,*,fact=!).");
        }


    }
    }
import java.util.Scanner;

public class cour4_vecteur {
    public static void main(String[] args) {
        double[] etudiant = {5, 1, 65, 7, 8, 62, 31, 2, 1, 3, 2};
        String[] voitures = {"mazda", "bmw", "scoda"};
        System.out.println(voitures[0]);
        System.out.println(voitures.length);
        System.out.println(etudiant[5]);
        System.out.println(etudiant.length);
        for (int i = 0; i < voitures.length;i++) {
            System.out.println(i);

            System.out.println(voitures[i]);
        }
        System.out.println("using forEach");
        System.out.println("+-----------+");
        for (String str : voitures) {
            System.out.println(str);
        }
        System.out.println("using forEach");
        System.out.println("+-----------+");
        for (double str1 : etudiant) {
            System.out.println(str1);
        }
        ////tableu multi dim
        System.out.println("tableu +-----------------------------------+");
        int[][] multi = {{12, 5, 99, 59}, {5, 5, 6, 98, 5, 46}, {55}};
        System.out.println(multi.length);
        System.out.println(multi[1].length);///nbr des collon dans une ligne
        System.out.println("+---------------------------------++");
        for (int i = 0; i < multi.length; i++) {

            for (int j = 0; j < multi[i].length; j++) {
                System.out.print(multi[i][j]+" ");

            }
            System.out.println(" ");
        }
    }
}

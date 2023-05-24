import java.util.Scanner;

public class somLignetCollon {
    static int verfiyy(int x){
        Scanner scan=new Scanner(System.in);
        while (!scan.hasNextInt()) {
            System.out.println(" doit etre un nombre entier");
            scan.nextLine();
        }
        x=scan.nextInt();
        return x;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("donner le nbr de ligne");
        int n=0,m=0;
        n=verfiyy(n);
        System.out.println("donner le nbr de Collone");
        m=verfiyy(m);



        int [][] arr=new int [n][m];
int temp=0;
        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                System.out.println("Donner la valeur de la ligne "+(i+1)+" et collone "+(j+1));
                temp=verfiyy(temp);

                arr[i][j]=temp;

            }
        }
        for (int i=0;i<n;i++) {
            System.out.println(" ");
            for (int j=0;j<m;j++) {
                System.out.print(arr[i][j]+" ");

            }
        }

        for (int i=0;i<n;i++) {
            int s=0;
            int max=arr[i][0];
            int min=arr[i][0];

            for (int j=0;j<m;j++)
                System.out.println();
            System.out.println(" ligne : "+(i+1)+" Som Ligne "+(i+1)+" = "+s+" Max = "+max+"  min = "+min);
        }
        for (int j=0;j<n;j++) {
            int s=0;
            int max=arr[0][j];
            int min=arr[0][j];
            for (int i=0;i<m;i++) {
                s+=arr[i][j];
                if (arr[i][j]>max) max=arr[i][j];
                if (arr[i][j]<min) min=arr[i][j];
            }

            System.out.println();
            System.out.println(" collone : "+(j+1)+" Somme Collone "+(j+1)+" = "+s+" Max = "+max+"  min = "+min);
        }
    }
}

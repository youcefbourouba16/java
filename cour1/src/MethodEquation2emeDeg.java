import java.util.Scanner;

public class MethodEquation2emeDeg {
    static double[] Equation(double a,double b,double c){

        double d=Math.pow(b,2)-(a*c);
        if (d>=0) {
            double x1,x2;
            double d1 = Math.sqrt(d);
            x1=(-d-b)/(2*a);
            x2=(-d+b)/(2*a);
            double[] results = {x1, x2};
            return results;
        }
        else System.out.println("n'a pas de solution");
        return null;
        }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("donner A  :");
        double a = scan.nextDouble();
        System.out.println("donner B :");
        double b = scan.nextDouble();
        System.out.println("donner C :");
        double c = scan.nextDouble();
        double[] results=Equation(a,b,c);
        if (results!=null) {
            double x1 = results[0];
            double x2 = results[1];
            System.out.println("x1"+x1);
            System.out.println("x2"+x2);

        }else System.out.println("equation n'a pas une solution");


    }
}

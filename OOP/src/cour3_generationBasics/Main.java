package cour3_generationBasics;

public class Main {
    public static void main(String[] args) {
        product p1 = new product();
        System.out.println(p1.getName());
        System.out.println(p1.getDiscount());
        System.out.println("================");
        System.out.println(p1.toString());
        /*
        Constructor in java is used to create the instance of the class.
        Constructors are almost similar to methods except for two things
        - its name is the same as the class name and it has no return type.
         Sometimes constructors are also referred to as special methods to initialize an object.
         */
        product p2 = new product("camera", "Good condtion", 1, 240, 0);
        product p3 = new product("iphone", "5/10", 1, 120, 0);

        System.out.println(p2.toString());
        System.out.println(p3.toString());
        ////////////////Copy Constructor////////////
        product p4 = new product(p2);
        System.out.println(p4.toString());
        product p5 = new product();////---->>> no argmnt constructer else error






    }
}

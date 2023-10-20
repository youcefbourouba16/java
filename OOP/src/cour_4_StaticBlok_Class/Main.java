package cour_4_StaticBlok_Class;

public class Main {



    /*
        Static Block:
    A static block in Java is a section of code enclosed within a set of curly braces {} and preceded by the static keyword.
     It is used to initialize static variables or perform some other static initialization tasks when the class is loaded into memory.
      Static blocks are executed only once, and they are executed in the order they appear in the code.
         */
    static {
        System.out.println("static block");
    }

    public static void main(String[] args) {
        studient st1= new studient("youcef", "123");
        studient st2= new studient("hadjer", "983");
        studient st3= new studient("sara", "3092");
        System.out.println(st1.toString());

        /*
    Static Class:
In Java, a static nested class is a class that is defined within another class and is marked as static.
 Unlike regular inner classes, static nested classes do not require an instance of the outer class to be created before they
  can be used. They are essentially like independent classes that are just nested inside another class for better organization
   or logical grouping.
     */

        outerClass.innerClass str = new outerClass.innerClass();
        ////// ida na7ina static lzm n3rfo chaque class whdha ch9wa mala ndiru static
        str.print();


    }






}




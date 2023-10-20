package cour2_circle;

public class Main {

    public static void main(String[] args) {
        circle C1 ;
        C1 = new circle();
        C1.setRadius(4);
        C1.setColor("green");
        System.out.println(C1.getArea());
        System.out.println(C1.getCircumference());
        System.out.println(C1.tooString());
    }
}

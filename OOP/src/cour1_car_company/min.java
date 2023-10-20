package cour1_car_company;

public class min {


    public static void main(String[] args) {
        Car c1,c2;
        c1 = new Car();
        c1.maxSpeed = 220;
        c1.name = "Honda";
        System.out.println(c1.name);


        c2 = new Car();
        c2.setName("tesla");
        System.out.println(c2.getName());




    }
}

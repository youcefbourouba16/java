package cour3_generationBasics;

public class product {
    private String name;
    private String description;
    private float price;
    private int qantity;
    private float discount;
    private String color;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQantity() {
        return qantity;
    }

    public void setQantity(int qantity) {
        this.qantity = qantity;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }


    public String toString() {
        return "cour3_generationBasics{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", qantity=" + qantity +
                ", discount=" + discount +
                '}';
    }


    ////No-Arg constructer/////
    public product() {
        this.name = "NO name";
        this.discount = 0;
        this.description = "NO description";
        this.qantity = 0;
        this.price = 0;
    }
    /*
        Constructor in java is used to create the instance of the class.
        Constructors are almost similar to methods except for two things
        - its name is the same as the class name and it has no return type.
         Sometimes constructors are also referred to as special methods to initialize an object.
         */

    //////Parameterized constructer////
    public product(String name, String description, int qantity, float price, float discount) {
        this.name = name;
        this.discount = 0;
        this.description = description;
        this.qantity = 0;
        this.price = price;
    }

    ////// constructer inside an construter////constructer chaining
    public product(String name, String description, int qantity, float price, float discount, String color) {
        this(name, description, qantity, price, discount);
        this.color = color;

    }

    ////////////////Copy Constructor////////////
    public product(product obj) {
        this.name = obj.name;
        this.discount = obj.discount;
        this.description = obj.description;
        this.qantity = obj.qantity;
        this.price = obj.price;

    }


    /*
    finalize() method in Java is a method of the Object class that is used to perform cleanup activity before destroying
    any object. It is called by Garbage collector before destroying the objects from memory.
    finalize() method is called by default for every object before its deletion.
     */


}

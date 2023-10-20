package cour2_circle;

public class circle {
    private double radius;
    private String color;

    void setRadius(double radius) {
        ////radius = R;
        this.radius = radius;
    }

    void setColor(String color) {
        ///color = C;
        this.color = color;
    }

    double getRadius() {
        return radius;
    }

    String getColor() {
        return color;
    }

    double getArea() {
        double S;
        return S =(Math.pow(radius,2) *Math.PI);
    }

    double getCircumference() {

        return 2*radius*Math.PI;
    }

    String tooString() {
        return "Circle{"+color+" , "+radius+"}";
    }


}



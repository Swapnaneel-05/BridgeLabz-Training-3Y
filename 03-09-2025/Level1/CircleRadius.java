package BridgeLabz.OOPSJava;

public class CircleRadius {
    double radius;

    CircleRadius(){
        this(2.0);
    }

    CircleRadius(double radius){
        this.radius=radius;
    }

    void display(){
        System.out.println("Radius is: "+radius);
    }
}

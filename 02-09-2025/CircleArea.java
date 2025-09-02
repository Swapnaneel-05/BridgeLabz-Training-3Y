package BridgeLabz.OOPSJava;

public class CircleArea {
    int radius;
    public CircleArea(int radius){
        this.radius=radius;
    }
    public void displayData(CircleArea cir){
        double area=Math.PI*cir.radius*cir.radius;
        double circumference= Math.PI*cir.radius*2;

        System.out.printf("Area: %.1f Circumference: %.1f\n", area, circumference);
    }
}

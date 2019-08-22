package ee.sdacademy;

public class Area extends Shape {

    @Override
    public void Rectanglearea(int length, int breadth) {
        System.out.println("Area of Reactangle is : " + length*breadth);
    }

    @Override
    public void Squarearea(int side) {
        System.out.println("Area of Square is: " + 4*side*side);
    }

    @Override
    public void Circlearea(int radius) {
        System.out.println("Area of circle is: " + 3.142*radius*radius);
    }
}

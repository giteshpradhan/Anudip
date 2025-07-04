abstract class Shape {
    public abstract double getArea();
}

class Circle extends Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }
}

class Square extends Shape {
    int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }
}

public class MainShape {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(4);

        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Square Area: " + square.getArea());
    }
}

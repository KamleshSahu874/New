// Abstract class
abstract class Shape {
    // Abstract method
    abstract double area();
}

// Circle subclass
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement area() method
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Rectangle subclass
class Rectangle extends Shape {
    private double width, height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Implement area() method
    @Override
    double area() {
        return width * height;
    }
}

// Main class
public class Area {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        System.out.printf("Area of Circle: %.2f%n", circle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
    }
}

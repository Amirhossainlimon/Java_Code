class Shape {
    double calculateArea() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return 3.141592653589793 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {

        Shape s;

        s = new Circle(5);
        System.out.println("Circle Area = " + s.calculateArea());

        s = new Rectangle(4, 6);
        System.out.println("Rectangle Area = " + s.calculateArea());

        s = new Triangle(3, 8);
        System.out.println("Triangle Area = " + s.calculateArea());
    }
}

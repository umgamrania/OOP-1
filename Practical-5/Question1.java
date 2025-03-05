abstract class Shape {
    public abstract float area();
}

class Triangle extends Shape {
    float height, base;

    Triangle(float height, float base) {
        this.height = height;
        this.base = base;
    }

    public float area() {
        return 0.5f * height * base;
    }
}

class Rectangle extends Shape {
    float height, width;

    Rectangle(float height, float width) {
        this.height = height;
        this.width = width;
    }

    public float area() {
        return height * width;
    }
}

class Circle extends Shape {
    float radius;

    Circle(float radius) {
        this.radius = radius;
    }

    public float area() {
        return (float)(Math.PI * radius * radius);
    }
}

public class Question1 {
    public static void main(String[] args) {
        Triangle t = new Triangle(10, 20);
        Rectangle r = new Rectangle(10, 20);
        Circle c = new Circle(10);

        System.out.println("Area of triangle: " + t.area());
        System.out.println("Area of rectangle: " + r.area());
        System.out.println("Area of circle: " + c.area());
    }
}

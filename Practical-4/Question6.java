class Shape {
    float a, b;

    public void getData(float a, float b) {
        this.a = a;
        this.b = b;
    }
}

class Triangle extends Shape {
    public void displayArea() {
        System.out.println("Area of triangle: " + (0.5 * a * b));
    }
}

class Rectangle extends Shape {
    public void displayArea() {
        System.out.println("Area of rectangle: " + (a * b));
    }
}

public class Question6 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.getData(5, 10);
        t.displayArea();

        Rectangle r = new Rectangle();
        r.getData(10, 20);
        r.displayArea();
    }
}

public class Question2 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        System.out.println("Rectangle 1:");
        System.out.println("Height: " + r1.height + ", width: " + r1.width);
        System.out.println("Area: " + r1.getArea() + ", perimeter: " + r1.getPerimeter());

        System.out.println("Rectangle 2:");
        System.out.println("Height: " + r2.height + ", width: " + r2.width);
        System.out.println("Area: " + r2.getArea() + ", perimeter: " + r2.getPerimeter());
    }
}

class Rectangle {
    double height;
    double width;

    Rectangle() {
        height = width = 1;
    }

    Rectangle(double h, double w) {
        height = h;
        width = w;
    }

    double getArea() {
        return height * width;
    }

    double getPerimeter() {
        return 2 * (height + width);
    }
}

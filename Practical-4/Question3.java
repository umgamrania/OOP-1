class Shape {
    // Sqaure
    public static float area(float sideLength) {
        return sideLength * sideLength;
    }

    // Rectangle
    public static float area(float height, float width) {
        return height * width;
    }

    // Triangle (heron's formula)
    public static float area(float a, float b, float c) {
        float s = (a + b + c) / 2;
        return (float)Math.sqrt((s * (s - a) * (s - b) * (s - c)));
    }
}

public class Question3 {
    public static void main(String[] args) {
        float square = 13;
        float rHeight = 5, rWidth = 15;
        float triangleA = 3, triangleB = 5, triangleC = 7;

        System.out.println("Area of square: " + Shape.area(square));
        System.out.println("Area of rectangle: " + Shape.area(rHeight, rWidth));
        System.out.println("Area of triangle: " + Shape.area(triangleA, triangleB, triangleC));
    }
}

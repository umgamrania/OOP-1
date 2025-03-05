class Shape {
    // Cube
    public static float volume(float sideLength) {
        return sideLength * sideLength * sideLength;
    }

    // Rectangle
    public static float volume(float l, float w, float h) {
        return l * w * h;
    }

    // Sphere
    public static double volume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3.0);
    }
}

public class Question4 {
    public static void main(String[] args) {
        float square = 13;
        float l = 5, w = 10, h = 15;
        double radius = 7;

        System.out.println("Volume of cube: " + Shape.volume(square));
        System.out.println("Volume of rectangle: " + Shape.volume(l, w, h));
        System.out.println("Volume of sphere: " + Shape.volume(radius));
    }
}

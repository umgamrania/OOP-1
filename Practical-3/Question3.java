class CartesianPoint {
    int x, y;

    CartesianPoint(int n) {
        this.x = n;
        this.y = n;
    }

    CartesianPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() { return x; }
    int getY() { return y; }

    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void move(int n) {
        this.x = n;
        this.y = n;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

public class Question3 {
    public static void main(String[] args) {
        CartesianPoint p1 = new CartesianPoint(10);
        CartesianPoint p2 = new CartesianPoint(10, 20);

        System.out.println("P1: " + p1);
        System.out.println("P2: " + p2);

        p1.move(5, 15);
        p2.move(20);

        System.out.println("After move");
        System.out.println("P1: " + p1);
        System.out.println("P2: " + p2);
    }
}

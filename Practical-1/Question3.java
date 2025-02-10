public class Question3 {
    public static void main(String[] args) {
        double a = 3.4;
        double b = 50.2;
        double p = 44.5;

        double c = 2.1;
        double d = 0.55;
        double q = 5.9;

        double dm = (a * d) - (b * c);

        // cramers rule
        double x = ((p * d) - (b * q)) / dm;
        double y = ((a * q) - (c * p)) / dm;

        System.out.println("X = " + x);
        System.out.println("Y = " + y);
    }
}

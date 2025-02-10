import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter length in meters:");
        double meters = s.nextDouble();

        double feet = meters * 3.28084;

        System.out.println(meters + " meters = " + feet + " feet");
        
        s.close();
    }
}

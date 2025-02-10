import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter your weight in pounds: ");
        int weightPounds = s.nextInt();

        System.out.print("Enter your height in inches: ");
        int heightInches = s.nextInt();

        // Converting pounds to kg
        double weightKg = weightPounds * 0.45359237;

        // Converting inches to meters
        double heightMeters = heightInches * 0.0254;

        double BMI = weightKg / (heightMeters * heightMeters);

        System.out.println("Your body mass index is " + BMI);

        s.close();
    }
}

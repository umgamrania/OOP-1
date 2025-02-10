import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = s.nextInt();
        s.close();

        int p = 0;
        int newNum = 0;
        while(num > 0) {
            // incrementing each digit and wrapping back to 0 if 9
            int digit = (num % 10 + 1) % 10;
            newNum += Math.pow(10, p++) * digit;
            num = num / 10;
        }

        System.out.println(newNum);
    }
}

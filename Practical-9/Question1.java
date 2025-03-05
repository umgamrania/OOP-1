import java.util.Scanner;

public class Question1 {
    public static String dec2Bin(int value) {
        if(value == 0)
            return "0";
        else if(value == 1)
            return "1";

        return (value % 2) + dec2Bin(value / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println("Binary of " + num + " = " + dec2Bin(num));
        sc.close();
    }
}

import java.util.Scanner;

class DivideByZeroException extends Exception {
    public DivideByZeroException(String message) {
        super(message);
    }
}

public class Question1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        float a = sc.nextFloat();
        System.out.println("Enter b: ");
        float b = sc.nextFloat();
        sc.close();

        if(b == 0) {
            throw new DivideByZeroException("Division by zero");
        } else {
            System.out.println("A / B = " + (a / b));
        }
    }
}

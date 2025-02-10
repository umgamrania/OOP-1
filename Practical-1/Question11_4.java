import java.util.Scanner;

public class Question11_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = s.nextInt();
        s.close();

        // printing upper triangle
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i - 1; j++)
                System.out.print(" ");

            for(int j = 0; j < 2*i+1; j++)
                System.out.print("*");

            System.out.println("");
        }

        for(int i = 1; i < n; i++) {
            for(int j = 0; j < i; j++)
                System.out.print(" ");

            for(int j = 0; j < 2*(n-i)-1; j++)
                System.out.print("*");

            System.out.println("");
        }
    }
}

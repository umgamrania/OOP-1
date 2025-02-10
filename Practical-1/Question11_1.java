import java.util.Scanner;

public class Question11_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = s.nextInt();
        s.close();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

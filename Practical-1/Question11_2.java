import java.util.Scanner;

public class Question11_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = s.nextInt();
        s.close();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i; j++){
                System.out.print(j + 1);
            }
            System.out.println("");
        }
    }
}

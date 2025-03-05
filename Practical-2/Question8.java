import java.util.Scanner;

public class Question8 {
    public static boolean isValid(String password) {
        if(password.length() < 8)
            return false;

        for(int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if((c < 'A' || c > 'Z') && (c < 'a' || c > 'z') && (c < '0' || c > '9'))
                return false;
        }

        int digitCount = 0;
        for(int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if(c >= '0' && c <= '9')
                digitCount++;
        }

        if(digitCount < 2)
            return false;
        
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password: ");
        String password = sc.nextLine();
        
        if(isValid(password))
            System.out.println("Password is valid");
        else
            System.out.println("Password is invalid");

        sc.close();
    }
}

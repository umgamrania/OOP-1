import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        
        // converting to lower case so we only hvae to use 1 if
        String input = s.nextLine().toLowerCase();
        char letter = input.charAt(0);

        if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')
            System.out.println("Entered character is a vowel");
        else
            System.out.println("Entered character is a consonent");

        s.close();
    }
}

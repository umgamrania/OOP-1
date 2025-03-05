import java.util.Scanner;

public class Question6 {
    public static boolean isVowel(char c) {
        switch(c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        int vowels = 0;
        for(int i = 0; i < str.length(); i++) {
            if(isVowel(str.charAt(i)))
                vowels += 1;
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonents = " + (str.length() - vowels));
    }
}

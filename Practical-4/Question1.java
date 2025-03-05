public class Question1 {
    public static boolean isPalindrome(String s) {
        StringBuffer rev = new StringBuffer();

        for(int i = s.length() - 1; i >= 0; i--) 
            rev.append(s.charAt(i));

        return s.equals(rev.toString());
    }

    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++) {
            System.out.println(args[i] + (isPalindrome(args[i]) ? " is pelindrone" : " is not a pelindrone"));
        }
    }
}

import java.util.HashMap;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("India", "Delhi");
        capitals.put("USA", "Washington D.C.");
        capitals.put("Canada", "Toronto");
        capitals.put("Japan", "Tokyo");
        capitals.put("China", "Beijing");
        capitals.put("England", "London");
        capitals.put("France", "Paris");
        capitals.put("Germany", "Berlin");
        capitals.put("Italy", "Rome");
        capitals.put("Egypt", "Cairo");
        capitals.put("Brazil", "Brasilia");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter country name: ");
        String country = sc.nextLine();
        System.out.println("Capital of " + country + " is " + capitals.get(country));
        sc.close();
    }
}

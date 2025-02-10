import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the amount to withdraw: ");
        int amount = s.nextInt();
        s.close();

        int notes100 = amount / 100;
        amount = amount % 100;

        int notes50 = amount / 50;
        amount = amount % 50;

        int notes10 = amount / 10;
        amount = amount % 10;

        int notes5 = amount / 5;
        amount = amount % 5;

        int notes2 = amount / 2;
        amount = amount % 2;

        int notes1 = amount / 1;
        amount = amount % 1;

        System.out.println("Required Notes:");
        if(notes100 != 0) System.out.println("Notes of 100: " + notes100);

        if(notes50 != 0)  System.out.println("Notes of 50: " + notes50);

        if(notes10 != 0)  System.out.println("Notes of 10: " + notes10);

        if(notes5 != 0)   System.out.println("Notes of 5: " + notes5);
        
        if(notes2 != 0)   System.out.println("Notes of 2: " + notes2);

        if(notes1 != 0)   System.out.println("Notes of 1: " + notes1);

    }
}

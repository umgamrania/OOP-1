import java.util.Scanner;

class NotSufficientFund extends Exception {
    public NotSufficientFund(String msg) {
        super(msg);
    }
}

class Bank {
    int balance;

    public Bank(int bal) {
        balance = bal;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) throws NotSufficientFund {
        if(amount > balance)
            throw new NotSufficientFund("Not sufficient funds in account");

        balance -= amount;
    }
}

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter balance: ");
        Bank bank = new Bank(sc.nextInt());

        try {
            while(true) {
                System.out.println("Enter amount to withdraw: ");
                int amount = sc.nextInt();
                bank.withdraw(amount);
            }
        } catch(NotSufficientFund e) {
            System.out.println("Not sufficient funds");
        }

        sc.close();
    }
}

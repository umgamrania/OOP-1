import java.util.InputMismatchException;
import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class Bank {
    int balance;

    public void setBalance(int bal) {
        balance = bal;
    }

    public void withdraw(int amount) throws InsufficientBalanceException {
        if(amount > balance) 
            throw new InsufficientBalanceException("Cannot withdraw Rs. " + amount);
        
        balance -= amount;
        System.out.println("New Balance = " + balance);
    }

    public int getBalance() {
        return balance;
    }
}

public class Question2 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter initial balance: ");
            bank.setBalance(sc.nextInt());

            System.out.println("Enter amount to witdraw: ");
            int amount = sc.nextInt();
            
            bank.withdraw(amount);
            
        } catch(InsufficientBalanceException e) {
            System.out.println("Insufficient Balance in account");
        } catch(InputMismatchException e) {
            System.out.println("Invalid input in scanner");
        } catch(Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            System.out.println("Final Bank balance = " + bank.getBalance());
        }

        sc.close();
    }
}

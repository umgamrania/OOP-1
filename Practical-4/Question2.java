class BankAccount {
    int balance;

    public void openAccount(int balance) { this.balance = balance; }

    public void checkBalance() { System.out.println("Balance = " + balance); }

    public void withdraw(int amount) {
        if(amount <= balance) {
            System.out.println("Withdrawed " + amount);
            balance -= amount;
        }
        else {
            System.out.println("Insufficient balance");
        }
    }
}

class SavingsAccount extends BankAccount {
    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited " + amount);
    }

    public void callInterest() { this.balance += this.balance * 0.05; }
}

class FixedDepositAccount extends BankAccount {
    public void callInterest() { this.balance += this.balance * 0.1; }
}

public class Question2 {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount();
        savings.openAccount(1000);
        savings.deposit(100);
        savings.callInterest();
        savings.checkBalance();

        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount(1000);
        fd.callInterest();
        fd.checkBalance();
    }
}

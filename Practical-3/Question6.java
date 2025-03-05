import java.util.Scanner;

class Account {
    int accountId;
    String name;
    int balance;
    
    public void setValues(int accountId, String name, int balance) {
        this.accountId = accountId;
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "AccountId: " + accountId + ", Name: " + name + ", Balance: " + balance;
    }
}

public class Question6 {
    public static void search(Account[] accounts, int accountId) {
        for(Account a : accounts) {
            if(a.accountId == accountId){
                System.out.println(a);
                return;
            }
        }
        System.out.println("Account not found");
    }

    public static void main(String[] args) {
        Account[] accounts = new Account[5];

        accounts[0] = new Account();
        accounts[0].setValues(101, "Vijay", 1000);

        accounts[1] = new Account();
        accounts[1].setValues(102, "Vimal", 2000);

        accounts[2] = new Account();
        accounts[2].setValues(103, "Prakash", 3000);

        accounts[3] = new Account();
        accounts[3].setValues(104, "Pramod", 4000);

        accounts[4] = new Account();
        accounts[4].setValues(105, "Sanjay", 5000);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number to search: ");
        int accId = sc.nextInt();
        sc.close();
        
        search(accounts, accId);
    }
}
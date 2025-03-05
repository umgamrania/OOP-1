import java.util.Scanner;

class Employee {
    private String name;
    private int salary;

    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        name = sc.nextLine();
        System.out.println("Enter salary:");
        salary = sc.nextInt();
        sc.close();
    }

    public void putData() {
        System.out.println("Employee " + name + " has salary " + salary);
    }
}

public class Question4 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.getData();
        emp.putData();
    }
}

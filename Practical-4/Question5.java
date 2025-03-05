class Employee {
    protected String name;
    protected int age;
    protected int salary;

    Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

class Developer extends Employee {
    private String lang;

    Developer(String name, int age, int salary, String lang) {
        super(name, age, salary);
        this.lang = lang;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Language: " + lang + "\n");
    }
}

class Manager extends Employee {
    private String department;

    Manager(String name, int age, int salary, String department) {
        super(name, age, salary);
        this.department = department;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Department: " + department + "\n");
    }
}

public class Question5 {
    public static void main(String[] args) {
        Manager m = new Manager("Alice", 23, 50000, "IT");
        Developer d1 = new Developer("Bob", 21, 35000, "C");
        Developer d2 = new Developer("Dave", 22, 45000, "Java");
        Developer d3 = new Developer("Jake", 26, 55000, "Python");

        m.printInfo();
        d1.printInfo();
        d2.printInfo();
        d3.printInfo();
    }
}

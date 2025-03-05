interface Exam {
    public boolean pass(int marks);
}

interface Classify {
    public String division(int average);
}

class Result implements Exam, Classify {
    public boolean pass(int marks) {
        return marks >= 50;
    }

    public String division(int average) {
        if(average >= 60) 
            return "First";
        
        else if(average >= 50) 
            return "Second";
        
        return "No division";
    }
}

public class Question3 {
    public static void main(String[] args) {
        Result r = new Result();

        System.out.println("pass(75): " + r.pass(75));
        System.out.println("division(55): " + r.division(55));
    }
}

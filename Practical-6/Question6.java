class IllegalMarksException extends Exception {
    public IllegalMarksException(String msg) {
        super(msg);
    }
}

public class Question6 {
    public static void main(String[] args) throws IllegalMarksException {
        int[][] marklist = {
            {1, 45},
            {2, 37},
            {3, 67},
            {4, -12},
            {5, 87}
        };

        for(int i = 0; i < marklist.length; i++) {
            if(marklist[i][1] < 0) {
                throw new IllegalMarksException("Illegal Mark");
            }

            System.out.println("Student " + marklist[i][0] + " " + (marklist[i][1] > 40 ? "PASS" : "FAIL"));
        }
    }
}

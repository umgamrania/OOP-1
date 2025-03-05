public class Question4 {
    public static double average(String[] arr) throws Exception {
        double sum = 0;
        for(String n : arr) {
            sum += Double.parseDouble(n);
        }

        return sum / arr.length;
    }

    public static void main(String[] args) throws Exception {
        String[] arr = {"123.45", "234.56", "345.67", "45abc6.78"};
        System.out.println("Average of all numbers: " + average(arr));
    }
}

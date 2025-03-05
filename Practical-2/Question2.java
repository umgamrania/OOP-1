public class Question2 {
    public static void printMin(int[][] arr) {
        int minRow = 0;
        int minCol = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] < arr[minRow][minCol]) {
                    minRow = i;
                    minCol = j;
                }
            }
        }

        System.out.println("Minimum element is at Row " + minRow + ", column " + minCol);
    }

    public static void main(String[] args) {
        int[][] arr = {
            {32, 56, 12, 36},
            {53, 92, 34, 19},
            {45, 94, 46, 23}
        };

        printMin(arr);
    }
}

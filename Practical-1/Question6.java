import java.util.Scanner;

public class Question6 {
    private static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int maxIndex = i;

            for(int j = i; j < arr.length; j++) {
                if(arr[j] > arr[maxIndex])
                    maxIndex = j;
            }

            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int numbers[] = new int[3];

        System.out.println("Enter 3 integers: ");
        numbers[0] = s.nextInt();
        numbers[1] = s.nextInt();
        numbers[2] = s.nextInt();
        s.close();

        selectionSort(numbers);

        System.out.println("Numbers in decreasing order: ");

        for(int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " ");

    }
}

import java.util.Scanner;

public class Question5 {
    public static void selectionSort(int[] arr) {
        for(int i = 0; i < 10; i++) {
            int minIndex = i;
            for(int j = i; j < 10; j++) {
                if(arr[j] < arr[minIndex])
                    minIndex = j;
            }

            int tmp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = tmp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        System.out.println("Enter 10 elements:");
        for(int i = 0; i < 10; i++)
            arr[i] = sc.nextInt();
        
        sc.close();
        
        selectionSort(arr);

        for(int i : arr) System.out.print(i + " ");
    }
}

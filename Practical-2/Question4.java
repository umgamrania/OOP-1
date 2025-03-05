import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of array 1: ");
        for(int i = 0; i < 3; i++) 
            for(int j = 0; j < 3; j++) 
                arr1[i][j] = sc.nextInt();

        System.out.println("Enter elements of array 2: ");
        for(int i = 0; i < 3; i++) 
            for(int j = 0; j < 3; j++) 
                arr2[i][j] = sc.nextInt();
                
        String temp = sc.nextLine(); // clearing buffer
        System.out.println("Enter operation (+/-/*): ");
        char op = sc.nextLine().charAt(0);
        sc.close();

        int[][] arr;
        switch(op) {
            case '+':
                arr = add(arr1, arr2);
                break;
            
            case '-':
                arr = sub(arr1, arr2);
                break;
            
            case '*':
                arr = mul(arr1, arr2);
                break;
            
            default:
                System.out.println("Invalid operation");
                return;
        }

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) 
                System.out.print(arr[i][j] + ", ");
            System.out.println("");
        }
    }

    public static int[][] add(int[][] arr1, int[][]arr2) {
        int[][] arr = new int[3][3];

        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                arr[i][j] = arr1[i][j] + arr2[i][j];

        return arr;
    }

    public static int[][] sub(int[][] arr1, int[][]arr2) {
        int[][] arr = new int[3][3];

        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                arr[i][j] = arr1[i][j] - arr2[i][j];
                
        return arr;
    }

    public static int[][] mul(int[][] arr1, int[][]arr2) {
        int[][] arr = new int[3][3];

        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                arr[i][j] = arr1[i][j] * arr2[i][j];
                
        return arr;
    }
}

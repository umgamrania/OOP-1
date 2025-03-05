import java.util.HashSet;

public class Question3 {
    public static int[] removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr) 
            set.add(i);
        
        int[] uniqueArray = new int[set.size()];
        int index = 0;
        for(int i : set) 
            uniqueArray[index++] = i;

        return uniqueArray;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 2, 5, 6, 1, 4};
        int[] unique = removeDuplicates(arr);

        for(int i : unique)
            System.out.print(i + ", ");
    }
}

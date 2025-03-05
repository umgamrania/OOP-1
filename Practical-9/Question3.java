import java.util.ArrayList;

public class Question3 {
    public static <E extends Comparable<E>> int binarySearch(ArrayList<E> list, E key) {
        int left = 0;
        int right = list.size() - 1;
        int mid;

        while(left <= right) {
            mid = (left + right) / 2;
            if(list.get(mid).equals(key))
                return mid;
            
            if(list.get(mid).compareTo(key) < 0) // means key > mid
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(7);
        nums.add(9);

        System.out.println("Index of 7 = " + binarySearch(nums, 7));
    }
}

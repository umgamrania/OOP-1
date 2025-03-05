import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;

public class Question2 {
    public static void main(String[] args) {
        PriorityQueue<String> list1 = new PriorityQueue<>();
        list1.add("George");
        list1.add("Jim");
        list1.add("John");
        list1.add("Blake");
        list1.add("Kevin");
        list1.add("Michael");

        PriorityQueue<String> list2 = new PriorityQueue<>();
        list2.add("George");
        list2.add("Katie");
        list2.add("Kevin");
        list2.add("Michelle");
        list2.add("Ryan");

        PriorityQueue<String> union = new PriorityQueue<>();
        union.addAll(list1);
        union.addAll(list2);

        System.out.println("Union: ");
        for(String name : union)
            System.out.print(name + " ");

        PriorityQueue<String> intersection = new PriorityQueue<>();
        intersection.addAll(list1);
        intersection.retainAll(list2);

        System.out.println("\n\nIntersection: ");
        for(String name : intersection)
            System.out.print(name + " ");

        PriorityQueue<String> diff = new PriorityQueue<>();
        diff.addAll(list1);
        diff.removeAll(list2);

        System.out.println("\n\nDifference (A - B): ");
        for(String name : diff)
            System.out.print(name + " ");
    }
}
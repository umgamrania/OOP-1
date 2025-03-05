import java.util.ArrayList;

public class Question2 {
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> newList = new ArrayList<>();
        for(E item : list) {
            if(!newList.contains(item))
                newList.add(item);
        }

        return newList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(37);
        arrayList.add(25);
        arrayList.add(12);
        arrayList.add(25);
        arrayList.add(17);
        arrayList.add(22);
        arrayList.add(25);

        ArrayList<Integer> unique = removeDuplicates(arrayList);
        for(Integer i : unique) 
            System.out.print(i + " ");
    }
}
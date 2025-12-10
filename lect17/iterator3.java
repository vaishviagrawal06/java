import java.util.*;

public class iterator3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7));

        ListIterator<Integer> it = list.listIterator();

        int n = list.size();
        int midIndex = n / 2;

        System.out.println("Forward till middle:");

        while (it.hasNext() && it.nextIndex() <= midIndex) {
            System.out.print(it.next() + " ");
        }

        System.out.println("\nBackward to start:");

        while (it.hasPrevious()) {
            System.out.print(it.previous() + " ");
        }
    }
}

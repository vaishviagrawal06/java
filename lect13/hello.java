import java.util.LinkedList;

class Main {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> list1 = new LinkedList<>();

        // addFirst & addLast
        list.addFirst(10);
        list.addLast(40);
        list.addLast(50);

        // getFirst & getLast
        int first = list.getFirst();
        int last = list.getLast();

        // removeFirst & removeLast
        list.removeFirst();
        list.removeLast();

        // search operations
        boolean exist = list.contains(30);
        int idx1 = list.indexOf(100);
        int idx2 = list.indexOf(10);

        // size & empty
        int size = list.size();
        boolean isEmpty = list.isEmpty();

        // Enhanced for loop
        System.out.println("\nEnhanced for loop:");
        for (int num : list) {
            System.out.println(num);
        }

        // Output everything
        System.out.println("\nList after: " + list);
        System.out.println("List1: " + list1);

        System.out.println("First element was: " + first);
        System.out.println("Last element was: " + last);

        System.out.println("Contains 30? " + exist);
        System.out.println("Index of 100: " + idx1);
        System.out.println("Index of 10: " + idx2);

        System.out.println("Size of list: " + size);
        System.out.println("Is list empty? " + isEmpty);
    }
}

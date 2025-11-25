import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        // add() 
        list1.add(50);

        list.add(5);
        list.add(10);

        // addAll()
        list.addAll(list1);

        // get()
        System.out.println("Element at index 1: " + list.get(1));

        // set()
        list.set(0, 99);

        // remove by index
        list.remove(0);

        // remove by value
        list.remove(Integer.valueOf(0));  // does nothing (0 not present)

        // search operations
        boolean exist = list.contains(30);
        int idx1 = list.indexOf(100);
        int idx2 = list.indexOf(25);

        // size & empty check
        int size = list.size();
        boolean isEmpty = list.isEmpty();

        // loops
        System.out.println("\nNormal for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("\nEnhanced for loop:");
        for (int num : list) {
            System.out.println(num);
        }

        // Final output
        System.out.println("\nList after all operations: " + list);
        System.out.println("List1: " + list1);
        System.out.println("Contains 30? " + exist);
        System.out.println("Index of 100: " + idx1);
        System.out.println("Index of 25: " + idx2);
        System.out.println("Size of list: " + size);
        System.out.println("Is list empty? " + isEmpty);
    }
}

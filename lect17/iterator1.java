//replace odd with -1
import java.util.*;

public class hello {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        ListIterator<Integer> it = list.listIterator();

        while (it.hasNext()) {
            Integer x = it.next();
            if (x % 2 == 1) {  
                it.set(-1);   
            }
        }

        System.out.println(list);
    }
}

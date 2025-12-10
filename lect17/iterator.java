//iterator :- iterator sirf array ke andar hoti hai kyunki indexing sirf array ke andar hoti haii..
// data modify nhi kar sakte in iterator
import java.util.*;
// import java.util.Iterator;

 public class iterator{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
       list.add(3);
       list.add(4);
       list.add(5);
       list.add(6);
       Iterator<Integer> it = list.iterator();
       while(it.hasNext()){
        System.out.println(it.next());
        if(it.next()==5)
        {
            it.remove();

        }
       }
       System.out.println(list);
    }    
}

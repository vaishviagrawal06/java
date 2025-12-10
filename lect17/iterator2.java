// list iterator :- travel forward and backword both and data ko modify bhi karva sakte haii
import java.util.*;
// import java.util.Iterator;

 public class hello{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
       list.add(3);
       list.add(4);
       list.add(5);
       list.add(6); 
       ListIterator<Integer> it = list.listIterator();
       while(it.hasNext())
       {
        Integer x = it.next();
        if(x == 5){
            it.set(10);
        }
       }  
      System.out.println(list);
    }
}
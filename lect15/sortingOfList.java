import java.util.*;
class hello{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(3);
        list.add(6);
        Collections.sort(list);
        System.out.println(list); 
       }
}
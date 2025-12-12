//string api 

import java.util.ArrayList;
import java.util.List;

class hello{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        List<Integer> res = list.stream().filter(n -> n >2).toList();
        List<Integer> mapRes = list.stream().map(n -> n %2 ).toList();
        int data = list.stream().reduce(0, (a, b) -> a + b);
        List<Integer> limit = list.stream().limit(3).toList();
        List<Integer> skip = list.stream().skip(2).toList();
        List<Integer> sort = list.stream().sorted((a,b)->a-b).toList();
        System.out.println(res);
        System.out.println(mapRes); 
        System.out.println(data);
        System.out.println(limit);
        System.out.println(skip);
        System.out.println(sort);
    }
}
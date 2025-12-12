

//string api 
import java.util.ArrayList;
import java.util.List;

class hello{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        List<Integer> res = list.stream().filter(n -> n >20).toList();
        List<Integer> mapRes = list.stream().map(n -> n *2).toList();
        int data = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println(res);
        System.out.println(mapRes); 
        System.out.println(data);
    }
}
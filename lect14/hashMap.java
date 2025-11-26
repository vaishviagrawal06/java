import java.util.*;
class hashMap{
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();   // map function me primitive data type nhhi
        //  jaayega hume pura naam likhna hoga hum char nhi likh sakte hume character pura likhna hoga


        map.put(1, 30);
        map.put(2, 20);  // key unique hoti hai value is replacable
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.getOrDefault(11,0));

        for(int x : map.keySet()){
            System.out.println(map.get(x));
        }
    }
}

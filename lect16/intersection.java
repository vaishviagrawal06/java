import java.util.*;

class hello {
    public static void main(String[] args) {

        int arr1[] = {1, 2, 2, 3, 4};
        int arr2[] = {2, 2, 3, 5};

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        for(int x : arr1)
        {
            set.add(x);
        }

        for(int y : arr2)
        {
            if(set.contains(y))
            {
                intersection.add(y);  
            }
        }

        System.out.println("Intersection: " + intersection);
    }
}

import java.util.*;

class hello {
    public static void main(String[] args) {

        int arr[] = {5, 10, 20, 10};
       

        HashSet<Integer> set = new HashSet<>();
        boolean hasDuplicate = false;

        for(int num : arr){
    
            if(set.contains(num)){
                hasDuplicate = true;
                break;
            }
            else{
                set.add(num);
            }
        }

        if(hasDuplicate){
            System.out.println("Duplicate no. haii ");
        } else {
            System.out.println("Duplicate no. nhi hai");
        }
    }
}

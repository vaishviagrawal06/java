//[-1,4,-7,6] replae the negative value with its absolute value
import java.util.*;

public class iterartor4 {
    public static void main(String[] args) {
        int[] arr = {-1, 4, -7, 6};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = arr[i] * -1; 
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}

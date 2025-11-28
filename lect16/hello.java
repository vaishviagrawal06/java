// import java.util.LinkedHashSet;

// class hello{
//     // isme hamesha order maintain hota hai sort tonhi hota 
//     public static void main(String[] args) {
//         LinkedHashSet <Integer> set = new LinkedHashSet<>();
//         set.add(20);
//         set.add(30);

//     }
// } 
class main{
    public static void main(String[] args) {
        
    }
int maxSumK(int[] arr, int k) {
    int sum = 0;

    // first k window
    for (int i = 0; i < k; i++) sum += arr[i];
    
    int max = sum;

    // slide
    for (int i = k; i < arr.length; i++) {
        sum += arr[i] - arr[i - k];
        max = Math.max(max, sum);
    }
    return max;
}
}

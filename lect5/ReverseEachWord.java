// reverse a string i love java => i evol avaj
public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "i love java";
      String a[] = str.split(" ");
      StringBuilder result= new StringBuilder();

      for(String ele :a){
        StringBuilder val = new StringBuilder(ele).reverse();
        result.append(val).append(" ");
      }
      System.out.println(result); 
    }
}

// comparison of string 

class main {
    public static void main(String[] args) {
        // OUTPUT :- TRUE
        // String str = "Hello";
        // String str1 = "Hello";
        // System.out.println(str == str1);
        // System.out.println(str.equals(str1));

         String str = new String("Hello");
        String str1 = new String("Hello");
        System.out.println(str == str1);               // output :- false  
        System.out.println(str.equals(str1));          // output :- true

    }
}
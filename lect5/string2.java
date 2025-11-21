// print byee between hello

class Main{
    public static void main(String[] args) {
       StringBuilder str=new StringBuilder("hello");
    
        str.insert(1, "byee");
        System.out.println(str);
    }
}

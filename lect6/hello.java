class hello{
  static  int a=5;
   static  int data=20;
   static  int  Sum(int a){
        System.out.println("hello");
        return 0;
    }

    public static void main(String[] args) {
        int a=5;
       
        hello obj=new hello();
        int data=5;
        obj.Sum(data);
        System.out.println(a);
        System.out.println(obj.data);

    }


} 
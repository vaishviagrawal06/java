// class Main {
//     public static void main(String[] args) {

//         StringBuilder sb = new StringBuilder("hello");
//         System.out.println("Initial: " + sb);

//         // 1. append()
//         sb.append(" world");
//         System.out.println("append(): " + sb);

//         // 2. insert()
//         sb.insert(1, "BYE");
//         System.out.println("insert(): " + sb);

//         // 3. replace()
//         sb.replace(1, 4, "JAVA");
//         System.out.println("replace(): " + sb);

//         // 4. delete()
//         sb.delete(2, 6);
//         System.out.println("delete(): " + sb);

//         // 5. deleteCharAt()
//         sb.deleteCharAt(1);
//         System.out.println("deleteCharAt(): " + sb);

//         // 6. setCharAt()
//         sb.setCharAt(0, 'X');
//         System.out.println("setCharAt(): " + sb);

//         // 7. reverse()
//         sb.reverse();
//         System.out.println("reverse(): " + sb);

//         // 8. length()
//         System.out.println("length(): " + sb.length());

//         // 9. capacity()
//         System.out.println("capacity(): " + sb.capacity());

//         // 10. ensureCapacity()
//         sb.ensureCapacity(50);
//         System.out.println("ensureCapacity(50): " + sb.capacity());

//         // 11. charAt()
//         System.out.println("charAt(1): " + sb.charAt(1));

//         // 12. substring() -> returns String
//         String part = sb.substring(1, 4);
//         System.out.println("substring(1,4): " + part);

//         // 13. indexOf()
//         StringBuilder sb2 = new StringBuilder("hellohello");
//         System.out.println("indexOf(\"lo\"): " + sb2.indexOf("lo"));

//         // 14. lastIndexOf()
//         System.out.println("lastIndexOf(\"lo\"): " + sb2.lastIndexOf("lo"));

//         // 15. setLength()
//         sb2.setLength(5);
//         System.out.println("setLength(5): " + sb2);

//         // 16. getChars()
//         char[] arr = new char[5];
//         sb2.getChars(0, 5, arr, 0);
//         System.out.print("getChars(): ");
//         for(char c : arr) {
//             System.out.print(c);
//         }
//         // 17. toString()
//         String finalString = sb.toString();
//         System.out.println("\ntoString(): " + finalString);
//     }
// }



// class Main {
//     public static void main(String[] args) {
//         String str = "I love programming";
//         StringBuilder result = new StringBuilder();
        
//         String[] words = str.split(" ");

//         for (String w : words) {
//             StringBuilder rev = new StringBuilder(w);
//             result.append(rev.reverse()).append(" ");
//         }

//         System.out.println(result);
//     }
// }


// class Main {
//     public static void main(String[] args) {
//         String str = "level";
//         StringBuilder sb = new StringBuilder(str);

//         if (str.equals(sb.reverse().toString())) {
//             System.out.println("Palindrome");
//         } else {
//             System.out.println("Not Palindrome");
//         }
//     }
// }


// class Main {
//     public static void main(String[] args) {
//         String str = "aaabbccc";
//         StringBuilder sb = new StringBuilder();

//         int count = 1;
//         for (int i = 1; i < str.length(); i++) {
//             if (str.charAt(i) == str.charAt(i - 1)) {
//                 count++;
//             } else {
//                 sb.append(str.charAt(i - 1)).append(count);
//                 count = 1;
//             }
//         }
//         sb.append(str.charAt(str.length() - 1)).append(count);

//         System.out.println(sb);
//     }
// }


// class Main{
//     public static void main(String[] args) {
//         String str="aabbbccaaa"; // a3b2c2d2
//         StringBuilder result=new StringBuilder();
//         int count =1;
//         for(int i=1;i<str.length();i++){
//             if(str.charAt(i)==str.charAt(i-1)){
//                 count++;
//             }else{
//                 result.append(str.charAt(i-1)).append(count);
//                 count=1;
//             }
//         }
//         result.append(str.charAt(str.length()-1)).append(count);

//         System.out.println(result);


//         String a[]=str.split(" ");
//         StringBuilder result=new StringBuilder();

// for (String  ele : a) {
//     StringBuilder val=new StringBuilder(ele);
//     result.append(val.reverse().append(" "));
      
// }
// System.out.println(result);

        // String s1="hello";
        // String s2="";
        // for(char ch : s1.toCharArray()){
        //     s2+=ch;
        // }
        // StringBuilder str=new StringBuilder("hello");
        // System.out.println(str.length());
        // str.append("j");
        // System.out.println(str);
        // System.out.println();
        // str.insert(2, "byee");
        // System.out.println(str);
        
    // }
// 
// }


// " i love java"=> " i evol avaj" 


class Main{
    public static void main(String[] args) {
        String str="hello";
        String str1="h";
        for(char  ch : str.toCharArray()){
            str1+=ch;
        }
        StringBuilder str=new StringBuilder("hello");
         str.append("byee");
        str.insert(1, "byee");
        System.out.println(str);





   
//     }
// }







        // String a[]=str.split(" ");
    //     StringBuilder result=new  StringBuilder();
    //     for(String i : a){
    //     StringBuilder data=new  StringBuilder(i);
    //     result.append(data.reverse()).append(" ");
    //     }
        
    //     System.out.println(result);
    }

}

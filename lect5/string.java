class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("hello");
        System.out.println("Initial: " + sb);

        // 1. append()
        sb.append(" world");
        System.out.println("append(): " + sb);

        // 2. insert()
        sb.insert(1, "BYE");
        System.out.println("insert(): " + sb);

        // 3. replace()
        sb.replace(1, 4, "JAVA");
        System.out.println("replace(): " + sb);

        // 4. delete()
        sb.delete(2, 6);
        System.out.println("delete(): " + sb);

        // 5. deleteCharAt()
        sb.deleteCharAt(1);
        System.out.println("deleteCharAt(): " + sb);

        // 6. setCharAt()
        sb.setCharAt(0, 'X');
        System.out.println("setCharAt(): " + sb);

        // 7. reverse()
        sb.reverse();
        System.out.println("reverse(): " + sb);

        // 8. length()
        System.out.println("length(): " + sb.length());

        // 9. capacity()
        System.out.println("capacity(): " + sb.capacity());

        // 10. ensureCapacity()
        sb.ensureCapacity(50);
        System.out.println("ensureCapacity(50): " + sb.capacity());

        // 11. charAt()
        System.out.println("charAt(1): " + sb.charAt(1));

        // 12. substring() -> returns String
        String part = sb.substring(1, 4);
        System.out.println("substring(1,4): " + part);

        // 13. indexOf()
        StringBuilder sb2 = new StringBuilder("hellohello");
        System.out.println("indexOf(\"lo\"): " + sb2.indexOf("lo"));

        // 14. lastIndexOf()
        System.out.println("lastIndexOf(\"lo\"): " + sb2.lastIndexOf("lo"));

        // 15. setLength()
        sb2.setLength(5);
        System.out.println("setLength(5): " + sb2);

        // 16. getChars()
        char[] arr = new char[5];
        sb2.getChars(0, 5, arr, 0);
        System.out.print("getChars(): ");
        for(char c : arr) {
            System.out.print(c);
        }
        // 17. toString()
        String finalString = sb.toString();
        System.out.println("\ntoString(): " + finalString);
    }
}
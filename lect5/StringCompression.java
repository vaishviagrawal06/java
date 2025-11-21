// aabbcab compress it a2b2c1a1b1

public class StringCompression {
    public static void main(String[] args) {
        String str = "aabbcab";
        StringBuilder comp = new StringBuilder();

        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if ( str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                comp.append(str.charAt(i-1)).append(count);
                count = 1; 
            }
        }

       System.out.println(comp.toString());
    }
}


// pallindrome 

class Main 
{
    public static void main(String[] args) 
    {
        String a = "aba";
        String b = "";
        for(int i=a.length()-1;i>=0;i--)
        {
            b=b+a.charAt(i);
        } 
        if(a.equals(b))
        {
            System.out.println("isPalindrome");
        }
        else
        {
            System.out.println("notPalindrome");
        }

    }

}
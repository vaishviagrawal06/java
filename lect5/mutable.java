// MUTABLE - jo infuture kabhi bhi change kar sakte hai
//IMMUTABLE - jisko aap kabhi kbi change nhi kar sakte 
class Main {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("hiiiiii");
        str.insert(2, "bye");
        System.out.println(str);

    }
}

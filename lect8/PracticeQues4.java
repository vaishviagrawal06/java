class Book {
    void read() {
        System.out.println("Reading a book");
    }
 }
 class Novel extends Book {
    void story() {
        System.out.println("novel has some interesting stroies");
    }
 }
 class main {
    public static void main(String[] args) {
        Novel n = new Novel();
        n.read();
        n.story();
    }
 }
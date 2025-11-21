//multiple inheritace - java support nhi karta kyunki vahan par conflict create ho jata .. kyunki vo optimum nhii hota haii
//interface - iske through hum multiple inheritance ko supprot karwane ki koshish karenge
//interface ke method me koi hi non abstract method nhi hota hai vahan par sab abstract hote hai chahe vaha par abstrct word lagao ya nhi..
//method me jo bhi chiz banao vo hamesha public hota haii
// forcefully kam karwana hai to hum interface a use karenge
// isi ko kehte hai DIAMOND PROBLEM

interface A {
    void showA();
}

interface B {
    void showB();
}

class C implements A, B {

    public void showA() {
        System.out.println("Interface A");
    }

    public void showB() {
        System.out.println("Interface B");
    }
}

public class Main {
    public static void main(String[] args) {

        C obj = new C();
        obj.showA();
        obj.showB();
    }
}


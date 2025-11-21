//multiple inheritace - java support nhi karta kyunki vahan par conflict create ho jata .. kyunki vo optimum nhii hota haii
//interface - iske through hum multiple inheritance ko supprot karwane ki koshish karenge
//interface ke method me koi hi non abstract method nhi hota hai vahan par sab abstract hote hai chahe vaha par abstrct word lagao ya nhi..
//method me jo bhi chiz banao vo hamesha public hota haii
// forcefully kam karwana hai to hum interface a use karenge

interface A {
    void showA();
    //void data();      
    // data method yaha par declare kar diya par uski body nhi banai to error generate hogi ye dikkat java ver7 tak nhi hoti thi after that ver 8 se dikkat hone lagi 
    // to RESOLVE this hum YAHIN PAR METHOD KI BODY LIKH SAKTE HAI OR USME "DEFAULT" USE KARTE HAII
    default void data(){
        System.out.println("hello");
    }

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
        obj.data();
        obj.showB();
    }
}


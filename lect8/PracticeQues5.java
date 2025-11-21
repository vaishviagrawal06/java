 class Device {
    void power() {
        System.out.println("Device is power on");
    }
 }
 class Laptop extends Device {
    void boot() {
        System.out.println("Laptop is booting");
}
    }
 class GamingLaptop extends Laptop {
    void startGame() {
        System.out.println("Game is starting");
    }
 }
 public class main {
    public static void main(String[] args) {
        GamingLaptop g = new GamingLaptop();
        g.power();
        g.boot();
        g.startGame();
    }
 }
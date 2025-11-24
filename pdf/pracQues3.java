/*Create an interface Animal with a method makeSound().
 Then, create a class Dog that implements Animal and overrides makeSound() to print "Bark".
 In the main method, use the interface reference to call the method from Dog..*/



interface Animal{
   void makeSound();
 }

 class Dog implements Animal{
   public void makeSound()
{
   System.out.println(" dog barks");
}
 }
class main{
   public static void main(String[] args) {
      Animal a = new Dog();
      a.makeSound();
   }
}
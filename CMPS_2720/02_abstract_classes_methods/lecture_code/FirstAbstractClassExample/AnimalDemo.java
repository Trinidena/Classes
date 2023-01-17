public class AnimalDemo
{
   public static void main(String[] args)
   {
      /* Uncommenting the follow statement will 
         cause an error because the Animal class is
         abstract and abstract classes cannot be 
         instantiated. */
         
      // Animal animal = new Animal();
      
      Cat aCat = new Cat();
      Dog aDog = new Dog();
      Frog aFrog = new Frog();
      
      System.out.println(aCat);
      System.out.println(aDog);
      System.out.println(aFrog);
   }
}
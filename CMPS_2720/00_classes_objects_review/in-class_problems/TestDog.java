public class TestDog
{
   public static void main(String[] args)
   {
      // Using the new constructor to make Dog objects.
      Dog dog1 = new Dog("Rover", "Mutt", 3);
      Dog dog2 = new Dog("Fido", "German Shepard", 2);
      Dog dog3 = new Dog("Fluffy");
      
      System.out.println(dog1);        
      dog1.speak();    
      
      System.out.println(dog2);     
      dog2.speak();
     
      System.out.println(dog3);
      dog3.speak();       
   }            
}
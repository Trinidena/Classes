public class TestDog
{
   public static void main(String[] args)
   {
      // Using the new constructor to make Dog objects.
      Dog dog1 = new Dog("Rover", "Mutt", 3);
      Dog dog2 = new Dog("Fido", "German Shepard", 2);
   
      System.out.printf("%s is a %d year old %s.%n", dog1.getName(),
         dog1.getAge(), dog1.getBreed());
         
     dog1.speak();    
      
      System.out.printf("%s is a %d year old %s.%n", dog2.getName(),
         dog2.getAge(), dog2.getBreed());
     
     dog2.speak();  
   }            
}
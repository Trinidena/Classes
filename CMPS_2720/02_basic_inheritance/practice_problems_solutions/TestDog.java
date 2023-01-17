public class TestDog
{
   public static void main(String[] args)
   {
      Dog dog1 = new Dog("Fluffy", "Brown", 2015);
      PoliceDog dog2 = new PoliceDog("Tiger", "Orange", 2014,"Chattanooga");
      Dog dog3 = new Dog("Fido", "Yellow", 2012);
      PoliceDog dog4 = new PoliceDog("Zeus", "Black", 2016, "Dalton");
      
      Dog[] dogs = {dog1, dog2, dog3, dog4};
      
      for(int i = 0; i < dogs.length; i++)
      {
         System.out.println(dogs[i]);
      }

   }
}
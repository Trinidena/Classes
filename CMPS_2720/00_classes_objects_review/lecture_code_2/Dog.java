public class Dog
{
   private String name;
   private String breed;
   private int age;
   
   // Here is the constructor for the Dog class.
   public Dog(String name, String breed, int age)
   {
      this.name = name;
      this.breed = breed;
      this.age = age;
   }
   
   public void speak()
   {
      System.out.println(name + ":  Woof!\n");
   }
   
   public int getAge()
   {
      return age;
   }
   
   public void setAge(int age)
   {
      this.age = age;
   }
   
   public String getBreed()
   {
      return breed;
   }
   
   public void setBreed(String breed)
   {
      this.breed = breed;
   }
   
   public String getName()
   {
      return name;
   }
   
   public void setName(String name)
   {
      this.name = name;
   }
}
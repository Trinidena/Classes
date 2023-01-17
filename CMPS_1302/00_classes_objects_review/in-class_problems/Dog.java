public class Dog
{
   private String name;
   private String breed;
   private int age;
   
   public Dog(String name)
   {
      this(name, "unknown", 999);
   }
   
   public Dog(String name, String breed, int age)
   {
      this.name = name;
      this.breed = breed;
      this.age = age;
   }
   
   @Override
   public String toString()
   {
      return String.format("%s is a %d year old %s.", name, age, breed);
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
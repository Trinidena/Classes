public class Person
{  
   private String name;
   private int age;
   
   public Person(String name, int age)
   {
      this.name = name;
      this.age = age;
   }
   
   @Override
   public String toString()
   {
      return String.format("Name: %s  Age: %d", name, age);
   }
}
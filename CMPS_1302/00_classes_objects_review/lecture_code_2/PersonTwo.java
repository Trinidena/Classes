public class PersonTwo
{
   private int number;
   private int age;
   
   public Person(int age, int number)
   {
      this.age = age;
      this.number = number;
   }
   
   @Override 
   public String toString()
   {
      return String.format("age:  %d  number:  %d", age, number);
   }
   
   public void printWhatever()
   {
      System.out.println("whatever");
   }
   
   public static void printBlah()
   {
      System.out.println("blah");
   }
}
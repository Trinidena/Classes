public class AutoTypeConversions
{
   public static void main(String[] args)
   {
      // Primitive types.
      int a = 15;
      double b = a; // Java automatically converts the int to a double.
      System.out.println(b);
      
      // Reference types.
      
      // Java automatically converts the Student object to a Person object.
      Person p1 = new Student("Alice", 19, 4.0);
      System.out.println(p1);
   }
}
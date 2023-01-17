public class ReferenceCopy
{
   public static void main(String[] args)
   {
      // Create a Person object a.
      Person a = new Person("Alice");
      
      // Copy the value of a to b.
      Person b = a;
      
      System.out.print("a:  ");
      System.out.println(a);
      System.out.print("b:  ");      
      System.out.println(b);
      System.out.println();
      
      // Change the value of a
      a.setName("Charlie");
      
      // Changing the original changed the copy!
      System.out.print("a:  ");      
      System.out.println(a);
      System.out.print("b:  ");      
      System.out.println(b);
      System.out.println();
      
      // Change the value of the copy.
      b.setName("Daniels");
      
       // Verify that the original a is unchanged.
      System.out.print("a:  ");       
      System.out.println(a);
      System.out.print("b:  ");      
      System.out.println(b);       
   }
}
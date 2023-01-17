public class PrimitiveCopy
{
   public static void main(String[] args)
   {
      // Create the variable a.
      int a = 3;
      
      // Copy the value of a to b.
      int b = a;
      
      System.out.printf("a: %d  b:  %d%n", a, b);
      
      // Change the value of a
      a = 15;
      
      // Verify that the copy b is unchanged.
      System.out.printf("a: %d  b:  %d%n", a, b);
      
      // Change the value of the copy.
      b = -10;
      
       // Verify that the original a is unchanged.
      System.out.printf("a: %d  b:  %d%n", a, b);          
   }
}
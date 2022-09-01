import java.util.Arrays;

public class ChangingArrayCopyChangesOriginal
{
   public static void main(String[] args)
   {
      // Create a variable of primitive type.
      int a = 3;
      
      // Make a copy.
      int b = a;
      
      System.out.printf("a:  %d\t\tb:  %d%n", a, b);
      
      // Change the copy.
      b = 7;
      
      // Verify no change to original.
      System.out.printf("a:  %d\t\tb:  %d%n", a, b);
      
      // Change original.
      a = 2;
      
      // Verify no change to copy.
      System.out.printf("a:  %d\t\tb:  %d%n", a, b);
      
      System.out.println("Reason:  Primitive types are stored by value.\n\n");
      
      // Create an array.
      int[] c = {4, 7, 9};
      
      // Make a copy.
      int[] d = c;
      
      System.out.printf("c:  %s\t\td:  %s%n", Arrays.toString(c), Arrays.toString(d));
      
      // Change the copy
      d[0] = 99;
      
      // Changes the original!
      System.out.printf("c:  %s\t\td:  %s%n", Arrays.toString(c), Arrays.toString(d));
      
      // Change the original.
      c[2] = -1000;
      
      // Changes the copy!  
      System.out.printf("c:  %s\t\td:  %s%n", Arrays.toString(c), Arrays.toString(d));

      System.out.println("Reason:  Arrays and objects are stored by reference.\n\n");
      
      System.out.println("Memory Address Hash of c:  " + c);
      System.out.println("Memory Address Hash of d:  " + d);
      System.out.println("Same!");          
   }
}
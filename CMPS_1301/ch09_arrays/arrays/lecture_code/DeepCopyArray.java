import java.util.Arrays;

public class DeepCopyArray
{
   public static void main(String[] args)
   {
      // Create an array.
      int[] c = {4, 7, 9};
      
      // Make a deep copy by:
      
      // 1. Creating a brand new array with same length.
      int[] d = new int[c.length];
      
      // 2. Using a for loop to copy over the values one by one.
      for(int i = 0; i < d.length; i++)
      {
         d[i] = c[i];
      }
      
      System.out.printf("c:  %s\t\td:  %s%n", Arrays.toString(c), Arrays.toString(d));
      
      // Change the copy
      d[0] = 99;
      
      // Verify original is unchanged.
      System.out.printf("c:  %s\t\td:  %s%n", Arrays.toString(c), Arrays.toString(d));
      
      // Change the original.
      c[2] = -1000;
      
      // Verify copy is unchanged.  
      System.out.printf("c:  %s\t\td:  %s%n", Arrays.toString(c), Arrays.toString(d));

      System.out.println("\nReason:  c and d have different references because of the deep copy.\n");
      
      System.out.println("Memory Address Hash of c:  " + c);
      System.out.println("Memory Address Hash of d:  " + d);
      System.out.println("Different.");             
   }
}
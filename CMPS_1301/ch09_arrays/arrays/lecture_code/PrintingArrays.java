public class PrintingArrays
{
   public static void main(String[] args)
   {
      int[] nums = {9, 3, 2, -6};
      
      /* Uses default toString, so does not
         print elements. */
      System.out.println( nums );
   
      // Using a loop to print the elements
      for(int i = 0; i < nums.length; i++)
      {
         System.out.print( nums[i] + " ");  
      }
   }
}
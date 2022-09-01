public class ArraysLoops
{
   public static void main(String[] args)
   {
      int[] nums = { 3, 8, -12, 45, 98, 23, 101, -56, 117};
      
      // Printing Arrays
      System.out.println(nums);  // Does not work well.
      
      for(int i = 0; i < nums.length; i++)
      {
         System.out.print( nums[i] + " ");
      }
      
      // Searching an Array
      
      for(int i = 0; i < nums.length; i++)
      {
         if( nums[i] == 23 )
         {
            System.out.println("\nFound it at spot " + i + ".");
            break;  
         }
      }
      
      // Totaling the Numbers in an Array
      
      int total = 0;
      for(int i = 0; i < nums.length; i++)
      {
         total = total + nums[i];
      }
      
      System.out.println("Total is " + total);
      
      // Counting the number of elements that satisfy a certain condition.
      // Example: Count how many negative numbers are in the array.
      
      int count = 0;
      for(int i = 0; i < nums.length; i++)
      {
         if( nums[i] < 0 )
         {
            count++;
         }
      }
      
      System.out.println("There are " + count + " negative numbers in the array.");
   }
}
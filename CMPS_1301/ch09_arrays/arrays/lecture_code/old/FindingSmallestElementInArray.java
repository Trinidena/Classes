public class FindingSmallestElementInArray
{
   public static void main(String[] args)
   {
      int[] nums = { 3, 8, -12, 45, 98, 23, 101, -56, 117};
      
      /* Initialize min to nums[0].  It is the smallest
         number we have found so far. */
  
      int min = nums[0];
      
      //  No need to check nums[0] so start loop at 1.      
      
      for(int i = 1; i < nums.length; i++)
      {
         if(nums[i] < min) // Check to see if nums[i] is smaller than current min.
         {
            min = nums[i]; // If so, nums[i] is the new min.
         }
      }
      
      System.out.printf("The smallest element in the array is %d.%n", min);
   }
}
public class FindingIndexOfElementInArray
{
   public static void main(String[] args)
   {
      int[] nums = { 3, 8, -12, 45, 98, 23, 101, -56, 117};
      
      /* Initialize index to -1 because we know that -1
         is never a valid array index. */
  
      int index = -1;
            
      for(int i = 0; i < nums.length; i++)
      {
         if(nums[i] < 0)
         {
            index = i;
            break; // Found the first one, so no need to continue looking.
         }
      }
      
      if(index > -1)
      {
         System.out.printf("The first negative number in the array is at index %d.%n", index);
      }
      else
      {
         System.out.println("I didn't find any negative numbers.");
      }   
   }
}
public class CountingElementsInArrays
{
   public static void main(String[] args)
   {
      int[] nums = { 3, 8, -12, 45, 98, 23, 101, -56, 117};
            
      int count = 0;
      
      for(int i = 0; i < nums.length; i++)
      {
         if(nums[i] < 0)
         {
            count++;
         }
      }
      
      System.out.printf("There are %d negative numbers in the array.%n", count);
   }
}
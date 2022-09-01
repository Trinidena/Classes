public class TotalingArrays
{
   public static void main(String[] args)
   {
      int[] nums = { 3, 8, -12, 45, 98, 23, 101, -56, 117};
            
      int total = 0;
      
      for(int i = 0; i < nums.length; i++)
      {
         total = total + nums[i];
      }
      
      System.out.printf("The total is %d.%n", total);
   }
}
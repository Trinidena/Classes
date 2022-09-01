public class TotalArray
{
   public static void main(String[] args)
   {
      int[] nums = {4, 7, 2, 6, 7};
      
      int total = 0;
      for(int i = 0; i < nums.length; i++)
      {
         total = total + nums[i];
      }
      System.out.println(total);
   }
}
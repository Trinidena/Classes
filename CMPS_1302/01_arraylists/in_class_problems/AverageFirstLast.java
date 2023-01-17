import java.util.ArrayList;

public class AverageFirstLast
{
   public static void main(String[] args)
   {
      ArrayList<Integer> nums = new ArrayList<Integer>();
      
      nums.add(2);
      nums.add(3);
      nums.add(8);
      
      System.out.println(averageFirstLast(nums));   
   }
   
   public static int averageFirstLast(ArrayList<Integer> a)
   {
      return (a.get(0) + a.get(a.size() - 1)) / 2; 
   }
   
}
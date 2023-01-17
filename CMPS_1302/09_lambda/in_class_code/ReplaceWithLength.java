import java.util.ArrayList;
import java.util.List;

public class ReplaceWithLength
{
   public static void main(String[] args)
   {
      ArrayList<Integer> nums = new ArrayList<Integer>();
      nums.addAll(List.of(3, 4, 2, 9, 0, 11, 13));
      
      System.out.println(nums);
      nums.replaceAll(n -> nums.size());
      System.out.println(nums);             
   }   
}
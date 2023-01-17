import java.util.ArrayList;
import java.util.List;

public class RemoveOddMultiplesOfThree
{
   public static void main(String[] args)
   {
      ArrayList<Integer> nums = new ArrayList<Integer>();
      nums.addAll(List.of(3, 4, 12, 9, 0, 36, 13));
      
      System.out.println(nums);
      nums.removeIf(n -> n % 2 != 0 && n % 3 == 0);
      System.out.println(nums);             
   }   
}
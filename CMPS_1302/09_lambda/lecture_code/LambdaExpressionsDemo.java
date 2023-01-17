import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.*;

public class LambdaExpressionsDemo
{
   public static void main(String[] args)
   {
      List<Integer> nums1 = new ArrayList<Integer>(
         List.of(9, -2, 3, 8, 2, 7, -6, -9, 0, 4, -5));
         
      List<Integer> nums2 = new ArrayList<Integer>(
         List.of(9, -2, 3, 8, 2, 7, -6, -9, 0, 4, -5));
      
      List<Integer> nums3 = Arrays.asList(1, 2, 3);
      
      //Map<Integer, String>
      System.out.println(nums1);
      
      nums3.replaceAll(n -> 2 * n);
      System.out.println(nums3);
      
      nums1.removeIf(x -> x < 0);
      System.out.println(nums1);
      
      nums1.forEach(x -> System.out.println(x)); //System.out::println);
      
      nums3 = nums1.stream()
                   .filter(x -> x < 8)
                   .collect(Collectors.toCollection(ArrayList::new));
      System.out.println(nums1);             
      nums1.forEach(System.out::println);
      
      nums3.removeIf(x ->{
         if(1 < x && x < 5)
            return true;
         else if(x == 2)
            return false;
         else 
            return true;});            
      
                  
   }
}
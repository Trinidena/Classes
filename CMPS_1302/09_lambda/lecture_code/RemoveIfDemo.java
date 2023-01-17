import java.util.*;

public class RemoveIfDemo
{
   public static void main(String[] args)
   {
      List<Integer> nums = new ArrayList<Integer>(
         List.of(9, -2, 3, 8, 2, 7, -6, -9, 0, 4, -5));
         
      System.out.println(nums);
      
      nums.removeIf(n -> n % 2 == 0);
      
      System.out.println(nums);
      
      List<String> words = new ArrayList<String>(
         List.of("alpha", "bravo", "charlie", "delta", "echo"));
         
      System.out.println(words);
      
      words.removeIf(s -> s.endsWith("a"));
      
      System.out.println(words);
      
      Map<String, Integer> map = new HashMap<String, Integer>();
      map.put("alpha", 1);
      map.put("bravo", 2);
      map.put("charlie", 3);
      map.put("delta", 4);
      map.put("echo", 5);
      
      System.out.println(map);
      
      map.entrySet().removeIf(e -> e.getKey().length() > 2 * e.getValue() - 1);
      
      System.out.println(map);                             
   }
}
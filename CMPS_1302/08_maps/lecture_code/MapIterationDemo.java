import java.util.*;

public class MapIterationDemo
{
   public static void main(String[] args)
   {
      Map<String, Integer> map = new HashMap<String, Integer>();
      
      map.put("Bob", 5);
      map.put("Dan", 7);
      map.put("Jan", 3);
      map.put("Ada", 6);
            
      // Iterate over the keys.
      Set<String> keys = map.keySet();
      for(String key : keys)
      {
         System.out.println(key);
      }
      
      // Iterate over the values.
      Collection<Integer> values = map.values();
      for(Integer value : values)
      {
         System.out.println(value);
      }
      
      // Iterate over both keys and values.
      Set<Map.Entry<String, Integer>> entries = map.entrySet();
      for(Map.Entry<String, Integer> entry : entries)
      {
         System.out.printf("Key:  %s  Value:  %d%n", entry.getKey(), entry.getValue());
      }
   }
}
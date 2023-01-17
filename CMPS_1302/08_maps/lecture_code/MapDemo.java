import java.util.*;

public class MapDemo
{
   public static void main(String[] args)
   {
      Map<String, Integer> map = new HashMap<String, Integer>();
      
      // Add a (key, value) pair to the map.
      map.put("Bob", 5);
      map.put("Dan", 7);
      map.put("Jan", 3);
      map.put("Ada", 6);
      
      System.out.println(map);
      
      // Reassign the value of Ada
      map.replace("Ada", 9);
      
      System.out.println(map);
      
      // Remove the (key, value) pair with key Dan.
      map.remove("Dan");
      
      System.out.println(map);
      
      // Lookup the value for Jan
      System.out.println(map.get("Jan"));
      
      System.out.println(map.containsKey("Tom"));
      System.out.println(map.containsKey("Bob"));
       
   }
}
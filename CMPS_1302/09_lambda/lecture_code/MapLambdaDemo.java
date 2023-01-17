import java.util.Map;
import java.util.HashMap;

public class MapLambdaDemo
{
   public static void main(String[] args)
   {
      Map<String, Integer> map = new HashMap<String, Integer>();
      map.put("cat", 0);
      map.put("dog", 0);
      map.put("giraffe", 0);
      map.put("frog", 0);
      System.out.println(map);
      map.forEach((k, v) -> k.length());
      System.out.println(map);
   }
}
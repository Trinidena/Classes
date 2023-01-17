import java.util.*;

public class CharacterStringMap
{
   public static void main(String[] args)
   {
      Map<Character, String> map = new HashMap<Character,String>();
      map.put('a', "apple");
      map.put('b', "bravo");
      map.put('c', "charlie");
      map.put('d', "delta");
      map.put('e', "echo");
      
      System.out.println(map);
      System.out.println(map.get('d'));
      
   }
}
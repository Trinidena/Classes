import java.util.List;

public class TestLinkdList
{
   public static void main(String[] args)
   {
      List<String> words = new LinkdList<>();
      for(int i = 0; i < 5; i++)
      {
         words.add(Character.toString((char)(i + 102)));
      }
      
      List<Integer> numbers = new LinkdList<>();
      for(int i = 0; i < 5; i++)
      {
         numbers.add(3 * i - 7);
      }
      
      words.add(3, "b");
      numbers.add(2, 17);
      
      System.out.println(words.get(4));
      System.out.println(numbers.get(0)); 
      
      System.out.println(words.set(5, "z"));
      System.out.println(numbers.set(4, 45));
      
      System.out.println(words.indexOf("i")); 
      System.out.println(words.indexOf("c")); 
      System.out.println(numbers.indexOf(-7)); 
      System.out.println(numbers.indexOf(102)); 
      
      System.out.println(words.contains("i")); 
      System.out.println(words.contains("c")); 
      System.out.println(numbers.contains(-7)); 
      System.out.println(numbers.contains(102));
      
      System.out.println(words.remove(4));
      System.out.println(numbers.remove(5));
      
      System.out.println(words.remove("f"));
      System.out.println(numbers.remove(Integer.valueOf(17)));                               
   }
}
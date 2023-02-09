import java.util.List;

public class TestLinkdList
{
   public static void main(String[] args)
   {
      List<String> words = new LinkdList<>();
      words.add("a");
      words.add("b");
      words.add("c");
      words.add("d");
      words.add(0,"e");
      words.add(3,"f");
      words.add(5,"g");
            
      List<Integer> numbers = new LinkdList<>();
      numbers.add(45);
      numbers.add(65);
      numbers.add(87);
      numbers.add(0,19);
      
      System.out.println(words.size());
      System.out.println(numbers.size());
      
      System.out.println(words.get(3));
      System.out.println(numbers.get(0));
      
      System.out.println(words.set(4 , "h"));
      System.out.println(numbers.set(0 , 34));
      System.out.println(numbers.set(3 , 99));
      
      System.out.println(words.indexOf("f"));
      System.out.println(words.indexOf("abc"));
      System.out.println(words.indexOf("e"));
      System.out.println(words.indexOf("d"));
      
      System.out.println(words.contains("h"));
      System.out.println(words.contains("c"));
      System.out.println(numbers.contains(34));
      System.out.println(numbers.contains(-25));
      
      System.out.println(words.remove(4));
      System.out.println(words.remove(0));
      System.out.println(words.remove(4));
      
      System.out.println(words.remove("h"));
      System.out.println(words.remove("e"));
      System.out.println(words.remove("d"));
      
   }
}
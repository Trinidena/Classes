import java.util.List;

public class TestArrList
{
   public static void main(String[] args)
   {
      List<String> words = new ArrList<>(3);
      List<Integer> numbers = new ArrList<>(3);
      
      words.add("a");
      words.add("b");
      words.add("c");
      words.add("d");
      words.add("e");
      
      numbers.add(12);
      numbers.add(13);
      numbers.add(14);
      numbers.add(15);
      numbers.add(16);
      
      words.add(1 , "c");
      words.add(0 , "d");
      
      System.out.println(words.size());
      System.out.println(numbers.size());
      
      System.out.println(words.get(1));
      System.out.println(numbers.get(0));
      
      System.out.println(words.set(0 , "e"));
      System.out.println(numbers.set(3 , 45));
      
      System.out.println(words.indexOf("c"));
      System.out.println(words.indexOf("z"));
      System.out.println(numbers.indexOf(12));
      System.out.println(numbers.indexOf(99));
      
      System.out.println(words.contains("c"));
      System.out.println(words.contains("asdf"));
      System.out.println(numbers.contains(12));
      System.out.println(numbers.contains(1234));
      
      words.remove(3);
      words.remove("c");
      numbers.remove(2);
      numbers.remove(new Integer(12));
      
      
   }
}
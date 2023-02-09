import java.util.List;
import java.util.ArrayList;

public class TestArrList
{
   public static void main(String[] args)
   {
      List<String> words = new ArrList<>();
      for(int i = 0; i < 20; i++)
      {
         words.add(Character.toString((char)(i+ 97)));
      }

      List<Integer> ints = new ArrList<>();
      for(int i = 0; i < 50; i++)
      {
         ints.add(3 * i + 2 );
      }
      
      words.add(4, "Whatever");
      ints.add(3, 26);  
      
      System.out.println(words.get(7));
      System.out.println(ints.get(4));
      
      System.out.println(words.set(1, "blah"));
      System.out.println(ints.set(8, 45)); 
      
      System.out.println(words.indexOf("g"));
      System.out.println(words.indexOf("adsfasdfasdfas"));
      System.out.println(ints.indexOf(45));
      System.out.println(ints.indexOf(92342342));
      
      System.out.println(words.contains("g"));
      System.out.println(words.contains("adsfasdfasdfas"));
      System.out.println(ints.contains(45));
      System.out.println(ints.contains(92342342));
      
      System.out.println(words.remove(11));
      System.out.println(ints.remove(5));   
      
      System.out.println(words.remove("blah"));
      System.out.println(words.remove("blah")); 
      
      System.out.println(ints.remove(new Integer(45)));
      System.out.println(ints.remove(new Integer(45)));               
   }
}
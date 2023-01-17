import java.util.ArrayList;

public class PrintEveryOtherReverse
{
   public static void main(String[] args)
   {
      ArrayList<String> list = new ArrayList<String>();
      
      list.add("one");
      list.add("two");
      list.add("three");
      list.add("four");
      list.add("five");
      
      printEveryOtherReverse(list);
   }
   
   public static void printEveryOtherReverse(ArrayList<String> a)
   {
      for(int i = a.size() - 1; i > -1; i-=2)
      {
         System.out.println(a.get(i));
      } 
   }
}
public class TestOrderedList
{
   public static void main(String[] args)
   {
      OrderedList<String> list = new OrderedList<>();
      list.insert("h");
      list.insert("a");
      list.insert("u");
      list.insert("d");
      list.insert("z");
      list.insert("r");
      list.insert("x");
      list.insert("n");
      list.insert("z");
      
      System.out.println(list);                   
   }
}
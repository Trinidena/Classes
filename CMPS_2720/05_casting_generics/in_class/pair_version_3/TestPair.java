public class TestPair
{
   public static void main(String[] args)
   {
      Pair p1 = new Pair("Alice", 4.56);
      Pair p2 = new Pair(43, new Pair(1.23, 42.2));
      System.out.println(p1);
      System.out.println(p2);
      
      String word = (String)p1.getFirst();
      double num1 = (double)p1.getSecond();
      int num2 = (int)p2.getFirst();
      Pair p3 = (Pair)p2.getSecond();
      
      System.out.println(word);
      System.out.println(num1);
      System.out.println(num2);
      System.out.println(p3);
   }
}
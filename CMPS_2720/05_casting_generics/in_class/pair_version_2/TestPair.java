public class TestPair
{
   public static void main(String[] args)
   {
      Pair p1 = new Pair(new Person("Alice", 32), 8);
      Pair p2 = new Pair(new Person("Bob", 22), 43);
      System.out.println(p1);
      System.out.println(p2);
   }
}
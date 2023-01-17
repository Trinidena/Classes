public class TestPair
{
   public static void main(String[] args)
   {
      Pair<String, Double> pair1 = new Pair<>("whatever", 3.14);
      Pair<Integer, Pair<String, String>> pair2 = new Pair<>(45, new Pair<>("alpha", "beta"));
      
      System.out.println(pair1);
      
      System.out.println(pair2);
   }
}
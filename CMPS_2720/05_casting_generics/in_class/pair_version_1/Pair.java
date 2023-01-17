public class Pair
{
   private String first;
   private double second;
   
   public Pair(String first, double second)
   {
      this.first = first;
      this.second = second;
   }
   
   public String getFirst()
   {
      return first;
   }
   
   public double getSecond()
   {
      return second;
   }
   
   @Override
   public String toString()
   {
      return String.format("(%s, %.2f)", first, second); 
   }
}
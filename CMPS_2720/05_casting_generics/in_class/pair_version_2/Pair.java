public class Pair
{
   private Person first;
   private int second;
   
   public Pair(Person first, int second)
   {
      this.first = first;
      this.second = second;
   }
   
   public Person getFirst()
   {
      return first;
   }
   
   public int getSecond()
   {
      return second;
   }
   
   @Override
   public String toString()
   {
      return String.format("(%s, %d)", first.toString(), second); 
   }
   
}
public class OrderedPair
{
   int x;
   int y;
   
   public OrderedPair(int x)
   {
      this.x = x;
   }
   
   public void updateY()
   {
      y = 3 * x * x - 2 * x + 7;
   }
   
   @Override
   public String toString()
   {
      return String.format("(%2d, %2d)", x, y);
   }
}
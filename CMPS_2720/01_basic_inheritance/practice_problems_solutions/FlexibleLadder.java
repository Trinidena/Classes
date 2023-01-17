public class FlexibleLadder extends Ladder
{
   private int articulations;
   
   // Constants used in price calculation
   private static final double PRICE_PER_INCH_FLEX = 3.50;
   private static final double PRICE_PER_ARTICULATION = 5.50;
   
   public FlexibleLadder(String color, int height, int articulations)
   {
      super(color, height);
      this.articulations = articulations;
      updatePrice(); 
   }
   
   @Override
   public String toString()
   {
      return String.format("%s  Articulations:  %d", super.toString(), articulations);
   }
   
   public int getArticulations()
   {
      return articulations;
   }
   
   public void setArticulations(int articulations)
   {
      this.articulations = articulations;
      updatePrice();
   }
   
   @Override
   public void setHeight(int height)
   {
      this.height = height;
      updatePrice();
   }
   
   /* Marked as final to prevent overriding as method
      is called by constructor */   
   private final void updatePrice()
   {
      this.price = PRICE_PER_INCH_FLEX * height + PRICE_PER_ARTICULATION * articulations;   
   }
}
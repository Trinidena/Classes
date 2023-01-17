public class Ladder
{
   protected String color;
   protected int height;
   protected double price;
   
   // Constant used in price calculation
   private static final double PRICE_PER_INCH = 1.50;
    
   public Ladder(String color, int height)
   {
      this.color = color;
      this.height = height;
      updatePrice();
   }
   
   /* Marked as final to prevent overriding as method
      is called by constructor */
   private final void updatePrice()
   {
      price = 1.50 * height;
   }
   
   @Override
   public String toString()
   {
      return String.format("Color: %s  Height: %d  Price: $%.2f",
         color, height, price);
   }
   
   public String getColor()
   {
      return color;
   }
   
   public void setColor(String color)
   {
      this.color = color;
   }
   
   public int getHeight()
   {
      return height;
   }
   
   public void setHeight(int height)
   {
      this.height = height;
      updatePrice();
   }
   
   public double getPrice()
   {
      return price;
   }      
}
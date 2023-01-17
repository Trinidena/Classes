public class Pizza
{
   protected String description;
   protected double price;
   
   public Pizza(String description, double price)
   {
      this.description = description;
      this.price = price;
   }
   
   public String toString()
   {
      return String.format("Description:  %s  Price:  $%.2f", description, price);
   }
}
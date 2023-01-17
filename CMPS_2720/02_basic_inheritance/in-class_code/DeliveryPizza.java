public class DeliveryPizza extends Pizza
{
   private double deliveryFee;
   private String deliveryAddress;
   
   public DeliveryPizza(String description, double price, String deliveryAddress)
   {
      super(description, price);
      this.deliveryAddress = deliveryAddress;
      if(price > 15)
      {
         deliveryFee = 3.0;
      }
      else
      {
         deliveryFee = 5.0;
      }
   }
   
   public String toString()
   {
      return String.format("%s  Delivery Address:  %s  Delivery Fee:  $%.2f",
         super.toString(), deliveryAddress, deliveryFee);
   }
}
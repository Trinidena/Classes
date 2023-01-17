public abstract class TextMessage
{
   protected String phoneNumber;
   protected double price;
   
   public TextMessage(String phoneNumber)
   {
      this.phoneNumber = phoneNumber;
      price = 0.0;
   }
   
   public void setPrice(double price)
   {
      this.price = price;
   }
   
   public abstract String getPhoneNumber();
   
   public abstract double getPrice();
   
   public abstract void displayInformation();
}
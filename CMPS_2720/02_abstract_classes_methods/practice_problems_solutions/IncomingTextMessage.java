public class IncomingTextMessage extends TextMessage
{
   public IncomingTextMessage(String phoneNumber)
   {
      super(phoneNumber);
      setPrice(0.02);
   }
      
   public void displayInformation()
   {
      System.out.printf("Phone Number:  %s  Rate:  $%.2f  Price:  $%,.2f%n",
         phoneNumber, price, price);
   }
   
   public double getPrice()
   {
      return price;
   }
   
   public String getPhoneNumber()
   {
      return phoneNumber;
   }
}
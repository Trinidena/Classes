public class OutgoingTextMessage extends TextMessage
{
   private int messageLength;
   
   public OutgoingTextMessage(String phoneNumber, int messageLength)
   {
      super(phoneNumber);
      this.messageLength = messageLength;
      setPrice(0.04 * messageLength);
   }
   
   public double getPrice()
   {
      return price;
   }
   
   public void displayInformation()
   {
      System.out.printf("Phone Number:  %s  Rate:  $%.2f  Characters:  %d  Price:  $%,.2f%n",
         phoneNumber, 0.04, messageLength, price);
   }

   public String getPhoneNumber()
   {
      return phoneNumber;
   }   
}
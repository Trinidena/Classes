public class DemoTextMessages
{
   public static void main(String[] args)
   {
      IncomingTextMessage message1 = new IncomingTextMessage("(706) 555-9281");
      OutgoingTextMessage message2 = new OutgoingTextMessage("(423) 555-1234", 32);
      
      message1.displayInformation();
      message2.displayInformation();
   }
}
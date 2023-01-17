public class TextMessageArray
{
   public static void main(String[] args)
   {
      TextMessage[] messages = new TextMessage[8];
      
      messages[0] = new IncomingTextMessage("(706) 555-9281");
      messages[1] = new OutgoingTextMessage("(423) 555-1234", 32);
      messages[2] = new IncomingTextMessage("(706) 555-9282");
      messages[3] = new OutgoingTextMessage("(423) 555-1233", 132);
      messages[4] = new IncomingTextMessage("(706) 555-9283");
      messages[5] = new OutgoingTextMessage("(423) 555-1232", 444);
      messages[6] = new IncomingTextMessage("(706) 555-9284");
      messages[7] = new OutgoingTextMessage("(423) 555-1231", 32920);
      
      for(TextMessage message : messages)
      {
         message.displayInformation();
      }                 
   }
}
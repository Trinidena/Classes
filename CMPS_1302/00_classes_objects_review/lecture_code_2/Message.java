public class Message
{
   String message;
   
   public Message(String message)
   {
      this.message = message;
   }
   
   // The displayMessage method is overloaded.
   
   /* This version of the displayMessage method just 
      displays the value of the message field. */
   public void displayMessage()
   {
      System.out.println(message);
   }

   /* This version of the displayMessage method tacks 
      on an extra part at the end of message. */   
   public void displayMessage(String extra)
   {
      System.out.println(String.format("%s %s", message, extra));
   }
}
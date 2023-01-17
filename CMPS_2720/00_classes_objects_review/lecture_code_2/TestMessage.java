public class TestMessage
{
   public static void main(String[] args)
   {
      Message message = new Message("Hello!");
      
      message.displayMessage();
      message.displayMessage("Goodbye!");
   }
}
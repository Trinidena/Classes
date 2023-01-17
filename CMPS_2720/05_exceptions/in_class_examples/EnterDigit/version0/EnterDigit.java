import javax.swing.JOptionPane;

public class EnterDigit
{
   public static void main(String[] args)
   {
      String digitString = JOptionPane.showInputDialog("Enter a single digit (0-9).");
      
      int digit = 0;
      
      try
      {
         digit = Integer.parseInt(digitString);
      }
      catch(NumberFormatException e)
      {
         JOptionPane.showMessageDialog(null, "Invalid input.  Terminating program.");
         System.exit(0);
      }
      
      JOptionPane.showMessageDialog(null, String.format("You entered the digit %d.", digit));   
   }   
}
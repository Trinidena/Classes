import javax.swing.JOptionPane;

public class EnterDigit
{
   public static void main(String[] args)
   {
      int digit = 0;
      while(true)
      {
         String digitString = JOptionPane.showInputDialog("Enter a single digit (0-9).");
            
         try
         {
            digit = Integer.parseInt(digitString);
         
            if(digit < 0 || digit > 9)
            {
               throw new IllegalArgumentException();
            }
            
            break;
         }   
         catch(NumberFormatException e)
         {
            JOptionPane.showMessageDialog(null, "Invalid input!  Try again.");   
         }
         catch(IllegalArgumentException e)
         {
            JOptionPane.showMessageDialog(null, "Invalid range!  Try again.");        
         }
      }
      
      JOptionPane.showMessageDialog(null, String.format("You entered the digit %d.", digit));
   }   
}
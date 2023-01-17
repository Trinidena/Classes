import javax.swing.JOptionPane;

public class EnterDigit
{
   public static void main(String[] args)
   {
      String digitString = JOptionPane.showInputDialog("Enter a single digit (0-9).");
   
      int digit = Integer.parseInt(digitString);
   
      JOptionPane.showMessageDialog(null, String.format("You entered the digit %d.", digit));
   }   
}
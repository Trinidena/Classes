/* Fix this code by handling the exception that occurs when
   a user enters non-numeric input. */
  
import javax.swing.JOptionPane;

public class ExceptionHandlingPracticeProblem1
{
   public static void main(String[] args)
   {   
      String inputString = JOptionPane.showInputDialog("Enter a number."); 
      
      double number = 0.0;
      try
      {      
         number = Double.parseDouble(inputString);
      }
      catch(NumberFormatException e)
      {
         System.out.println("Invalid input.  Terminating program.");
         System.exit(0);
      }
      
      JOptionPane.showMessageDialog(null,
         String.format("You entered %f.", number));      
   }
}
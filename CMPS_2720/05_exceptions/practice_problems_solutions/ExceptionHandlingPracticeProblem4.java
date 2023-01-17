/* Fix this code by handling the exception that occurs when
   a user enters invalid input. */
  
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class ExceptionHandlingPracticeProblem4
{
   public static void main(String[] args)
   {       
      ArrayList<Integer> integers = new ArrayList<Integer>();
       
      String inputString = JOptionPane.showInputDialog("Enter a list of integers " +
         "separated by spaces.");
            
      String[] numberStrings = inputString.split(" ");            
   
      for( int i = 0; i < numberStrings.length; i++)
      {
         int number = 0;
         
         try
         {       
            number  = Integer.parseInt( numberStrings[i] );
            integers.add( number );
         }
         catch(NumberFormatException e)
         {
            JOptionPane.showMessageDialog(null, 
               String.format("%s is not an integer.%n", numberStrings[i]));
         }   
      }   
      
      String message = "";
      
      if( integers.size() > 0 )
      {
         message = String.format("Valid integers entered:  %s.", integers.toString());
      }
      else
      {
         message = "No valid integers entered.";
      }
      
      JOptionPane.showMessageDialog(null,message);  
   }
}
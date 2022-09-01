import javax.swing.JOptionPane; // Import the JOptionPane class.

/**
* This class shows the basic use of the JOPtionPane class
* to capture input from the user via dialog boxes.
*/

class JOptionPaneExample
{
   public static void main(String[] args)
   {
      /* The following statement uses the showInputDialog method in the 
         JOptionPane class.  It will generate a dialog box with the prompt
         and a text box.  Once the user enters text into the and presses 
         Enter, the text will be stored as a String in the name variable. */
   
      String name = JOptionPane.showInputDialog(null, "Enter your name:  ");      
            
      /* Unlike Scanner, JOptionPane can only store entered information
         as a String.  If you want to the user to a number that will be 
         used in a calculation, you need to convert the result. */
         
      String wholeNumberString = JOptionPane.showInputDialog("Enter a whole number:  ");       
      
      /* In the following line, we use the parseInt method in the 
         Integer class to convert a number stored as a String to an int.
         The class Integer is called a wrapper class for the primitive type 
         int.  Each of the eight primitive types has its own wrapper class. */
         
      int wholeNumber = Integer.parseInt(wholeNumberString);
      
      /* In the next two lines, we use JOPtionPane to store a double entered
         by the user as a String and then convert the String to a double using
         the parseDouble method in the Double class.   */
         
      String decimalNumberString = JOptionPane.showInputDialog(null, "Enter a decimal number:  ");
      double decimalNumber = Double.parseDouble(decimalNumberString);
            
      /* This statement uses the showMessageDialog method in the JOptionPane class
         to show the values entered by the user via a dialog box. */
         
      JOptionPane.showMessageDialog(null,"\nName:  " + name + "  Whole Number:  " + wholeNumber +
         "  Decimal Number:  " + decimalNumber);
   }
}
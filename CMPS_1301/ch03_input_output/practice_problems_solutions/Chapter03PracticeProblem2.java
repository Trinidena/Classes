import javax.swing.JOptionPane;

class Chapter03PracticeProblem3
{
   public static void main(String[] args)
   {
      final double FEET_IN_A_MILE = 5280.0;
      
      String milesString = JOptionPane.showInputDialog("Enter " +
         "a value in miles.");
      double miles = Double.parseDouble(milesString);
      
      double feet = miles * FEET_IN_A_MILE;
      
      JOptionPane.showMessageDialog(null,String.format("There are %.2f feet " +
         "in %.2f miles", feet, miles));
   }
}
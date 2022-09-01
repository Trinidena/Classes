import javax.swing.JOptionPane;

class Chapter03PracticeProblem4
{
   public static void main(String[] args)
   {
      String minutesString = JOptionPane.showInputDialog("Enter " +
         "the number of minutes.");
      double minutes = Double.parseDouble(minutesString);
      
      double hours = minutes / 60.0;
      double days = minutes / (60.0 * 24.0);
      
      JOptionPane.showMessageDialog(null,String.format("%.2f minutes " +
         "equals %.2f hours and %.2f days", minutes, hours, days));   
   }
}
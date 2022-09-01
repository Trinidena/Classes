import javax.swing.JOptionPane;

public class Chapter04PracticeProblem4
{
   public static void main(String[] args)
   {
      String numString = JOptionPane.showInputDialog("Enter an " +
         "integer.");
      int num = Integer.parseInt(numString);
      
      convertInchesToCentimeters(num);
      convertGallonsToLiters(num);   
   }
   
   public static void convertInchesToCentimeters(int in)
   {
      double cm = in * 2.54;
      JOptionPane.showMessageDialog(null, String.format("There are %.2f " +
         "cm in %d in.", cm, in));
   }

   public static void convertGallonsToLiters(int gal)
   {
      double liters = gal * 3.7854;
      JOptionPane.showMessageDialog(null, String.format("There are %.2f " +
         "L in %d gal.", liters, gal));
   }   
}
import javax.swing.JOptionPane;

class AreaCircleJOptionPane
{
   public static void main(String[] args)
   {
      String radiusString = JOptionPane.showInputDialog("Enter the radius of a circle.");
      double radius = Double.parseDouble(radiusString);
      
      double area = Math.PI * Math.pow(radius,2);
      
      JOptionPane.showMessageDialog(null, String.format("The area of a circle with radius %.2f " + 
         " units is %.2f square units.%n", radius, area));    
   }
}
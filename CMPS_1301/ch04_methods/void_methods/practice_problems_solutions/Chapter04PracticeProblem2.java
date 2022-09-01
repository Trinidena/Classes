import javax.swing.JOptionPane;

class Chapter04PracticeProblem2
{
   public static void main(String[] args)
   {
      getUserInput();   
   }
   
   public static void getUserInput()
   {
      String numString = JOptionPane.showInputDialog("Enter an " +
         "integer.");
      int num1 = Integer.parseInt(numString);
      
      numString = JOptionPane.showInputDialog("Enter another " +
         "integer.");
      int num2 = Integer.parseInt(numString);   
  
      addTwoNumbers(num1, num2);
   }
   
   public static void addTwoNumbers(int number1, int number2)
   {
      int total = number1 + number2;
      displayTotal(total);
   }
   
   public static void displayTotal(int number)
   {
      JOptionPane.showMessageDialog(null, "The total is " + number + ".");
   }
}
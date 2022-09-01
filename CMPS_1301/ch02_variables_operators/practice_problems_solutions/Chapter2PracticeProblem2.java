public class Chapter2PracticeProblem2
{
   public static void main(String[] args)
   {
      double bill = 14.70;
      int tipRate = 20;
      double tipAmount = bill * tipRate / 100.0; 
      double totalBill = bill + tipAmount;
      
      System.out.println("A " + tipRate + " percent tip on a bill of $" +
         bill + " is $" + tipAmount +".  The total bill is $" + totalBill + "."); 
   }
}
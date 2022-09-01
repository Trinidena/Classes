public class AnnualInterest
{
   public static void main(String[] args)
   {
      double principal = 10000;
      double rate = 0.02;
      double time = 20.5;
      
      double amount = principal * Math.pow(1 + rate / 12.0, 12 * time);
      
      System.out.println("At an annual interest rate of " + 
         rate + ", a princiapl amount of $" + principal + 
         " will grow to $" + amount + " in " + time + " years."); 
   }
}
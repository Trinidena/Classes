import java.util.Scanner;

public class LoanTable
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.printf("Loan Amount:  ");
      double loanAmount = in.nextDouble();
      
      System.out.printf("Number of Years:  ");
      int years = in.nextInt();
      
      System.out.println("\nInterest Rate\t\tMonthly Payment\tTotal Payment");

      for(int i = 0; i < 25; i++)
      {
         double yearlyRate = 0.05 + 0.00125 * i;
         double monthlyRate = yearlyRate / 12.0;
         double payment = loanAmount * monthlyRate / (1 - 1 / Math.pow(1 + monthlyRate, years * 12.0));
         double totalPayment = payment * years * 12.0; 
         System.out.printf("%.3f%%\t\t\t\t$%.2f\t\t\t\t$%,.2f%n", 100 * yearlyRate, payment, totalPayment);
      } 
    }
}         
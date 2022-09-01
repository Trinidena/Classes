import java.util.Scanner;

class Chapter03PracticeProblem3
{
   public static void main(String[] args)
   {
      final double PERCENT_INCREASE = 0.10;
      
      Scanner in = new Scanner(System.in);
      
      System.out.println("Enter the totals sales in dollars for " + 
         "the North division:  ");
      double northSales = in.nextDouble();
      
      System.out.println("Enter the totals sales in dollars for " + 
         "the South division:  ");
      double southSales = in.nextDouble();
      
      double projectedNorthSales = northSales + PERCENT_INCREASE * northSales;
      double projectedSouthSales = southSales + PERCENT_INCREASE * southSales;
      
      System.out.printf("Projected sales for the North division are $%.2f.%n",
         projectedNorthSales);

      System.out.printf("Projected sales for the South division are $%.2f.%n",
         projectedSouthSales);   
   }
}
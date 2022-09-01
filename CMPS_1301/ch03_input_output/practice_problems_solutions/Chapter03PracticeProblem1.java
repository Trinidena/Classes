import java.util.Scanner;

class Chapter03PracticeProblem1
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
   
      System.out.println("Enter your dog's weight in pounds:  ");
      double weight = in.nextDouble();
   
      System.out.println("Enter the number of days to be boarded:  ");
      int days = in.nextInt();
   
      double cost = weight * days * 0.5;
   
      System.out.printf("The cost to board a dog that weighs %.2f pounds for " +
         "%d days is $%.2f.%n", weight, days, cost);
   }
}
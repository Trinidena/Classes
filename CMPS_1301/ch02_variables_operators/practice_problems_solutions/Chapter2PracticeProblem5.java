public class Chapter2PracticeProblem5
{
   public static void main(String[] args)
   {
      String name = "Alice Atwater";
      
      double grossSalary = 34787.95;
      double interestIncome = 345.76;
      double capitalGains = 987.73;
      double totalIncome = grossSalary + interestIncome + capitalGains;
      
      double charitableContributions = 3212.55;
      int exemptions = 3;
      
      double adjustedIncome = totalIncome - charitableContributions - 1500.0 * exemptions;
      
      double taxDue = Math.max( 0 , 0.15 * ( adjustedIncome - 10000.0) );
      
      System.out.println("Name:  " + name);
      System.out.println("Gross Salary:  $" + grossSalary);
      System.out.println("Interest Income:  $" + interestIncome);
      System.out.println("capital Gains:  $" + capitalGains);
      System.out.println("Total Income:  $" + totalIncome);
      System.out.println();
      System.out.println("Charitable Contributions:  $" + charitableContributions);
      System.out.println("Number of Exemptions:  " + exemptions);
      System.out.println();
      System.out.println("Adjusted Income:  $" + adjustedIncome);
      System.out.println("Tax Due:  $" + taxDue);                                          
   }
}
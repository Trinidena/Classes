public class SalariedEmployee extends Employee implements Payable
{
   private String idNumber;
   private double monthlySalary;
   
   public SalariedEmployee(String idNumber, String firstName, String lastName,
      double monthlySalary)
   {
      super(firstName, lastName);
      this.idNumber = idNumber;
      this.monthlySalary = monthlySalary;
   }
   
   public double getPayAmount()
   {
      return monthlySalary;
   }
   
   public String getIdNumber()
   {
      return idNumber;
   }
   
   @Override
   public String toString()
   {
      return String.format("ID: %s %s Monthly Salary: $%,.2f", idNumber, 
         super.toString(), monthlySalary);
   }   
}
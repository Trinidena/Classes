public class HourlyEmployee extends Employee implements Payable
{
   private String idNumber;
   private double hoursWorked;
   private double hourlyWage;
   
   public HourlyEmployee(String idNumber, String firstName, String lastName,
      double hoursWorked, double hourlyWage)
   {
      super(firstName, lastName);
      this.idNumber = idNumber;
      this.hoursWorked = hoursWorked;
      this.hourlyWage = hourlyWage;
   }
   
   public double getPayAmount()
   {
      return hoursWorked * hourlyWage;
   }
   
   public String getIdNumber()
   {
      return idNumber;
   }
   
   @Override
   public String toString()
   {
      return String.format("ID: %s %s Hourly Wage: $%,.2f Hours Worked: %.2f", idNumber, 
         super.toString(), hourlyWage, hoursWorked);
   }    
}
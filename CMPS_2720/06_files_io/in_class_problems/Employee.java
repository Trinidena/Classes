import java.io.Serializable;

public class Employee implements Serializable
{
   private String employeeId;
   private String firstName;
   private String lastName;
   private String email;
   private String title;
   private int hoursWorked;
   private double hourlyRate;
   private double grossPay;
   private double netPay;
   private static final double WITHHOLDING_RATE = 0.06;
   
   public Employee(String employeeId, String firstName, String lastName, String email,
      String title, int hoursWorked, double hourlyRate)
   {
      this.employeeId = employeeId;
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
      this.title = title;
      this.hoursWorked = hoursWorked;
      this.hourlyRate = hourlyRate;
      grossPay = this.hoursWorked * this.hourlyRate;
      netPay = (1 - WITHHOLDING_RATE) * grossPay;
   }
   
   @Override
   public String toString()
   {
      return String.format("%s %-15s %-15s %3s %5.2f $%,8.2f $%,8.2f %n", employeeId, lastName, firstName, 
               hoursWorked, hourlyRate, grossPay, netPay);
   }   
}
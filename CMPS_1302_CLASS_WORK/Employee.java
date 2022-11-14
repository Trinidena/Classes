import java.io.*;

public class Employee implements Serializable {
   private String idNumber;
   private String firstName;
   private String lastName;
   private String email;
   private String jobTitle;
   private int hoursWorked;
   private double hourlyRate;
   private double grossPay;
   private static final double TAX_RATE = 0.06;
   private double netPay;

   public Employee(String idNumber, String firstName, String lastName, String email,
         String jobTitle, int hoursWorked, double hourlyRate) {
      this.idNumber = idNumber;
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
      this.jobTitle = jobTitle;
      this.hoursWorked = hoursWorked;
      this.hourlyRate = hourlyRate;
      this.grossPay = this.hoursWorked * this.hourlyRate;
      this.netPay = this.grossPay - this.grossPay * TAX_RATE;
   }

   @Override
   public String toString() {
      return String.format("%s , %s , %s , %d , %.2f , %.2f , %.2f%n", idNumber,
            lastName, firstName, hoursWorked, hourlyRate, grossPay, netPay);
   }
}
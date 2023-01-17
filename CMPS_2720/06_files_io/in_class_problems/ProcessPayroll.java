import java.io.*;
import java.util.Arrays;

public class ProcessPayroll
{
   public static void main(String[] args)
   {
      try(FileReader fr = new FileReader("payroll_data.csv");
          BufferedReader in = new BufferedReader(fr);
          FileWriter fw = new FileWriter("processed_payroll.txt"))
      {
         String line = in.readLine();
         while(line != null)
         {
            String[] parts = line.split(",");
            int hoursWorked = Integer.parseInt(parts[5]);
            double hourlyRate = Double.parseDouble(parts[6]);
            double grossPay = hoursWorked * hourlyRate;
            double netPay = 0.94 * grossPay;
            fw.write(String.format("ID: %s  Name: %-25s  Hours Worked:  %s  " +
               "Hourly Pay Rate:  %,.2f  Gross Pay:$%,8.2f  Net Pay: $%,.2f%n", parts[0],
               parts[2] + ", " + parts[1], hoursWorked, hourlyRate, grossPay, netPay));
            
            line = in.readLine();
         }
      }
      catch(FileNotFoundException e)
      {
         e.printStackTrace();
      }
      catch(IOException e)
      {
         e.printStackTrace();
      }    
   }
}
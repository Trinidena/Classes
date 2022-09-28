import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class ProcessPayrollData
{
   public static void main(String[] args)
   {
      try(FileReader fr = new FileReader("payroll_data.csv");
          BufferedReader br = new BufferedReader(fr);
          FileWriter fw = new FileWriter("processed_payroll.csv");
          BufferedWriter bw = new BufferedWriter(fw))
      {
         String line = br.readLine();
         while(line != null)
         {
            String[] parts = line.split(",");
            System.out.println(Arrays.toString(parts));
            int hoursWorked = Integer.parseInt(parts[5]);
            double hourlyRate = Double.parseDouble(parts[6]);
            System.out.println(hoursWorked);
            System.out.println(hourlyRate);
            double grossPay = hoursWorked * hourlyRate;
            double netPay = grossPay - 0.06 * grossPay;
            System.out.println(grossPay);
            System.out.println(netPay);
            bw.write(String.format("%s , %s , %s , %d , %.2f , %.2f , %.2f%n" , parts[0] , 
               parts[2] , parts[1] , hoursWorked , hourlyRate , grossPay , netPay));
            line = br.readLine();  
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
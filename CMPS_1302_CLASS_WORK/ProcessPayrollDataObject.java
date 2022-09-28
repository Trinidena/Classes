import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.io.*;

public class ProcessPayrollDataObject
{
   public static void main(String[] args)
   {
      try(FileReader fr = new FileReader("payroll_data.csv");
          BufferedReader br = new BufferedReader(fr);
          FileOutputStream fos = new FileOutputStream("processed_payroll.bin");
          ObjectOutputStream oos = new ObjectOutputStream(fos))
      {
         String line = br.readLine();
         while(line != null)
         {
            String[] parts = line.split(",");
            //System.out.println(Arrays.toString(parts));
            int hoursWorked = Integer.parseInt(parts[5]);
            double hourlyRate = Double.parseDouble(parts[6]);
            Employee employee = new Employee(parts[0] , parts[1] , parts[2] , parts[3] , 
               parts[4] , hoursWorked , hourlyRate);
            /*System.out.println(hoursWorked);
            System.out.println(hourlyRate);
            double grossPay = hoursWorked * hourlyRate;
            double netPay = grossPay - 0.06 * grossPay;
            System.out.println(grossPay);
            System.out.println(netPay);*/
            oos.writeObject(employee);
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
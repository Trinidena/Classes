import java.io.*;

public class PayrollDataToObjectData
{
   public static void main(String[] args)
   {
      try(FileReader fr = new FileReader("payroll_data.csv");
          BufferedReader br = new BufferedReader(fr);
          FileOutputStream fos = new FileOutputStream("object_payroll_data.bin");
          ObjectOutputStream out = new ObjectOutputStream(fos))
      {
         String line = br.readLine();

         while(line != null)
         {
            //System.out.println(line);
            String[] parts = line.split(",");
            int hoursWorked = Integer.parseInt(parts[5]);
            double hourlyRate = Double.parseDouble(parts[6]);
            Employee employee = new Employee(parts[0], parts[1], parts[2], parts[3], parts[4], 
               hoursWorked, hourlyRate);
            out.writeObject(employee);   
            System.out.println(employee);                
            line = br.readLine();
         }
      }
      catch(FileNotFoundException e)
      {
        
      }
      catch(IOException e)
      {
         
      }    
   }
}
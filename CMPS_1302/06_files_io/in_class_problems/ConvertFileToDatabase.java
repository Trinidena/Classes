import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.*;
   
public class ConvertFileToDatabase
{
   public static void main(String[] args)
   {
      try(Connection connection = DriverManager.getConnection("jdbc:sqlite:payroll.db");
          FileReader fr = new FileReader("payroll_data.csv");
          BufferedReader br = new BufferedReader(fr))
      {
         Statement statement = connection.createStatement();
         statement.setQueryTimeout(30);
         statement.executeUpdate("drop table if exists payroll");
         statement.executeUpdate("create table payroll(id text, firstname text, " +
            "lastname text, email text, title text, hoursworked integer, " +
            "hourlyrate numeric)");
                   
         String line = br.readLine();
         
         while(line != null)
         {
            String[] parts = line.split(",");
            int hoursWorked = Integer.parseInt(parts[5]);
            double hourlyRate = Double.parseDouble(parts[6]);
            
            //System.out.println(String.format("%s, %s, %s, %s, %s, %d, %.2f%n", 
            //   parts[0], parts[1], parts[2], parts[3], parts[4], hoursWorked, hourlyRate));
               
            statement.executeUpdate(String.format("insert into payroll values('%s', " +
               "'%s', '%s', '%s', '%s', %d, %.2f)", parts[0], parts[1].replace("'", "''"),
                parts[2].replace("'", "''"), parts[3], parts[4], hoursWorked, hourlyRate));            
            
            
            line = br.readLine();
         }    
      }
      catch(SQLException e)
      {
         System.out.printf("SQL ERROR:  %s%n", e.getMessage());         
      }
      catch(FileNotFoundException e)
      {
         System.out.printf("FNF ERROR:  %s%n", e.getMessage());      
      }
      catch(IOException e)
      {
         System.out.printf("IO ERROR:  %s%n", e.getMessage());      
      }                   
   }
}
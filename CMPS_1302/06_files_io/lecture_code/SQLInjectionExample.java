import java.util.Scanner;
import java.sql.*;
import java.io.*;
   
public class SQLInjectionExample
{
   public static void main(String[] args)
   {
      try(Connection connection = DriverManager.getConnection("jdbc:sqlite:payroll.db"))
      {
         Scanner in = new Scanner(System.in);
         System.out.print("Enter a last name for which to search:  ");
         String name = in.nextLine();
         
         Statement statement = connection.createStatement();
         statement.setQueryTimeout(30);
         
         String myQuery = String.format("select * from payroll where lastname='%s';", name);
         System.out.println(myQuery);
            
         /*ResultSet rs = statement.executeQuery(myQuery);
                 
         while(rs.next())
         {
            String id = rs.getString(1);
            String lastName = rs.getString(2);
            String firstName = rs.getString(3);
            String email = rs.getString(4);
            String title = rs.getString(5);
            int hoursWorked = rs.getInt(6);
            double hourlyRate = rs.getDouble(7);
            
            System.out.printf("%s, %s, %s, %s, %s, %d, $%.2f%n", id, lastName, 
               firstName, email, title, hoursWorked, hourlyRate);
         } */   
      }
      catch(SQLException e)
      {
         System.out.printf("SQL ERROR:  %s%n", e.getMessage());         
      }                   
   }
}
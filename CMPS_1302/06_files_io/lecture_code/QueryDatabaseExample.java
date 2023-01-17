import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.io.*;
   
public class QueryDatabaseExample
{
   public static void main(String[] args)
   {
      try(Connection connection = DriverManager.getConnection("jdbc:sqlite:payroll.db"))
      {
         Statement statement = connection.createStatement();
         statement.setQueryTimeout(30);
         
         String myQuery = "select lastname, firstname, email from payroll where firstname " +
            "like 'S%'";
            
         ResultSet rs = statement.executeQuery(myQuery);
                 
         while(rs.next())
         {
            String lastName = rs.getString(1);
            String firstName = rs.getString(2);
            String email = rs.getString(3);
            System.out.printf("%s, %s %s%n", lastName, firstName, email);
         }    
      }
      catch(SQLException e)
      {
         System.out.printf("SQL ERROR:  %s%n", e.getMessage());         
      }                   
   }
}
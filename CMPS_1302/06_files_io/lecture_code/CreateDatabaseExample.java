import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
    
public class CreateDatabaseExample
{
   public static void main(String[] args)
   {
      // Create a connection object.
      try(Connection connection = DriverManager.getConnection("jdbc:sqlite:sample.db"))
      {
         // Create a statement object.
         Statement statement = connection.createStatement();
         
         statement.setQueryTimeout(30);  // set timeout to 30 sec.
         statement.executeUpdate("drop table if exists person");
         statement.executeUpdate("create table person (id integer, name string)");
         statement.executeUpdate("insert into person values(1, 'leo')");
         statement.executeUpdate("insert into person values(2, 'yui')");
      }
      catch(SQLException e)
      {
         System.out.printf("SQL ERROR:  %s%n", e.getMessage());
      }                   
   }
}
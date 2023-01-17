import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo
{
   public static void main(String[] args)
   {
      Team ms = new Team("Michigan Stars", 0, 2, 9);
      Team dcfc = new Team("Detroit City FC", 8, 0, 3);
      Team nyc = new Team("New York Cosmos", 0, 0, 11);
      Team cfc = new Team("Chattanooga FC", 11, 0, 0);
      
      ArrayList<Team> teams = new ArrayList<Team>();
      teams.add(ms);
      teams.add(dcfc);
      teams.add(nyc);
      teams.add(cfc);
      
      Collections.sort(teams);
            
      for(Team team : teams)
      {
         System.out.println(team);
      }                 
   }
}
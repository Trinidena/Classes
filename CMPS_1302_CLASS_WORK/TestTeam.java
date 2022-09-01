public class TestTeam
{
   public static void main(String[] args)
   {
      Team[] teams = {new ClubTeam("Chattanooga FC" , 1 , "Chattanooga") , 
                      new ClubTeam("Nottingam Forest" , 2 , "Nottingham") , 
                      new InternationalTeam("USMNT" , 3 , "USA" , "English") , 
                      new InternationalTeam("Wales" , 4 , "Wales" , "English")};
      for(Team team : teams)
      {
         System.out.println(team.display());        
      }
   }
}
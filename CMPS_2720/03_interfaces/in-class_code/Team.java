public class Team implements Comparable<Team>
{
   private String name;
   private int wins;
   private int ties;
   private int losses;
   private int points;
   
   public Team(String name, int wins, int ties, int losses)
   {
      this.name = name;
      this.wins = wins;
      this.ties = ties;      
      this.losses = losses;
      points = 3 * this.wins + this.ties; 
   }
   
   public int compareTo(Team aTeam)
   {
        return aTeam.getPoints() - this.points; 
   }
      
   @Override
   public String toString()
   {
      return String.format("Name: %-15s Points: %2d Wins: %2d Ties: %2d Losses: %2d",
         name, points, wins, ties, losses);
   }
   
   public int getWins()
   {
      return wins;
   }
   
   public int getTies()
   {
      return ties;
   }
   
   public int getLosses()
   {
      return losses;
   }
   
   public int getPoints()
   {
      return points;
   }      
}
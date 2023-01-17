public class ClashPlayer
{
   protected String id;
   protected String screenName;
   protected int[] highScores = new int[10];
      
   public String getId()
   {
      return id;
   }
   
   public String getScreenName()
   {
      return screenName;
   }
   
   /* Not sure why the score value is needed for the get
      method, but the problem specifically asks for it. */
   public int getHighScores(int score, int level)
   {
      if(level < 0 || level > highScores.length - 1)
      {
         System.out.println("Error:  invalid level number");
         return -1;
      }
      else
      {
         return highScores[level];
      }
   }
   
   public void setId(String id)
   {
      this.id = id;
   }
   
   public void setScreenName(String screenName)
   {
      this.screenName = screenName;
   }
   
   public void setHighScores(int score, int level)
   {
      if(level < 0 || level > highScores.length - 1)
      {
         System.out.println("Error:  invalid level number");
         return;
      }
      
      if(level > 0 && highScores[level - 1] != 100)
      {
         System.out.printf("Error:  level %d unavailable%n", level);
         return;
      }
      else
      {
         highScores[level] = score;
      }
   }
}
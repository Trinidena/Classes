public class PremiumClashPlayer extends ClashPlayer
{
   /**
    * Class constructor for a new player.  A new 
    * player does not have any scores to copy. 
    */
   public PremiumClashPlayer()
   {
      highScores = new int[50];
   }   
   
   /** 
    * Class constructor for an existing player.  All
    * values of the fields are copied over to the new
    * object.
    *
    * @param p  the player object to be copied
    */
   public PremiumClashPlayer(ClashPlayer p)
   {
      // Copy over id and screen name.
      id = p.id;
      
      // Copy over the screen name.
      screenName = p.screenName;
      
      /* Copy over the player's high scores to the 
         newHighScores array. */
      int[] newHighScores = new int[50];
      for(int i = 0; i < p.highScores.length; i++)
      {
         newHighScores[i] = p.highScores[i];
      }
      
      // Set highScores value to the value of newHighScores
      highScores = newHighScores;
   }
}
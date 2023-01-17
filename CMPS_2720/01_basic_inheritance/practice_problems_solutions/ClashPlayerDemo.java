public class ClashPlayerDemo
{
   public static void main(String[] args)
   {
      // Create a ClashPlayer object.
      ClashPlayer pOne = new ClashPlayer();
      
      // Initialize the fields of the new object.
      pOne.setId("1");
      pOne.setScreenName("Bob");
      
      for(int i = 0; i < 6; i++)
      {
         pOne.setHighScores(100, i);
      }
      
      // Print all fields of pOne object
      printAllFields(pOne);
      
      System.out.println("Trying to set an invalid level number.");
      pOne.setHighScores(100, -2);
      
      System.out.println("Trying to set a level score when the previous level is not 100.");
      pOne.setHighScores(84, 8);
      
      System.out.println("Trying to get the level of an invalid level number.");
      pOne.getHighScores(0, -99);
      
      // Promote Bob to premium.
      PremiumClashPlayer pTwo = new PremiumClashPlayer(pOne);
      
      printAllFields(pTwo);
      
      // Set up a new premium player.
      PremiumClashPlayer pThree = new PremiumClashPlayer();
      pThree.setId("2");
      pThree.setScreenName("Emiliano");

      ClashPlayer pFour = new ClashPlayer();
      
      // Initialize the fields of the new object.
      pFour.setId("3");
      pFour.setScreenName("Ann");
      
      ClashPlayer pFive = new ClashPlayer();
      
      // Initialize the fields of the new object.
      pFive.setId("4");
      pFive.setScreenName("Cora");
      
      ClashPlayer[] players = {pTwo, pThree, pFour, pFive};

      // Enhanced for loop
      for(ClashPlayer player : players)
      {      
         printAllFields(player);
      }   
   }
   
   public static void printAllFields(ClashPlayer aPlayer)
   {
      // Display the values of all fields.
      System.out.printf("%n************%nPlayer ID:  %s%n", aPlayer.getId());
      System.out.printf("Player Screen Name:  %s%n", aPlayer.getScreenName());
      
      for(int i = 0; i < aPlayer.highScores.length; i++)
      {
         System.out.printf("Level %2d Score:  %3d%n", i, aPlayer.getHighScores(0, i)); 
      }
      System.out.println("************");   
   }
}
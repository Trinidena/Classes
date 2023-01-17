public class TestPlayer
{
   public static void main(String[] args)
   {
      Player[] players = {new Mage("Alice", 43, 2.3), new Mage("Bob", 2, 1.19),
         new Warrior("Carlos", 743, 32.532), new Warrior("Diane", 23, 98.54)};
      
      for(Player player : players)
      {
         System.out.println(player);
         System.out.println(player.getMeleeDamageModifier());
         System.out.println(((Ninja)player).hideShadows());
      }  
   }
}
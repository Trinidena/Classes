public abstract class Player
{
   protected String name;
   protected int xp;
   
   public Player(String name, int xp)
   {
      this.name = name;
      this.xp = xp;
   }
   
   public abstract double getMeleeDamageModifier();
   
   @Override
   public String toString()
   {
      return String.format("Name: %s  XP: %d", name, xp);
   }
   
   public String getName()
   {
      return name;
   }
   
   public int getXp()
   {
      return xp;
   }
   
   public void setName(String name)
   {
      this.name = name;
   }
   
   public void setXp(int xp)
   {
      this.xp = xp;
   }
}
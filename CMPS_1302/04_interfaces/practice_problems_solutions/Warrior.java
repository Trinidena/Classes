public class Warrior extends Player implements Ninja
{
   private double twoHandedBonus;
   
   public Warrior(String name, int xp, double twoHandedBonus)
   {
      super(name, xp);
      this.twoHandedBonus = twoHandedBonus;
   }
   
   @Override
   public String toString()
   {
      return String.format("%s  2HB: %.2f", super.toString(), twoHandedBonus);
   }
   
   public boolean hideShadows()
   {
      return false;
   }
   
   public double getMeleeDamageModifier()
   {
      return 134.2;
   }
   public double getSpellBonus()
   {
      return twoHandedBonus;
   }
   
   public void setTwoHandedBonus(double twoHandedBonus)
   {
      this.twoHandedBonus = twoHandedBonus;
   }
}
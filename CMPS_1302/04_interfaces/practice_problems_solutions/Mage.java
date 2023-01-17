public class Mage extends Player implements Ninja
{
   private double spellBonus;
   
   public Mage(String name, int xp, double spellBonus)
   {
      super(name, xp);
      this.spellBonus = spellBonus;
   }

   @Override
   public String toString()
   {
      return String.format("%s  SB: %.2f", super.toString(), spellBonus);
   }

   
   public boolean hideShadows()
   {
      return true;
   }
   
   public double getMeleeDamageModifier()
   {
      return 65.2;
   }
   public double getSpellBonus()
   {
      return spellBonus;
   }
   
   public void setSpellBonus(double spellBonus)
   {
      this.spellBonus = spellBonus;
   }
}
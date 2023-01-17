public abstract class Team
{
   protected String name;
   protected int number;
   
   public Team(String name, int number)
   {
      this.name = name;
      this.number = number;
   }
   
   public abstract void display();
}
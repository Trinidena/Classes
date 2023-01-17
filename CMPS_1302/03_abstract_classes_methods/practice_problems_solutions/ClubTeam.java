public class ClubTeam extends Team
{
   private String city;
   
   public ClubTeam(String name, int number, String city)
   {
      super(name, number);
      this.city = city;
   }

   public void display()
   {
      System.out.printf("Name: %s  Number: %d  City: %s%n",
         name, number, city);
   }
}
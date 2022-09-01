public class ClubTeam extends Team
{
   private String city;
   
   public ClubTeam(String name , int number , String city)
   {
      super(name , number);
      this.city = city;
   }
   
   public String display()
   {
      return String.format("The team's name is %s. The team's number is %d.\n" +
         "The team is located in %s" , name , number , city);
   }
}
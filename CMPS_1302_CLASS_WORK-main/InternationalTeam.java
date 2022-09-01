public class InternationalTeam extends Team
{
   private String country;
   private String language;
   
   public InternationalTeam(String name , int number , String country , String language)
   {
      super(name , number);
      this.country = country;
      this.language = language;
   }
   
   public String display()
   {
      return String.format("The team's name is %s. The team's number is %d.\n" +
         "The team is located in %s. The primary language is %s" , name , number , country , language);
   }
}
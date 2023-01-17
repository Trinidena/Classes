public class InternationalTeam extends Team
{
   private String country;
   private String language;
   
   public InternationalTeam(String name, int number, String country, String language)
   {
      super(name, number);
      this.country = country;
      this.language = language;
   }
   
   public void display()
   {
      System.out.printf("Name: %s  Number: %d  Country: %s  Language: %s%n",
         name, number, country, language);
   }
}
public class Holiday
{
   private String name;
   private int day;
   private String month;
   private int year;
   
   public Holiday(String name, int day, String month, int year)
   {
      this.name = name;
      
      //Not perfect, but ok.
      if(day >= 1 && day <= 31)
      {
         this.day = day;
      }
      else
      {
         this.day = -1;
      } 
      
      if(month.equals("January") || month.equals("February") || month.equals("March") || month.equals("April") ||
         month.equals("May") || month.equals("June") || month.equals("July") || month.equals("August") ||
         month.equals("September") || month.equals("October") || month.equals("November") || month.equals("December"))
      {
         this.month = month;
      }
      else
      {
         this.month = "ERROR";
      }   
      this.year = year;   
   }
   
   @Override
   public String toString()
   {
      return String.format("%s is on %d %s, %d.%n", name, day, month, year);
   }
   
   public String getName()
   {
      return name;
   }
   
   public int getDay()
   {
      return day;
   }
   
   public String getMonth()
   {
      return month;
   }
   
   public int getYear()
   {
      return year;
   }
   
   public void setName(String name)
   {
      this.name = name;
   }
   
   public void setDay(int day)
   {
      this.day = day;
   }
   
   public void setMonth(String month)
   {
      this.month = month;
   }
   
   public void setYear(int year)
   {
      this.year = year;
   }
}
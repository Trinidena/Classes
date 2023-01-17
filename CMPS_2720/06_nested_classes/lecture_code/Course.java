public class Course
{
   private int credits;
   private String department;
   private String number;
   
   public Course(String department, String number, int credits)
   {
      this.department = department;
      this.number = number;
      this.credits = credits;
   }
   
   public int getCredits()
   {
      return credits;
   }
   
   public String getID()
   {
      return department + number;
   }
   
   public String toString()
   {
      return String.format("%s%s (%d)", department, number, credits);
   }
}
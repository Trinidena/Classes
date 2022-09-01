public class TestHoliday
{
   public static void main(String[] args)
   {
      Holiday h1 = new Holiday("whatever", 55, "blahblah", -232);
      System.out.println(h1);
      
      Holiday h2 = new Holiday("whatever", 55, "March", -232);
      System.out.println(h2); 
      
      Holiday h3 = new Holiday("whatever", 4, "Febuary", -232);
      System.out.println(h3);
      
      Holiday h4 = new Holiday("St. Patrick's Day", 17, "March", 2019);
      System.out.println(h4);     
   }
}
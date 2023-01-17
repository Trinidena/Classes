public class Dog
{
   private String name;
   private String color;
   private int birthYear;
   
   public Dog(String name, String color, int birthYear)
   {
      this.name = name;
      this.color = color;
      this.birthYear = birthYear;
   }
   
   @Override
   public String toString()
   {
      return String.format("Name: %s  Color: %s  Birth Year:  %d",
         name, color, birthYear);
      
   }
   public String getName()
   {
      return name;
   }
   
   public void setName(String name)
   {
      this.name = name;
   }

   public String getColor()
   {
      return color;
   }
   
   public void setColor(String color)
   {
      this.color = color;
   }

   public int getBirthYear()
   {
      return birthYear;
   }
   
   public void setBirthYear(int birthYear)
   {
      this.birthYear = birthYear;
   }  
}
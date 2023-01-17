public class Contact
{
   private String name;
   private String number;
 
   // The new constructor for the Contact class.
   public Contact(String name, String number)
   {
      this.name = name;
      this.number = number;
   }
   
   // The new toString method for the Contact class.
   @Override
   public String toString()
   {
      return String.format("Name:  %s  Number:  %s", name, number);
   } 
    
   public String getName()
   {
      return name;
   }
   
   public void setName(String name)
   {
      this.name = name;
   }
   
   public String getNumber()
   {
      return number;
   }
   
   public void setNumber(String number)
   {
      this.number = number;
   }  
}
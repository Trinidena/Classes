public class TestContact
{
   public static void main(String[] args)
   {
      // Creating a blank Contact object named contact1.
      Contact contact1 = new Contact();
      
      // Setting the fields of the contact1 object.
      contact1.name = "Asdrubel Cabrera";
      contact1.number = "(706) 555-1234";
      
      // Calling the getName() method in the contact1 object.
      System.out.println(contact1.getName());
      
      // Creating a blank Contact object named contact2.
      Contact contact2 = new Contact();
      
      // Setting the fields of the contact2 object.
      contact2.name = "Placido Polanco";
      contact2.number = "(423) 555-1234";
      
      // Calling the getName() method in the contact2 object.
      System.out.println(contact2.getName());    
   }
}
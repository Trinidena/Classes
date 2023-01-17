public class TestContact
{
   public static void main(String[] args)
   {
      // Creating a blank Contact object named contact1.
      Contact contact1 = new Contact();
      
      // Setting the fields with the set methods.
      contact1.setName("Bob Brown");
      contact1.setNumber("706-250-1910");
      
      // Creating a blank Contact object named contact2.      
      Contact contact2 = new Contact();

      // Setting the fields with the set methods.      
      contact2.setName("Alice Atwater");
      contact2.setNumber("706-272-2488");
      
      // Using the get methods to display the values of the fields in the Contact objects.
      System.out.printf("Name:  %s  Number:  %s%n", contact1.getName(), contact1.getNumber());
      System.out.printf("Name:  %s  Number:  %s%n", contact2.getName(), contact2.getNumber());     
   }
}
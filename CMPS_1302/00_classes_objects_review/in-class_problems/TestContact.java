public class TestContact
{
   public static void main(String[] args)
   {
      /* The new constructor requires that a name and number be
         given before an object is created.  It is no longer 
         possible to create an empty Contact object. */
      Contact contact1 = new Contact("Asdrubel Cabrera", "706-272-2488");
      Contact contact2 = new Contact("Yoenis Cespedes", "706-266-8198");
   
      /* The toString() method allows the object to customize what is
         displayed when it is printed. */
      System.out.println(contact1);
      System.out.println(contact2);  
   }
}
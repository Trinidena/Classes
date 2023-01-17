public class Employee
{
   protected String firstName;
   protected String lastName;
   
   public Employee(String firstName, String lastName)
   {
      this.firstName = firstName;
      this.lastName = lastName;
   }
   
   public String toString()
   {
      return String.format("Name: %s, %s", lastName, firstName);
   }
}
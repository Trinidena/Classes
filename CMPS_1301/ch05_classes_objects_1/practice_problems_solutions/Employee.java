public class Employee
{
   private double salary;
   private int id;
   private String firstName;
   private String lastName;
   
   public double getAnnualSalary()
   {
      return 12 * salary;
   }
   
   public void raiseSalary(int percent)
   {
      salary = salary + salary * percent / 100.0;
   }
   
   public double getSalary()
   {
      return salary;
   }
   
   public void setSalary(double salary)
   {
      this.salary = salary;
   }
 
   public int getId()
   {
      return id;
   }
   
   public void setId(int id)
   {
      this.id = id;
   }
 
   public String getFirstName()
   {
      return firstName;
   }
   
   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }

   public String getLastName()
   {
      return lastName;
   }
   
   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }
   
}
public class Employee
{
   private double salary;
   private int id;
   private String firstName;
   private String lastName;
   
   public Employee(double salary, int id, String firstName, String lastName)
   {
      this.salary = salary;
      this.id = id;
      this.firstName = firstName;
      this.lastName = lastName;
   }

   public Employee(int id, String firstName, String lastName)
   {
      this(0, id, firstName, lastName);
   }
   
   @Override
   public String toString()
   {
      return String.format("ID:  %d  Last:  %s  First:  %s  Monthly Salary:  $%,.2f  Annual Salary:  $%,.2f",
         id, lastName, firstName, salary, getAnnualSalary());
   }
   
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
   
   public void setSalary(int salary)
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
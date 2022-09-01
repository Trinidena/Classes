public class TestEmployee
{
   public static void main(String[] args)
   {
      Employee e1 = new Employee();
      e1.setId(1);
      e1.setFirstName("Alice");
      e1.setLastName("Atwell");
      e1.setSalary(6000);
      
      Employee e2 = new Employee();
      e2.setId(1);
      e2.setFirstName("Bob");
      e2.setLastName("Brown");
      e2.setSalary(4000);
      
      System.out.printf("ID: %d  Name: %s, %s  Salary: $%,.2f  Annual Salary: $%,.2f%n",
         e1.getId(), e1.getLastName(), e1.getFirstName(), e1.getSalary(),
         e1.getAnnualSalary());
         
      System.out.printf("ID: %d  Name: %s, %s  Salary: $%,.2f  Annual Salary: $%,.2f%n",
         e2.getId(), e2.getLastName(), e2.getFirstName(), e2.getSalary(),
         e2.getAnnualSalary()); 
         
      e1.raiseSalary(20);
      e2.raiseSalary(10);
      
      System.out.printf("ID: %d  Name: %s, %s  Salary: $%,.2f  Annual Salary: $%,.2f%n",
         e1.getId(), e1.getLastName(), e1.getFirstName(), e1.getSalary(),
         e1.getAnnualSalary());
         
      System.out.printf("ID: %d  Name: %s, %s  Salary: $%,.2f  Annual Salary: $%,.2f%n",
         e2.getId(), e2.getLastName(), e2.getFirstName(), e2.getSalary(),
         e2.getAnnualSalary());                  
   }
}
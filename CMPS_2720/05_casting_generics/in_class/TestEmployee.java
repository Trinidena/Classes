import java.util.ArrayList;

public class TestEmployee
{
   public static void main(String[] args)
   {
      HourlyEmployee e1 = new HourlyEmployee("1", "Alice", "Atwater", 15.00, 40);
      HourlyEmployee e2 = new HourlyEmployee("2", "Bob", "Brown", 12.75, 20);
      SalariedEmployee e3 = new SalariedEmployee("3a", "Carlos", "Cavazos", 4200);
      SalariedEmployee e4 = new SalariedEmployee("3b", "Diane", "Desmond", 4800);
      
      // Converting child objects to parent type.
      Employee[] employees = {e1, e2, e3, e4};
      
      // Converting a class to interface type that it implements.
      Payable p1 = new HourlyEmployee("4", "Emiliano", "Estevez", 25.50, 60);

      // Converting an interface type to a parent interface type.
      Identifiable e5 = p1;
      
      // Converting a parent class object into a child class object.
      SalariedEmployee e6 = (SalariedEmployee)employees[3];
      
      // Converting a parent interface object to a child interface object. 
      Payable p2 = (Payable)e5;
      
      // Converting objects to an implemented interface type.
      for(Employee employee : employees)
      {
         System.out.println(employee);
         System.out.println(((Identifiable)employee).getIdNumber());
         System.out.println(((Payable)employee).getPayAmount());
      }
      
      ArrayList<SalariedEmployee> semployees = new ArrayList<SalariedEmployee>();
      ArrayList<HourlyEmployee> hemployees = new ArrayList<HourlyEmployee>();
      
      // Using instanceof operator to avoid ClassCastException
      for(Employee employee : employees)
      {
         if(employee instanceof SalariedEmployee)
         {
            semployees.add((SalariedEmployee)employee);
         }
         else if(employee instanceof HourlyEmployee)
         {
            hemployees.add((HourlyEmployee)employee);
         }
      }     
   }
}
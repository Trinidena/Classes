public class DemoSubscriptions
{
   public static void main(String[] args)
   {
      PhysicalMagazineSubscription sub1 = new PhysicalMagazineSubscription();
      sub1.setName("Alice Atwell");
      sub1.setAddress("whatever");
      sub1.setAddress("123 Oak Street");
      System.out.printf("Name:  %s  Address:  %s  Rate:  $%.2f%n",
         sub1.getName(), sub1.getAddress(), sub1.getRate());
      
      OnlineMagazineSubscription sub2 = new OnlineMagazineSubscription();
      sub2.setName("Bob Brown");
      sub2.setAddress("whatever");
      sub2.setAddress("fakeemail@fakedomain.com");
      System.out.printf("Name:  %s  Address:  %s  Rate:  $%.2f%n",
         sub2.getName(), sub2.getAddress(), sub2.getRate());      

   }
}
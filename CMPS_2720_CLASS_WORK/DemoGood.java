public class DemoGood
{
   public static void main(String[] args)
   {
      Good[] goods = {new Food("Pizza" , 10.0 , 1000) , 
                      new Food("Pie" , 5.50 , 600) , 
                      new Toy("Rubber Ducky" , 2.70 , 3) , 
                      new Toy("Red Train" , 4.40 , 5) , 
                      new Book("Dante's Inferno" , 7.30 , "Dante") , 
                      new Book("Joe's Life" , 4.60 , "Joe")};
      
      for(Good good : goods)
      {
         System.out.println(good);
         System.out.println(good.description());
         System.out.println(((Taxable)good).calculateTax());
      }
   }
}

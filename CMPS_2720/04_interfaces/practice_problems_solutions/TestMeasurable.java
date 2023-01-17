public class TestMeasurable
{
   public static void main(String[] args)
   {
      Measurable[] items = {new BankAccount("1", 232383.22), new BankAccount("2", 0.02),
         new Circle("3", 5.3), new Circle("4", 7.2), new Numbers("5", null), 
         new Numbers("6", new int[]{5, -4, 19})};
         
      for(Measurable item : items)
      {
         System.out.println(item);
         System.out.println(((Asset)item).description());         
         System.out.println(item.getMeasure());
      }   
   }
}
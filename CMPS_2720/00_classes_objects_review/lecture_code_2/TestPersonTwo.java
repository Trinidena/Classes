public class TestPersonTwo
{
   public static void main(String[] args)
   {
      PersonTwo p1 = new Person(1, 1);
      PersonTwo p2 = new Person(2, 2);
      PersonTwo p3 = new Person(3, 3);
      
      System.out.println(p1);
      System.out.println(p2);
      System.out.println(p3);
      
      p1.printWhatever();
      p1.printBlah();
      
      Person.printBlah();
      p3.printWhatever();
      Math.sqrt(9);
   }
}
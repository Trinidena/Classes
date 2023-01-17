public class InheritExampleDemo
{
   public static void main(String[] args)
   {
      // Create some InheritExample objects.
      InheritExample obj1 = new InheritExample();
      InheritExample obj2 = new InheritExample();
   
      // Using some methods inherited from the Object class.
      
      // Using the inherited toString() method.
      String s1 = obj1.toString();
      System.out.println(s1);
   
      // Using the inherited equals() method.
      System.out.println(obj1.equals(obj1));
      System.out.println(obj1.equals(obj2));    
   }
}
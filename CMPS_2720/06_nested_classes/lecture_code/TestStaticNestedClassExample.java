public class TestStaticNestedClassExample
{
   public static void main(String[] args)
   {
      // Use the class
      StaticNestedClassExample.StaticNestedClass obj = new 
         StaticNestedClassExample.StaticNestedClass("an object");
      System.out.println(obj);
      obj.printValues();
   }
}
public class TestInnerClassExample
{
   public static void main(String[] args)
   {
      InnerClassExample iceObject = new InnerClassExample("blah", 6.28);
      InnerClassExample.InnerClass obj = iceObject.new InnerClass("an object");
      
      System.out.println(obj);
      obj.printValues();
   }
}
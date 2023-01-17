public class StaticNestedClassExample
{
   private String aField;
   private double anotherField;
   
   public StaticNestedClassExample(String aField, double anotherField)
   {
      this.aField = aField;
      this.anotherField = anotherField;
   }
   
   public static class StaticNestedClass
   {
      private String myField;
      
      public StaticNestedClass(String myField)
      {
         this.myField = myField;
      }
      
      @Override
      public String toString()
      {
         return myField;
      }
      
      public void printValues()
      {
         System.out.println(myField);
         /* Uncommenting the following two lines will cause a syntax error. Static 
            nested fields cannot refer directly to the instance members of the outer
            class. It has to refer to the instance members in the same way as any 
            other top-level class. */
         //System.out.println(aField);
         //System.out.println(anotherField);
      }
   }  
}
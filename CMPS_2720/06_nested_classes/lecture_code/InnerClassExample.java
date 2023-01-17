public class InnerClassExample
{
   private String aField;
   private double anotherField;

   public InnerClassExample(String aField, double anotherField)
   {
      this.aField = aField;
      this.anotherField = anotherField;
   }
   
   class InnerClass
   {
      private String myField;
      
      public InnerClass(String myField)
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
         /* Inner classes can refer directly to the instance members of the
            outer class. */
         System.out.println(aField);
         System.out.println(anotherField);
      }

   }  
}
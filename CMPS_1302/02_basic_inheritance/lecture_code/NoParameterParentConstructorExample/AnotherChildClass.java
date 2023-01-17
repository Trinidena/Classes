public class AnotherChildClass extends AParentClass
{
   public AnotherChildClass()
   {
      /* Method 2:  Make a call to the parent's parameterless
         constructor using super() in the first line of the
         child's constructor */
          
      super();
      System.out.println("In the another child constructor");
   }
}
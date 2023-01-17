public class ArraysParameterizedTypes
{
   //Uncomment to show how to suppress warnings.
   //@SuppressWarnings("unchecked")
   public static void main(String[] args)
   {
      /* Java will not allow you to create arrays of parameterized 
         types. Neither of the following statements will work. */
      //Pair<Integer, String>[] somePairs = new Pair<>[40];
      //Pair<Integer, String>[] somePairs = new Pair<Integer, String>[40];
      
      // It is possible to declare arrays with parameterized types.
      Pair<Integer, String>[] pairs;
      
      // To actually create the array, you must use an unparameterized type.      
      pairs = new Pair[40];
      
      // Now you can store objects of the parameterized type in the array. 
      pairs[0] = new Pair<>(32, "gamma");
      
      System.out.println(pairs[0]);
   }
}
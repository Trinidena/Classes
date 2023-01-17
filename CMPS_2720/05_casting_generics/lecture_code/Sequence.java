public class Sequence<T> 
{
   /* We want the Sequence class to have a field which is an
      an array of T objects. */
   private T[] data;
   
   @SuppressWarnings("unchecked")
   public Sequence(int size)
   {
      // We need to create the array for the data field.
      
      // The following approach will not work.
      //data = new T[size];
      
      /* Instead, create an array of type Object and then cast 
         as type T[]. This will cause a compiler warning. */
      data = (T[])new Object[size];
   }
   
   public T get(int index)
   {
      return data[index];
   }
   
   public void set(int index, T element)
   {
      data[index] = element;
   }
}
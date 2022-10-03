public class MyList<T>
{
   public T[] data;
   
   @SuppressWarnings("unchecked")
   public MyList()
   {
      data = (T[])new Object[50];
   }
   
   public void add(T data , int position)
   {
      if(position < 0 || position > 50)
      {
         throw new IndexOutOfBoundsException();
      }      
      this.data[position] = data;
   }
   
   public String toString()
   {  
      String out = "";
      for(int i = 0; i < 50; i++)
      {
         if(data[i] != null)
         {
            out = out + data[i].toString() + ", ";
            //continue;
         }
      //out = out + data[i].toString() + ", ";
      }
     return out;
   }
}
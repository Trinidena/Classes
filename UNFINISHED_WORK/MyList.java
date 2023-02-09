public class MyList<T>
{
   private T[] data;
   
   @SuppressWarnings("unchecked")
   public MyList()
   {
      data = (T[])new Object[50];
   }
   
   public void add(T data , int position)
   {
      if(position < 0 || position > 49)
      {
         System.out.println("Index out of bounds.");
         
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
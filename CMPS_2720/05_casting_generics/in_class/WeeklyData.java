import java.util.Arrays;

public class WeeklyData<T>
{
   private T[] data;
   private int currentIndex;
   
   @SuppressWarnings("unchecked")
   public WeeklyData()
   {
      currentIndex = 0;
      data = (T[]) new Object[7];
   }
   
   public void add(T item)
   {
      data[currentIndex] = item;
      currentIndex = (currentIndex + 1) % 7;
   }
   
   public T[] getData()
   {
      return data;
   }
   
   @Override
   public String toString()
   {
      return Arrays.toString(data);
   }  
}
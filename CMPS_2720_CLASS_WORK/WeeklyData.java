public class WeeklyData<X>
{
   private X[] data;
   private int currentIndex;
   
   @SuppressWarnings("unchecked")
   public WeeklyData()
   {
      currentIndex = 0;
      data = (X[]) new Object[7];
   }
   
    public X[] getData()
   {
      return data;
   }
   
   public void add(X obj)
   {
      data[currentIndex] = obj;
      currentIndex = (currentIndex +1)%7;
   }
   
   @Override
   public String toString()
   {
      String out = "";
      for(X datum : data)
      {
         out = out + datum.toString() + " ";
      }
      
      return out;
   }
}
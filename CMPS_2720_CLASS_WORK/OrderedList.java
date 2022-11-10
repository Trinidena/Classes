import java.util.ArrayList;

public class OrderedList<E extends Comparable> extends ArrayList<E>
{
   public void insert(E element)
   {
      int first = 0;
      int last = size() - 1;
      int mid = 0;
      boolean found = false;
      
      if(size() == 0)
      {
         add(element);
      }
      else
      {
         while(first <= last && !found)
         {
            mid = (first + last) / 2;
            if(get(mid).equals(element))
            {
               found = true;
            }
            else if(get(mid).compareTo(element) > 0)
            {
               last = mid - 1;
            }
            else
            {
               first = mid + 1;
            }
         }
         
         if(found)
         {
            System.out.println("No dups");
         }
         else
         {
            if(get(mid).compareTo(element) < 0)
            {
               mid++;
            }
            add(mid , element);
         }
      }
   }
   
   public int sequentialSearch(E element)
   {
      for(int i = 0; i < size(); i++)
      {
         if(get(i).equals(element))
         {
            return i;
         }
      }
      return -1;
   }
   
   public int binarySearch(E element)
   {
      int first = 0;
      int last = size() - 1;
      int mid = 0;
      boolean found = false;
      
      while(first <= last && !found)
      {
         mid = (first + last) / 2;
         if(get(mid).equals(element))
         {
            found = true;
         }
         else if(get(mid).compareTo(element) > 0)
         {
            last = mid - 1;
         }
         else
         {
            first = mid + 1;
         }
      }
         
      if(found)
      {
         return mid;
      }
      else
      {
         return -1;
      }
   }
}

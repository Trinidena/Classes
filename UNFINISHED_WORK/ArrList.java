public class ArrList<E> extends ArrListAdapter<E>
{
   private E[] data;
   private int size;
   private static final int DEFAULT_CAPACITY = 10;
   
   /* TODO: implement ArrList(), a constructor that constructs an ArrList with
            capacity for ten elements.*/
   public ArrList()
   {
      this(DEFAULT_CAPACITY);
   }         
   
   /* TODO: implement ArrList(int initialCapacity) a constructor with one int 
            parameter that constructs an ArrList with capacity initialCapacity.*/
   @SuppressWarnings("unchecked")         
   public ArrList(int initialCapacity)
   {
      data = (E[])new Object[initialCapacity];
      size = 0;
   }         
   /* TODO: implement boolean add(E element) method
            add element to the end of the ArrList, possibly extending the 
            ArrList. */
   @SuppressWarnings("unchecked")         
   @Override         
   public boolean add(E element)
   {
                                 
      if(size >= data.length)    //Increase data array size if neccessary.
      {
         E[] biggerArray;  //declare but initialize seperately
         biggerArray = (E[]) new Object[2 * data.length];   //initialized while casting  //increase size of arraylist
         for(int i = 0; i < data.length; i++)   //loop through the arrlist up to its length
         {
            biggerArray[i] = data[i];     //copy over the old arrlist to the new bigger arrlist 
         }
         data = biggerArray;     //set data to point to the new array
      }
      data[size] = element;    //add element to the end of the list which is the size; 
      size++;     //update size; 
      return true;
   }
   
   /* TODO: implement boolean add(int index, E element) method
            insert element in the ArrList at the given index, moving existing 
            elements to the right */
            
	@Override
	public void add(int index, E element)
   {
      //check user input index 
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
      //check the capacity of the array incase if full
		add(element);
      
		for (int i=size-1; i>index; i--) 
      {
			data[i] = data[i-1]; //move elements to the right, the current element equls the one before it, starting from the end or the back 
		}
		// put the new one in the right place
		data[index] = element;
   }
                  
   // TODO: implement int size() method returing the size of the ArrList.
   @Override
   public int size()
   {
      return size;
   }
   
   // TODO: implement E get(int index) method, returns element at index.
   @Override
   public E get(int index)
   {
      if(index < 0 || index >= size)
      {
         throw new IndexOutOfBoundsException();
      }
      return data[index];
   }
   
   /* TODO: implement E set(int index, E element) method, replace the existing
            value at index with element, return the old value */
   public E set(int index, E element)
   {
      E old = get(index);
      data[index] = element;
      return old;
   }         
   
   /* TODO: implement int indexOf(Object o) method, return the index of the 
            first occurrence of o in the ArrList, or -1 if the ArrList does
            not contain the element. */
   public int indexOf(Object o)
   {
      for(int i = 0; i < size; i++)
      {
         if(o.equals(data[i]))
         {
            return i;
         }
      }
      return -1;
   }         
   
   /* TODO: implement boolean contains(Object o) method, return true of the list
            contains the element. */
   public boolean contains(Object o)
   {
      return indexOf(o) != -1;
   }         
   
   /* TODO: implement E remove(int index) method, remove the element at the 
            the specified index. */
   public E remove(int index)
   {
      E old = get(index);
      
      for(int i = index; i < size - 1; i++)
      {
         data[i] = data[i + 1];
      }
      size --;
      return old;
   }         
   
   /* TODO: implement boolean remove(Object o) method, remove the first occurrence of 
            the specified element, */
   public boolean remove(Object o)
   {
      int index = indexOf(o);
      if(index == -1)
      {
         return false;
      }
      remove(index);
      return true;
   }          
}
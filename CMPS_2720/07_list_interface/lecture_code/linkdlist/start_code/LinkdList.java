public class LinkdList<E> extends LinkdListAdapter<E>
{
   private class Node
   {
      E element;
      Node next;
      
      public Node(E element)
      {
         this.element = element;
         this.next = null;
      }
      
      public Node(E element, Node next)
      {
         this.element = element;
         this.next = next;
      }
      
      @Override
      public String toString()
      {
         return String.format("Node: %s", element.toString());
      }
   }
   
   private Node head;
   private int size;
   
   /* TODO: implement LinkdList(), a constructor that constructs an LinkdList with
            null head and size 0.*/
            
   /* TODO: implement boolean add(E element) method
            add element to the end of the list, possibly extending the 
            list. */
   
   /* TODO: implement void add(int index, E element) method
            insert element in the list at the given index, moving existing 
            elements to the right */
            
   // TODO: implement int size() method returing the size of the list.
   
   // TODO: implement E get(int index) method, returns element at index.
   
   /* TODO: implement E set(int index, E element) method, replace the existing
            value at index with element, return the old value */
   
   /* TODO: implement int indexOf(Object o) method, return the index of the 
            first occurrence of o in the list, or -1 if the list does
            not contain the element. */
   
   /* TODO: implement boolean contains(Object o) method, return true of the list
            contains the element. */
   
   /* TODO: implement E remove(int index) method, remove the element at the 
            the specified index. */
   
   /* TODO: implement boolean remove(Object o) method, remove the first occurrence of 
            the specified element, */
}
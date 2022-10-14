public class AltList<E>
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
   }
   
   private Node head;
   private Node tail;
   private int size = 0;
   
   /* TODO: This method should add the element to the beginning of 
            of the list and increase the size of the list by one. */
   public void addBeginning(E element)
   {
      head = new Node(element , head);    
      size++;
   }

   /* TODO: This method should add the element to the end of 
            of the list and increase the size of the list by one. */   
   public void addEnd(E element)
   {
      if(head == null)
      {
         head = new Node(element , tail);
      }
      else
      {
         Node tail = head;
         while(tail.next != null)
         {
            tail = tail.next;
         }
         tail.next = new Node(element); 
      }
      size++;
   }

   private Node getNode(int index)
   {
      if(index < 0 || index > size - 1)
      {
         throw new IndexOutOfBoundsException();
      }
      
      Node node = head;
      for(int i = 0; i < index; i++)
      {
         node = node.next;
      }
      
      return node;
   }

   public E get(int index)
   {
      return getNode(index).element;
   }   
   public int size()
   {
      return size;
   }
}
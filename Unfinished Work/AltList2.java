public class AltList2<E>
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
      Node newNode = new Node(element , head);
      if(head == null)
      {
         head = tail = newNode;
      }
      else
      {
         head = newNode;
      }
      size++;
   }

   /* TODO: This method should add the element to the end of 
            of the list and increase the size of the list by one. */   
   public void addEnd(E element)
   {
      Node newNode = new Node(element);
      if(head == null)
      {
         head = tail = newNode;   
      }
      else
      {
         tail.next = newNode;
         tail = newNode;
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
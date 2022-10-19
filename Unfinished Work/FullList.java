public class FullList<E>
{
   private class Node
   {
      E element;
      Node next;
      Node prev;
            
      public Node(E element)
      {
         this.element = element;
      }
   }
   
   private Node head;
   private Node tail;
   private int size = 0;
   
   public FullList()
   {
      head = null;
      tail = null;
   }
   
   /* TODO: This method should add the element to the beginning of 
            of the list and increase the size of the list by one. The 
            head and tail variables should be set correctly. */
   public void addBeginning(E element)
   {  
      Node newNode = new Node(element);
      if(head == null)
      {
         head = tail = newNode;
      }
      else
      {
         head.prev = newNode;
         newNode.next = head;  
         head = newNode;
      }
      size++;
   }
   /* TODO: This method should insert the element at the given index.
            The size of the should increase by one.  The head and tail
            variables should be set correctly. */
   public void addMiddle(int index, E element)
   {
      if(index == 0)
      {
         head.next = head;
         head.prev = null;
         head = new Node(element);
      }
      if(index == size)
      {
         tail.prev = tail;
         tail.next = new Node(element);
         tail = tail.next;
      }
      else
      {
         Node node = getNode(index - 1);
         node.next = new Node(element);
      }
      size++;
   }


   /* TODO: This method should add the element to the end of 
            of the list and increase the size of the list by one.
            The head and tail variables should be set correctly. */   
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
         newNode.prev = tail;
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
   
   public boolean isHeadNull()
   {
      return head == null;
   }
   
   public boolean isTailNull()
   {
      return tail == null;
   }
}

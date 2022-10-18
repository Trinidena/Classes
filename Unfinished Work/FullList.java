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
      
      public Node(E element , Node next)
      {
         this.element = element;
         this.next = next; 
      }
      
      public Node(E element , Node next , Node prev)
      {
         this(element , next);
         this.prev = prev; 
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
   /* TODO: This method should insert the element at the given index.
            The size of the should increase by one.  The head and tail
            variables should be set correctly. */
   public void addMiddle(int index , E element)
   {
      Node newNode = new Node(element , head);
      if(index == 0)
      {
         head = tail = newNode;
      }
      else
      {  
         Node nodeBefore = getNode(index - 1);
         nodeBefore.next = new Node(element, nodeBefore.next);
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
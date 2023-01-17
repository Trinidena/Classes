import java.util.NoSuchElementException;

public class MyQueue<E> //implements Queue<E>
{
   private Node<E> head;
   private Node<E> tail;
   
   private static class Node<E>
   {
      private E element;
      private Node<E> next; 
   }

   /**
    * Initializes an empty queue.
    */
   public MyQueue()
   {
      head = null;
      tail = null;
   }    
  
   /**
    * Adds an element at the end of the queue.
    *
    * @param e the element to be added
    */
   public void add(E e)
   {
      Node<E> node = new Node<>();
      node.element = e;
      
      if(isEmpty())
      {
         head = node;
      }
      else
      {
         tail.next = node;
      }
      tail = node;
   }
   
   /**
    * Returns and removes the front element of the queue
    *
    * @return the front element in the queue
    * @throws NoSuchElementException if the queue is empty
    */   
   public E remove()
   {
      if(isEmpty())
      {
         throw new NoSuchElementException("Queue is empty");
      }
      E old = head.element;
      head = head.next;
      return old;  
   }
   
   /**
    * Returns, but does not remove, the front element of the queue
    *
    * @return the front element in the queue
    * @throws NoSuchElementException if the queue is empty  
    */   
   public E peek()
   {
      if(isEmpty())
      {
         throw new NoSuchElementException("Queue is empty");
      }
      return head.element;  
   }
       
   /**
    * Returns a boolean indicating whether the queue is empty.
    *
    * @return returns {@code true} if the queue is empty; {@code false} otherwise
    */  
   public boolean isEmpty()
   {
      return head == null;  
   }      
}
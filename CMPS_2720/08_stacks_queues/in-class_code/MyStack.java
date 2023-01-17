import java.util.NoSuchElementException;

public class MyStack<E> implements Stack<E>
{
   private Node<E> head;
      
   private static class Node<E>
   {
      private E element;
      private Node<E> next;
   }
   
   /**
    * Initializes an empty stack.
    */   
   public MyStack()
   {
      head = null;
   }
   
   /**
    * Adds element e to the top of the stack.
    *
    * @param e the element to add
    */
   public void push(E e)
   {
      Node<E> node = new Node<>();
      node.element = e;
      if(!isEmpty())
      {
         node.next = head;
      }
      head = node;
   }
   
   /**
    * Returns and removes the top element of the stack
    *
    * @return the top item of the stack
    * @throws NoSuchElementException if this stack is empty
    */     
   public E pop()
   {
      if(isEmpty())
      {
         throw new NoSuchElementException("Stack is empty");
      }
      E old = head.element;
      head = head.next;
      return old;  
   }
   
   /**
    * Returns the top element of the stack, without removing it
    *
    * @return the top element of the stack
    * @throws NoSuchElementException if this stack is empty    
    */      
   public E peek()
   {
      if(isEmpty())
      {
         throw new NoSuchElementException("Stack is empty");
      }
      return head.element;
   }
   
   /**
    * Returns a boolean indicating whether the stack is empty.
    *
    * @return {@code true} if the stack is empty; {@code false} otherwise
    */   
   public boolean isEmpty()
   {
      return head == null;
   }   
}
import java.util.NoSuchElementException;

public class MyStack<E> implements Stack<E>
{
   private Node<E> head;
   
   private static class Node<E>
   {
      private E element;
      private Node<E> next;   
   }
   
   public MyStack()
   {
      head = null;
   }
   
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
   
   public E pop()
   {
      if(isEmpty())
         throw new NoSuchElementException();
         
      E old = head.element;
      head = head.next;
      return old;
   }
   
   public E peek()
   {
      if(isEmpty())
         throw new NoSuchElementException();
         
      return head.element;
   }
   
   public boolean isEmpty()
   {
      return head == null;
   }
}
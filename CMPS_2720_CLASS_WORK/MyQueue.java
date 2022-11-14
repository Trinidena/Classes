import java.util.NoSuchElementException;

public class MyQueue<E> implements Queue<E> {
   private Node<E> head;
   private Node<E> tail;

   private static class Node<E> {
      private E element;
      private Node<E> next;
   }

   public MyQueue() {
      head = null;
      tail = null;
   }

   public void add(E element) {
      Node<E> node = new Node<>();
      node.element = element;
      if (isEmpty()) {
         head = node;
      } else {
         tail.next = node;
      }
      tail = node;
   }

   public E remove() {
      if (isEmpty()) {
         throw new NoSuchElementException();
      }
      E old = head.element;
      head = head.next;
      return old;
   }

   public E peek() {
      if (isEmpty()) {
         throw new NoSuchElementException();
      }
      return head.element;
   }

   public boolean isEmpty() {
      return head == null;
   }
}

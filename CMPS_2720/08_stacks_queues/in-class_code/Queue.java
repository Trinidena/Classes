public interface Queue<E>
{
   /**
    * Adds an element at the end of the queue.
    *
    * @param e the element to be added
    */
   void add(E e);
   
   /**
    * Returns and removes the front element of the queue
    *
    * @return the front element in the queue
    * @throws NoSuchElementException if the queue is empty
    */   
   E remove();
   
   /**
    * Returns, but does not remove, the front element of the queue
    *
    * @return the front element in the queue
    * @throws NoSuchElementException if the queue is empty  
    */   
   E peek();
   
   /**
    * Returns a boolean indicating whether the queue is empty.
    *
    * @return returns {@code true} if the queue is empty; {@code false} otherwise
    */   
   boolean isEmpty();
}
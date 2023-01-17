public interface Stack<E>
{
   /**
    * Adds element e to the top of the stack.
    *
    * @param e the element to add
    */
   void push(E e);
   
   /**
    * Returns and removes the top element of the stack
    *
    * @return the top item of the stack
    * @throws NoSuchElementException if this stack is empty
    */   
   E pop();
   
   /**
    * Returns the top element of the stack, without removing it
    *
    * @return the top element of the stack
    * @throws NoSuchElementException if this stack is empty    
    */   
   E peek();
   
   /**
    * Returns a boolean indicating whether the stack is empty.
    *
    * @return {@code true} if the stack is empty; {@code false} otherwise
    */   
   boolean isEmpty();
}
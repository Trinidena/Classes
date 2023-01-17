public class BinarySearchTree<E extends Comparable>
{
   private TNode<E> root;
   
   private static class TNode<E>
   {
      private E element;
      private TNode<E> left;
      private TNode<E> right;
   }
   
   public BinarySearchTree()
   {
      root = null;
   }
   
   public boolean search(E element)
   {
      if(isEmpty())
      {
         return false;
      }
      TNode<E> currentNode = root;
      while(currentNode != null)
      {
         if(element.compareTo(currentNode.element) < 0)
         {
            currentNode = currentNode.left;
         }
         else if(element.compareTo(currentNode.element) > 0)
         {
            currentNode = currentNode.right;
         }
         else
         {
            return true;
         }
      }
      return false;
   }
   public void insert(E element)
   {
      if(isEmpty())
      {
         root = new TNode<E>();
         root.element = element;
         return;
      }
      
      TNode<E> newNode = new TNode<E>();
      newNode.element = element;
      TNode<E> currentNode = root;
      TNode<E> previousNode = null;
      
      while(currentNode != null)
      {
         if(element.compareTo(currentNode.element) < 0)
         {
            previousNode = currentNode;
            currentNode = currentNode.left;
         }
         else if(element.compareTo(currentNode.element) > 0)
         {
            previousNode = currentNode;
            currentNode = currentNode.right;
         }
         else
         {
            System.out.println("No dups!");
            return;
         }
      }
      
      if(element.compareTo(previousNode.element) < 0)
      {
         previousNode.left = newNode;
      }
      else
      {
         previousNode.right = newNode;
      }
   }
   
   public boolean isEmpty()
   {
      return root == null;
   }
}
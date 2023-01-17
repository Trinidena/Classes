public class BinaryTree<E>
{
   private TNode<E> root;
   
   private static class TNode<E>
   {
      private E element;
      private TNode<E> left;
      private TNode<E> right;
   }
   
   public BinaryTree(E element)
   {
      root = new TNode<>();
      root.element = element;
   }
   
   public boolean isEmpty()
   {
      return root == null;
   }
   
   public void levelOrder()
   {
      MyQueue<TNode<E>> q = new MyQueue<>();
      q.add(root);
      while(!q.isEmpty())
      {
         TNode<E> node = q.remove();
         System.out.print(node.element + " ");
         if(node.left != null)
         {
            q.add(node.left);
         }
         if(node.right != null)
         {
            q.add(node.right);
         }
      }
      
   }
   
   // This really bad code. Be careful.
   public void insert(E element, E parent, int leftOrRight)
   {
      TNode<E> pNode = getNode(parent);
      TNode<E> newNode = new TNode<>();
      newNode.element = element;
      
      if(leftOrRight == 0)
      {
         pNode.left = newNode;
      }
      else
      {
         pNode.right = newNode;
      }
   }
   public TNode<E> getNode(E element)
   {
      MyQueue<TNode<E>> q = new MyQueue<>();
      q.add(root);
      while(!q.isEmpty())
      {
         TNode<E> node = q.remove();
         if(node.element.equals(element))
         {
            return node;
         }
         if(node.left != null)
         {
            q.add(node.left);
         }
         if(node.right != null)
         {
            q.add(node.right);
         }
      }
      
      return null;
   }
}
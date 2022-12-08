public class BinaryTree<E>
{
   private TNode<E> root;
   
   private static class TNode<E>
   {
      private E element;
      private TNode<E> left;
      private TNode<E> right;
      
      @Override
      public String toString()
      {
         return element.toString();
      }
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
   
   public void postOrder()
   {
      MyStack<TNode<E>> stack = new MyStack<>();
      MyStack<Integer> marks = new MyStack<>();
      
      stack.push(root);
      marks.push(0);
      
      while(!stack.isEmpty())
      {
         if(marks.peek() == 0)
         {
            TNode<E> node = stack.peek();
            marks.pop();
            marks.push(1);
         
            if(node.right != null)
            {
               stack.push(node.right);
               marks.push(0);
            }
            if(node.left != null)
            {
               stack.push(node.left);
               marks.push(0);
            }
         }
         else
         {
            TNode<E> node = stack.pop();
            marks.pop();
            System.out.print(node.element + " ");
         }
      }
   }
   public void inOrder()
   {
      MyStack<TNode<E>> stack = new MyStack<>();
      stack.push(root);
      
      while(!stack.isEmpty())
      {
         TNode<E> node = stack.peek();
         while(node.left != null)
         {
            stack.push(node.left);
            node = node.left;
         }
         node = stack.pop();
         System.out.print(node.element + " ");
         if(node.right != null)
         {
            stack.push(node.right);
            node = node.right;
         }
         else
         {
            while(!stack.isEmpty() && node.right == null)
            {
               node = stack.pop();
               System.out.print(node.element + " ");
            }
         }
         
         if(node.right != null)
         {
            stack.push(node.right);
            node = node.right;
         }
      }
   }
   public void preOrder()
   {
      MyStack<TNode<E>> stack = new MyStack<>();
      stack.push(root);
      while(!stack.isEmpty())
      {
         TNode<E> node = stack.pop();
         System.out.print(node.element + " ");
         if(node.right != null)
         {
            stack.push(node.right);
         }
         if(node.left != null)
         {
            stack.push(node.left);
         }
      }
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

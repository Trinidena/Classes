import java.util.concurrent.ThreadLocalRandom;

public class TestBST
{
   public static void main(String[] args)
   {
      BinarySearchTree<Integer> tree = new BinarySearchTree<>();
      for(int i = 0; i < 20; i++)
      {
         Integer newInt = ThreadLocalRandom.current().nextInt(1, 101);
         tree.insert(newInt);
      }
      
      System.out.println(tree);
      for(int i = 0; i < 20; i++)
      {
         Integer searchInt = ThreadLocalRandom.current().nextInt(1, 101);
         System.out.println(tree.search(searchInt));
      }
      
         
   }
}
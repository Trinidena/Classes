public class TestMyList<T>
{
   public static void main(String [] args)
   {
      MyList<String> words = new MyList<>();
      MyList<Integer> numbers = new MyList<>();
      
      //words.add("Out" , -1);
      words.add("Alpha" , 0);
      words.add("Bravo" , 2);
      words.add("Charlie" , 4);
      words.add("Delta" , 6);
      words.add("Echo" , 49);
      //words.add("Out" , 50);
      
      //numbers.add(2 , -22);
      numbers.add(2 , 1);
      numbers.add(4 , 3);
      numbers.add(6 , 5);
      numbers.add(8 , 7);
      numbers.add(10 , 9);
      //numbers.add(2 , 100);
      
      System.out.println(words);
      System.out.println(numbers);
   }
    
}
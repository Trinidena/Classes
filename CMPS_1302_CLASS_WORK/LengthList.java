import java.util.*;

public class LengthList {
      public static void main(String[] args) {
            List<Integer> list = new ArrayList<>(
                        List.of(3, 6, 7, 2, 9));

            // list.replaceAll(n -> 5);

            System.out.println(list);
            list.removeIf(n -> n % 3 == 0 && n % 2 != 0);
            System.out.println(list);

            List<OrderedPair> pairs = new ArrayList<>(
                        List.of(new OrderedPair(9), new OrderedPair(5), new OrderedPair(-2)));
            System.out.println(pairs);
            pairs.forEach(obj -> obj.updateY());
            System.out.println(pairs);
      }
}
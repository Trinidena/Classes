import java.util.List;

public class TestLinkdList {
   public static void main(String[] args) {
      List<String> words = new LinkdList<>();
      words.add("a");
      words.add("b");
      words.add("c");
      words.add("d");
      words.add(0, "e");
      words.add(3, "f");
      words.add(5, "g");

      List<Integer> numbers = new LinkdList<>();
      numbers.add(45);
      numbers.add(65);
      numbers.add(87);
      numbers.add(0, 19);
   }
}
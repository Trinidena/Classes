import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment61 {
   public static void main(String[] args) throws FileNotFoundException, IOException {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a file name.");
      String fileName = in.nextLine();
      System.out.println("Enter a string on each line. Enter \"end\" to terminate input.");

      String out = "";

      while (true) {
         String word = in.nextLine();

         if (word.equals("end")) {
            break;
         }
         out = out + word;
      }

      System.out.println(out);

      File inputFile = new File(fileName);
      File answerFile = new File("answer.txt");
      Scanner inputFileScan = new Scanner(fileName);
      Scanner answerFileScan = new Scanner("answer.txt");

      String fileContent = "";
      while (inputFileScan.hasNextLine()) {
         fileContent = fileContent.concat(inputFileScan.nextLine() + "\n");
      }

      FileWriter inputWriter = new FileWriter(fileName);
      FileWriter answerWriter = new FileWriter("answer.txt");
      inputWriter.write(fileContent);
      inputWriter.close();
   }
}
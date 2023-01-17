import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo
{
   public static void main(String[] args)
   {
      Path p1 = Paths.get("");
      System.out.println(p1);
      Path p1Absolute = p1.toAbsolutePath();
      System.out.println(p1Absolute);
      
      Path p2 = Paths.get("alphab.txt");
      System.out.println(p2);
      Path p2Absolute = p2.toAbsolutePath();
      System.out.println(p2Absolute);      
   }
}
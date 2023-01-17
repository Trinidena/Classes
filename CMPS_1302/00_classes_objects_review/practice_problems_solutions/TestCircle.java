public class TestCircle
{
    public static void main(String[] args)
    {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(1.0, "burnt orange");
        Circle[] circles = {circle1, circle2};
        for(int i = 0; i < circles.length; i++)
        {
            System.out.println(circles[i]);
        }
    }
}
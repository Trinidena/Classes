public class TeamDemo
{
   public static void main(String[] args)
   {
      InternationalTeam it1 = new InternationalTeam("Luxembourg", 1, "Luxembourg", "Luxembourgish");   
      InternationalTeam it2 = new InternationalTeam("Spain", 2, "Spain", "Spanish");
      ClubTeam ct1 = new ClubTeam("Chattnooga FC", 1, "Chattanooga");
      ClubTeam ct2 = new ClubTeam("Motorik FC", 2, "Alexandria");
      it1.display();
      it2.display();
      ct1.display();
      ct2.display();
   }
}
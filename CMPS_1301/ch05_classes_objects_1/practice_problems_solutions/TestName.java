public class TestName
{
   public static void main(String[] args)
   {
      Name name1 = new Name();
      name1.setFirstName("Mycroft");
      name1.setMiddleName("Percival");
      name1.setFamilyName("Farnsworth-Huffington");
      name1.setTitle("Mr.");
      name1.setExtra("III");
      name1.setNickName("Percy");
      name1.setIdentifier(37432);
      System.out.println(name1.fullNameInformation());
      System.out.println(name1.familyNameFirstName());
      System.out.println();
      
      Name name2 = new Name();
      name2.setFirstName("Janesally");
      name2.setMiddleName("Alice");
      name2.setFamilyName("Smith");
      name2.setTitle("Dr.");
      name2.setExtra("Esq.");
      name2.setNickName("Jane");
      name2.setIdentifier(37433);         
      System.out.println(name2.fullNameInformation());
      System.out.println(name2.familyNameFirstName());    
   }
}
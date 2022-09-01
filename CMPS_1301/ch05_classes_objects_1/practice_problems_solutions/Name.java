public class Name
{
   private String firstName;
   private String middleName;
   private String familyName;
   private String title;
   private String extra;
   private String nickName;
   private int identifier;
   
   public String fullNameInformation()
   {
      return String.format("%s %s %s \"%s\" %s %s %d", title, firstName,
         middleName, nickName, familyName, extra, identifier); 
   }
   
   public String familyNameFirstName()
   {
      return String.format("%s, %s", familyName, firstName);
   }
   
   public int getIdentifier()
   {
      return identifier;
   }
   
   public void setIdentifier(int identifier)
   {
      this.identifier = identifier;
   }
   
   public String getFirstName()
   {
      return firstName;
   }
   
   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }
   
   public String getMiddleName()
   {
      return middleName;
   }
   
   public void setMiddleName(String middleName)
   {
      this.middleName = middleName;
   }

   public String getFamilyName()
   {
      return familyName;
   }
   
   public void setFamilyName(String familyName)
   {
      this.familyName = familyName;
   }

   public String getTitle()
   {
      return title;
   }
   
   public void setTitle(String title)
   {
      this.title = title;
   }

   public String getExtra()
   {
      return extra;
   }
   
   public void setExtra(String extra)
   {
      this.extra = extra;
   }

   public String getNickName()
   {
      return nickName;
   }
   
   public void setNickName(String nickName)
   {
      this.nickName = nickName;
   }  
}
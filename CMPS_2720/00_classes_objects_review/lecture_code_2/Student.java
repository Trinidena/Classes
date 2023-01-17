public class Student
{
    private String lastName;
    private String firstName;
    private int studentId;
    
    // Note that constructors are overloaded.       
    public Student(String lastName, String firstName)
    {
        // Using this() to call the other constructor.
        this(lastName, firstName, 999);
    }
    public Student(String lastName, String firstName, int studentId)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.studentId = studentId;
    }
    
    // rest of code omitted
}    
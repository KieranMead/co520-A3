/**
 * The PG class represents postgraduate student in a university.
 * It holds relevant details of a postgraduate student.
 *
 * @author Yang He
 * @version  2022
 */
public class PG
{
    // the student's ID
    private String id;

    // the student's name
    private String name;

    // the student's age
    private int age;
    
    // the student's supervisor
    private String supervisor;

    /**
     * Create a new postgraduate student.
     */
    public PG(String id, String name, int age, String supervisor)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.supervisor = supervisor;
    }

    /**
     * Return the student's ID.
     */
    public String getID()
    {
        return id;
    }

    /**
     * Return the name of this person.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Return the age of this student.
     */
    public int getAge()
    {
        return age;
    }
    
    /**
     * Return the student's supervisor.
     */
    public String getSupervisor()
    {
        return supervisor;
    }

    /**
     * Return the student's details.     
     */
    public String toString()
    {
        String details = id + ": " + name + ", aged " + age;
        
        if (supervisor != null) {
            details += ", supervised by " + supervisor;
        }
        return details;
    }
    
    /**
     * Two students are the same if they have the same ID
     * 
     * @param obj  a given object
     * @return  true if obj is a Student with the same ID
     */
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (!(obj instanceof PG)) return false;

        PG student = (PG) obj;

        return student.getID().equals(id);
    }

}
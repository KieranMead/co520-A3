import java.util.ArrayList;

/**
 * The UG class represents undergraduate student in a university.
 * It holds relevant details of a student.
 *
 * @author Yang He
 * @version  2022
 */
public class UG
{
    // the student's ID
    private String id;

    // the student's name
    private String name;

    // the student's age
    private int age;
    
    // courses registered by the student
    private ArrayList<Course> courses;

    /**
     * Create a new undergraduate student.
     */
    public UG(String id, String name, int age)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        
        courses = new ArrayList<Course>();
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
     * Return the courses taken by the student.
     */
    public ArrayList<Course> getCourses()
    {
        return courses;
    }

    // Register the student on a given course
    public void registerOn(Course course) {
        courses.add(course);
    }

    /**
     * Return the student's details.     
     */
    public String toString()
    {
        String details = id + ": " + name + ", aged " + age;

        int n = courses.size();
        if (n > 0) {
            String courseTitles = "'" + courses.get(0).getTitle() + "'";

            for (int i=1; i<courses.size(); i++) {
                courseTitles += ", '" + courses.get(i).getTitle() + "'";
            }

            details += ", registered on " + n + " course";
            if (n > 1) details += "s";
            details += ": " + courseTitles;
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

        if (!(obj instanceof UG)) return false;

        UG student = (UG) obj;

        return student.getID().equals(id);
    }
}
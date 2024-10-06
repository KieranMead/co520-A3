import java.util.ArrayList;

/**
 * The Course class represents a university course.
 * It holds relevant details of a course.
 *
 * @author Yang He
 * @version 2022
 */
public class Course
{
    // the course title
    private String title;

    // the course convener
    private String convener;

    // students registered on this course
    private ArrayList<UG> students;

    /**
     * Create a new course with a given ID, title and convener.
     * 
     * @param title  a given title
     * @param convener a given convener
     */
    public Course(String title, String convener)
    {
        this.title = title;
        this.convener = convener;
        this.students = new ArrayList<>();
    }

    /**
     * Return the title of this course
     */
    public String getTitle()
    {                         
        return title;
    }
        
    /**
     * Enrol a student on the course.
     * 
     * @param student  a given student
     */
    public void enrol(UG student)
    {                               
        students.add(student);
    }

    /**
     * Get the students on this course
     * 
     * @return  A list of students on this course
     */
    public ArrayList<UG> getStudents()
    {                                    
        return students;
    }

    /**
     * Get the course details
     * 
     * @return Details of the course
     */
    public String toString() {
        return title + " (Convener: " + convener + ")";
    }

    /**
     * Check if a given course is the same as this course
     * Two courses are the same if they have the same title
     *
     * @param obj
     * @return true if the course titles are the same
     */
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (!(obj instanceof Course)) return false;

        Course c = (Course) obj;

        return title.equals(c.getTitle());
    }
}
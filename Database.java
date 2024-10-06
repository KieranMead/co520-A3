import java.util.ArrayList;
import java.util.HashMap;

/**
 * The class Database provide facility to store
 * all registrations made by students on courses.
 *
 * @author Yang He
 * @version 2022
 */
public class Database {

    // The maximum number of courses 
    // for an undergraduate student
    public static final int MAX_NUM_COURSES = 4;

    private final ArrayList<UG> ugList;
    private final ArrayList<PG> pgList;
    private final ArrayList<Course> courseList;

    /**
     * Construct an empty Database.
     */
    public Database() {
        ugList = new ArrayList<>();
        pgList = new ArrayList<>();
        courseList = new ArrayList<>();
    }

    /**
     * Add a new student.
     *
     * @param student The student to be added.
     */
    public void addUGStudent(UG student) {
        if (student == null) {             
            System.out.println("** Student list should not contain null values");
            return;
        }

        if (ugList.contains(student)) {
            System.out.println("** Student list shoul not contain any duplicates");
            return;
        }

        ugList.add(student);
    }

    public void addPGStudent(PG student) {
        if (student == null) {             
            System.out.println("** Student list should not contain null values");
            return;
        }

        if (ugList.contains(student)) {
            System.out.println("** Student list should not contain any duplicates");
            return;
        }

        pgList.add(student);
    }

    /**
     * Print the details of all students
     */
    public void printAllStudents() {

        System.out.println("-----------------------------");
        System.out.println("All students in the database:");
        for (UG ug: ugList) {
            System.out.println(ug);
        }

        for (PG pg: pgList) {
            System.out.println(pg);
        }
    }
    
    /**
     * Print the total number of all students
     * 
     */
    public int getTotalStudents()
    {
        return ugList.size() + pgList.size();
    }

    /**
     * Task 3(a)
     * 
     * Find a course with the given title in the database
     *
     * @return The course with the given title if it is in the database, 
     *         otherwise return null
     */
    public Course findCourse(String title) {

        // TODO

        return null;
    }

    /**
     * Task 3(b)
     * 
     * Get a list of postgraduate students supervised by a given supervisor
     *
     * @param supervisor A given supervisor
     * @return A list of students supervised by the given supervisor. 
     *         It returns null if the given supervisor doesn't have any students
     */
    public ArrayList<PG> studentsSupervisedBy(String supervisor) {

        // TODO

        return null;
    }

    /**
     * Task 3(c)
     * 
     * Register an undergraduate student on a course.
     *
     * @param student     A given student.
     * @param courseTitle A given course.
     */
    public void registration(Student student, String courseTitle) {

        // TODO

    }

    /**
     * Task 3(d)
     * 
     * Get stats for a given type of students
     * 
     * @param type A given class of students, e.g. UG.class or PG.class
     * @return HashMap of stats for the given type of students: 
     *   the total number and their average age 
     */
    public HashMap<String, Integer> getStats(Class type) {

        HashMap<String,Integer> stats = new HashMap<>();
        stats.put("Total", 0);  
        stats.put("Mean", 0);

        // TODO

        return stats;
    }

    //////////////////////////////////////////////////////////////////////////
    /**
     * Print out the stats of the given type of students
     */
    public void printStatsOfStudents(Class type) {
        HashMap<String, Integer> stats = getStats(type);

        System.out.println("-----------------------------");
        System.out.println("Stats of " + type.getName() + " students:");
        System.out.println("Total number: " + stats.get("Total")); 
        System.out.println("Average age: " + stats.get("Mean"));

    }

    /**
     * Add a new course.
     *
     * @param course The course to be added.
     */
    public void addCourse(Course course) {
        if (course == null) {
            System.out.println("** Course list should not contain null values");
            return;
        }

        if (courseList.contains(course)) {
            System.out.println("** Course list should not contain any duplicates");
            return;
        }

        courseList.add(course);
    }

    public int getTotalCoures()
    {
        return courseList.size();
    }
}
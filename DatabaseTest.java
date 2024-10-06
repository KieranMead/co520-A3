
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class DatabaseTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DatabaseTest
{
    private Database db;
    private UG ug1, ug2;

    /**
     * Default constructor for test class DatabaseTest
     */
    public DatabaseTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        db = new Database();
        ug1 = new UG("ug1", "Sam", 20);
        ug2 = new UG("ug2", "Ben", 18);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    /*
     * Testing addUGStudent method
     */
    @Test
    public void shouldAddNewStudent() {

        db.addUGStudent(ug1);
        db.addUGStudent(ug2);        

        db.printAllStudents();
        db.printStatsOfStudents(UG.class);

        assertEquals(db.getTotalStudents(), 2);
    }

    @Test
    public void shouldNotAddNull() {

        db.addUGStudent(null);
        
        assertEquals(db.getTotalStudents(), 0);
    }

    @Test
    public void shouldNotAddDuplicateStudent() {

        db.addUGStudent(ug1);
        db.addUGStudent(ug1);
        
        assertEquals(db.getTotalStudents(), 1);
    }

    @Test
    public void shouldNotAddStudentWithTheSameID() {

        db.addUGStudent(ug1);
        
        String id = ug1.getID();
        db.addUGStudent(new UG(id, "test", 0));
        
        assertEquals(db.getTotalStudents(), 1);
    }

}

package liskovsubstitutionprinciple;

/**
 *
 * @author abbyp
 */
public class ScienceTeacher extends SchoolStaff implements CourseInstructor {

    @Override
    public void teach() {
        System.out.println("Taught science...");    }
    
}

package EnrolmentSystem.Class.unittest;
import EnrolmentSystem.Class.Student;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
public class StudentTest {
    Student testStudent=new Student("s3222333","Trung","13/7/2000");
    @Test
    void getId() {
        Assert.assertEquals("s3222333",testStudent.getID());
    }

    @Test
    void getName() {
        Assert.assertEquals("Trung",testStudent.getName());
    }

    @Test
    void getBirthdate(){
        // I expect the number is true
        Assert.assertEquals("13/7/2000", testStudent.getBirthdate());
    }
}

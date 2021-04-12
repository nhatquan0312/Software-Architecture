package EnrolmentSystem.Class.unittest;
import EnrolmentSystem.Class.Course;
import EnrolmentSystem.Class.Student;
import EnrolmentSystem.Class.StudentEnrolment;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class StudentEnrollmentTest {
    Student student= new Student("s3123789","Binh","16/5/2001");
    Course course = new Course("LANG1234","Japanese1",12);
    StudentEnrolment testEnrolment =  new StudentEnrolment(student,course,"2020C");
    @Test
    void getStudent() {
        Assert.assertEquals(student,testEnrolment.getStudent());
    }

    @Test
    void getName() {
        Assert.assertEquals(course,testEnrolment.getCourse());
    }

    @Test
    void getBSemseter(){
        // I expect the number is true
        Assert.assertEquals("2020C", testEnrolment.getSemester());
    }
    @Test
    void getStudentID(){
        Assert.assertEquals("s3123789",testEnrolment.getStudentID());
    }
    @Test
    void getCourseID(){
        Assert.assertEquals("LANG1234",testEnrolment.getCourseID());
    }


}

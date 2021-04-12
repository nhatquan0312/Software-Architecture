package EnrolmentSystem.Class.unittest;

import EnrolmentSystem.Class.Course;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
public class CourseTest {
    private Course courseTest=new Course("LANG1234","Japanese1",12);

    @Test
    void getId() {
        Assert.assertEquals("LANG1234", courseTest.getID());
    }

    @Test
    void getName() {
        Assert.assertEquals("Japanese1",courseTest.getName());
    }

    @Test
    void getNumberOfCredit(){
        // I expect the number is true
        Assert.assertEquals(12, courseTest.getNumberOfCredit());
    }
}

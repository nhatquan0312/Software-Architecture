package EnrollmentSystem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Student {
    private String studentID;
    private String studentName;
    private String birthdate;
    private ArrayList<Course> courseList;

    public Student() {
        this.studentName = "Default Student";
        this.studentID = "s001";
    }

    public Student(String studentName, String studentID,String birthdate) {
        super();
        this.studentName = studentName;
        this.studentID = studentID;
        this.birthdate = birthdate;
        courseList = new ArrayList<Course>();
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentID() {
        return studentID;
    }
    public void addCourse (Course course) {
        if (courseList.contains(course)) {
            System.out.println("Already added");
        }
        courseList.add(course);
        course.getStudentList().add(this);
        System.out.println("Add successful");
    }

    @Override
    public String toString() {
        return "Student [studentName=" + studentName + ", studentID=" + studentID + "]";
    }
}

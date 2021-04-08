package EnrollmentSystem;

import java.util.ArrayList;
import java.util.Date;

public class Student {
    private String studentID;
    private String studentName;
    private Date birthdate;
    private ArrayList<Course> courseList;

    public Student() {
        this.studentName = "Default Student";
        this.studentID = "s001";
    }

    public Student(String studentName, String studentID) {
        super();
        this.studentName = studentName;
        this.studentID = studentID;
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

    @Override
    public String toString() {
        return "Student [studentName=" + studentName + ", studentID=" + studentID + "]";
    }
}

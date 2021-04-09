package EnrollmentSystem;

import java.util.ArrayList;

public class Course{
    private String courseName;
    private String courseID;
    private ArrayList<Student> studentList;
    private int noOfCredit;

    public Course(String courseName, String courseID) {
        super();
        this.courseName = courseName;
        this.courseID = courseID;
        studentList = new ArrayList<Student>();
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseID() {
        return courseID;
    }


    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public boolean addStudent (Student student) {
        if (studentList.contains(student)) {
            return false;
        }
        studentList.add(student);
        student.getCourseList().add(this);
        return true;
    }

    @Override
    public String toString() {
        return "Course [courseName=" + courseName + ", courseID=" + courseID + "]";
    }

}

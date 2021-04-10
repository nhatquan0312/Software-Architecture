package EnrollmentSystem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Student {
    private String studentID;
    private String studentName;
    private String birthdate;
    private ArrayList<Course> courseList;

    public Student(String studentID, String studentName, String birthdate) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.birthdate = birthdate;
        courseList = new ArrayList<Course>();
    }

//    Scanner in = new Scanner(System.in);
//        System.out.println("Enter Student ID");
//        this.studentID= in.nextLine();
//
//        System.out.println("Enter Student Name");
//        this.studentName= in.nextLine();
//
//        System.out.println("Enter student birthdate under the format year/month/day");
//        this.birthdate = in.nextLine();

    public void setStudentID(String studentID) {
        this.studentID = studentID;
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

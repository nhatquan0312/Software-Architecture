package EnrolmentSystem.Class;

import EnrolmentSystem.Class.Course;
import EnrolmentSystem.Class.Student;

public class StudentEnrolment {
      private Student student;
      private Course course;
      private String semester;

    public StudentEnrolment(Student student, Course course, String semester) {
        this.student = student;
        this.course = course;
        this.semester = semester;
    }

    public Student getStudent() {
        return student;
    }
    public Course getCourse() {
        return course;
    }
    public String getSemester() {
        return semester;
    }
    public String getStudentID(){
        return getStudent().getID();
    }
    public String getCourseID(){
        return getCourse().getID();
    }


}

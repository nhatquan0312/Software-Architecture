package EnrolmentSystem.Class.list;

import EnrolmentSystem.CSVReport;
import EnrolmentSystem.Class.Course;
import EnrolmentSystem.Class.Student;
import EnrolmentSystem.Class.StudentEnrolment;
import EnrolmentSystem.StudentEnrolmentManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentEnrolmentList implements StudentEnrolmentManager {
    private Scanner userInput = new Scanner(System.in);
    private static StudentEnrolmentList enrolmentList;
    private StudentList students = StudentList.getInstance();
    private CourseList courses = CourseList.getInstance();

    protected ArrayList<StudentEnrolment> enrolments = new ArrayList<>();

    public void add() {
        StudentEnrolment newEnrolment = userInputEnrolment();
        try {
            enrolments.add(newEnrolment);
            System.out.println("Added successfully!!");
        }
        catch(Exception e){
            System.out.println("Something is wrong");
        }
    }

    @Override
    public void update() {
        System.out.print(" Type 1 to Add Course for a student \n"
                +" Type 2 to Delete:");
        String userChoice = userInput.nextLine();
        try {
            int choice = Integer.parseInt(userChoice);
            if (choice == 1) {
                add();
            }
            else if (choice == 2){
                delete();
            }
            else {
                System.out.println("Must be 1 or 2");
            }
        }
        catch (Exception e){
            System.out.println("Must be 1 or 2");
        }
    }

    @Override
    public void delete() {
        try {
            System.out.print("Type student id:");
            String studentId = userInput.nextLine();
            System.out.print("Type course id:");
            String courseId = userInput.nextLine();
            enrolments.removeIf(enrolment ->
                    enrolment.getStudentID().equals(studentId)
                    && enrolment.getCourseID().equals(courseId));
        }
        catch (Exception e){
            System.out.println("Something wrong!!");
        }
    }

    @Override
    public StudentEnrolment getOne(StudentEnrolment userInput) {
        for (StudentEnrolment enrolment: enrolments) {
            { if(userInput.getStudentID() == enrolment.getStudentID()){;
                return enrolment;
                }
            }
        }
        return null;
    }

    @Override
    public ArrayList<StudentEnrolment> getAll() {
        return enrolments;
    }

    public StudentEnrolment userInputEnrolment() {
        Student student = students.userInput();
        Course course = courses.userInput();
        System.out.print("Semester:");
        String semester = userInput.nextLine();
        return new StudentEnrolment(student, course, semester);
    }

    public void addExamples(StudentEnrolment sample){
        enrolments.add(sample);
    }
    public void coursesOfStudent() {
        System.out.print("Please type student id to check:");
        String studentId = userInput.nextLine();
        if (!isExistStudent(studentId)) {
            System.out.println("Cannot find this student!!");
        }
        else {
            System.out.print("Choose semester:");
            String semester = userInput.nextLine();
            if (!isExistSemester(semester)){
                System.out.println("Cannot find the Semester !!");
            }
            else {
                showCourseList(studentId, semester);
            }
        }
    }
    public void showCourseList(String studentId, String semester){
        System.out.println("The course list:");
        List<Course> courses = new ArrayList<>();
        for (StudentEnrolment enrolment : getAll()) {
            if (studentId.equals(enrolment.getStudentID()) && semester.equals(enrolment.getSemester())){
                courses.add(enrolment.getCourse());
            }
        }
        System.out.println("CourseID CourseName NumberOfCredit");
        for (Course course: courses){
            System.out.println(course.getID()+" "+course.getName()+" "+ course.getNumberOfCredit() );
        }
        CSVReport.coursesOfStudent(courses, "C:\\Users\\Nhat Quan\\IdeaProjects\\Software-Architecture\\EnrolmentSystem\\Class\\reports\\report.csv");
    }
    public Boolean isExistStudent(String studentId){
        for (StudentEnrolment enrolment : enrolments) {
            if (enrolment.getStudentID().equals(studentId)) {
                return true;
            }
        }
        return false;
    }

    public Boolean isExistCourse(String courseId){
        for (StudentEnrolment enrolment : enrolments) {
            if (enrolment.getCourseID().equals(courseId)) {
                return true;
            }
        }
        return false;
    }
    public Boolean isExistSemester(String semester){
        for (StudentEnrolment enrolment : enrolments) {
            if (enrolment.getSemester().equals(semester)) {
                return true;
            }
        }
        return false;
    }
    public void studentsOfCourse() {
        System.out.print("Please type course id to check:");
        String courseId = userInput.nextLine();
        if (!isExistCourse(courseId)) {
            System.out.println("Cannot find this course!!");
        }
        else {
            System.out.print("Choose semester:");
            String semester = userInput.nextLine();
            if (!isExistSemester(semester)){
                System.out.println("Cannot find the Semester !!");
            }
            else {
                showStudentList(courseId, semester);
            }
        }
    }

    public void coursesOfSemester() {
        System.out.print("Which semester do you want to check?:");
        String semester = userInput.nextLine();
        if(!isExistSemester(semester)){
            System.out.println("Cannot find the semester");
        }
        else {
            showCoursesOfSemester(semester);
        }
    }
    public void showStudentList(String courseId, String semester){
        System.out.println("The student list:");
        List<Student> students = new ArrayList<>();
        for (StudentEnrolment enrolment : enrolments) {
            if (courseId.equals(enrolment.getCourseID()) && semester.equals(enrolment.getSemester())){
                students.add(enrolment.getStudent());
            }
        }
        System.out.println("StudentID StudentName Birthday");
        for (Student student: students){
            System.out.println(student.getID()+" "+student.getName()+" "+ student.getBirthdate());
        }
        CSVReport.studentsOfCourse(students, "C:\\Users\\Nhat Quan\\IdeaProjects\\Software-Architecture\\EnrolmentSystem\\Class\\reports\\report.csv");
    }

    public void showCoursesOfSemester(String semester) {
        System.out.println("The course list:");
        List<Course> courses = new ArrayList<>();
        for (StudentEnrolment enrolment : enrolments) {
            if (semester.equals(enrolment.getSemester())) {
                courses.add(enrolment.getCourse());
            }
        }
        System.out.println("CourseID CourseName NumberOfCredit");
        for (Course course: courses){
            System.out.println(course.getID()+" "+course.getName()+" "+ course.getNumberOfCredit() );
        }
        CSVReport.coursesOfStudent(courses, "C:\\Users\\Nhat Quan\\IdeaProjects\\Software-Architecture\\EnrolmentSystem\\Class\\reports\\report.csv");
    }



}

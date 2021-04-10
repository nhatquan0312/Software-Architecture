package EnrolmentSystem;

import EnrolmentSystem.Class.Course;
import EnrolmentSystem.Class.Student;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class CSVReport {
    private static CSVReport report;
    private static PrintWriter csvWriter;

    public static CSVReport getInstance() {
        if (report == null)
            report = new CSVReport();
        return report;
    }
    public static void coursesOfStudent(List<Course> courseList, String filename){
        try {
            csvWriter = new PrintWriter(filename);
            csvWriter.append("ID,Name,NumberOfCredits\n");
            for (Course course : courseList) {
                csvWriter.append(String.join(",", course.getID()));
                csvWriter.append(",");
                csvWriter.append(String.join(",", course.getName()));
                csvWriter.append(",");
                csvWriter.append(String.join(",", Integer.toString(course.getNumberOfCredit())));
                csvWriter.append("\n");
            }
            csvWriter.close();
            JOptionPane.showMessageDialog(null, "Record saved !!");
        } catch (IOException e) {
            System.out.println("Please check again!!");
            JOptionPane.showMessageDialog(null, "Fail to report!!");
        }
    }
    public static void studentsOfCourse(List<Student> studentList, String filename){
        try {
            csvWriter = new PrintWriter(filename);
            csvWriter.append("ID,Name,Birthday\n");
            for (Student student : studentList) {
                csvWriter.append(String.join(",", student.getID()));
                csvWriter.append(",");
                csvWriter.append(String.join(",", student.getName()));
                csvWriter.append(",");
                csvWriter.append(String.join(",", student.getBirthdate()));
                csvWriter.append("\n");
            }
            csvWriter.close();
            JOptionPane.showMessageDialog(null, "Record saved !!");
        } catch (IOException e) {
            System.out.println("Please check again!!");
            JOptionPane.showMessageDialog(null, "Fail to report!!");
        }
    }
}

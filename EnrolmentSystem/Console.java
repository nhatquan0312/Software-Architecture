package EnrolmentSystem;

import EnrolmentSystem.Class.Course;
import EnrolmentSystem.Class.Student;
import EnrolmentSystem.Class.StudentEnrolment;
import EnrolmentSystem.Class.list.StudentEnrolmentList;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
    String path = "C:\\Users\\Nhat Quan\\Downloads\\default.csv";
    String line = "";
    StudentEnrolmentList enrolmentList = new StudentEnrolmentList();
    Scanner input = new Scanner(System.in);

        Student student1 = new Student("s3123456", "Quan","03/12/2001");
        Student student2 = new Student("s3111222", "Phong","12/06/2001");
        Student student3 = new Student("s3123123", "Bao","06/07/2001");
        Course course1 = new Course("COSC1234","SADI", 12);
        Course course2 = new Course("COSC1111","Web Programming", 12);
        Course course3 = new Course("ISYS3048","Pratical Database Concept", 12);
        Course course4 = new Course("COSC2345", "Programming 1", 12);
        StudentEnrolment enrolment1 = new StudentEnrolment(student1, course1 , "2020C");
        enrolmentList.addExamples(enrolment1);
        StudentEnrolment enrolment2 = new StudentEnrolment(student2, course2 , "2020C");
        enrolmentList.addExamples(enrolment2);
        StudentEnrolment enrolment3 = new StudentEnrolment(student3, course3 , "2020B");
        enrolmentList.addExamples(enrolment3);
        StudentEnrolment enrolment4 = new StudentEnrolment(student3, course2 , "2020C");
        enrolmentList.addExamples(enrolment4);
        StudentEnrolment enrolment5 = new StudentEnrolment(student2, course3 , "2020A");
        enrolmentList.addExamples(enrolment5);
        StudentEnrolment enrolment6 = new StudentEnrolment(student1, course3 , "2021A");
        enrolmentList.addExamples(enrolment6);
        StudentEnrolment enrolment7 = new StudentEnrolment(student3, course1 , "2020A");
        enrolmentList.addExamples(enrolment7);
        StudentEnrolment enrolment8 = new StudentEnrolment(student1, course4 , "2020A");
        enrolmentList.addExamples(enrolment8);
        StudentEnrolment enrolment9 = new StudentEnrolment(student3, course4 , "2021A");
        enrolmentList.addExamples(enrolment9);
        StudentEnrolment enrolment10 = new StudentEnrolment(student1,course2,"2020C");

        System.out.println("Please select yes if user wants to view any file and no if the use don't want to");
        String result= input.nextLine();
        //Create menu options
        switch (result){
            case "no":
                System.out.println("Sample enrollment list");
                try{
                    BufferedReader br=new BufferedReader(new FileReader(path));

                    while((line=br.readLine())!=null){
                        System.out.println(line);
                    }
                } catch(FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "yes":
                System.out.println("Type 1 to view courses of a student in a semester \n" +
                        "Type 2 to view students of a course in a semester \n" +
                        "Type 3 to view courses offered in a semester \n" +
                        "Type 4 to add new enrollment \n"+
                        "Type 5 to delete an enrollment\n"+
                        "Type 0 to exit \n" +
                        "Choice:");
                String option = input.nextLine();
                switch (option){
                    case "0":
                        System.out.println("Thank you");
                        break;
                    case "1":
                        enrolmentList.coursesOfStudent();
                        break;
                    case "2":
                        enrolmentList.studentsOfCourse();
                        break;
                    case "3":
                        enrolmentList.coursesOfSemester();
                        break;
                    case "4":
                        enrolmentList.add();
                        break;
                    case "5":
                        enrolmentList.delete();
                        break;
                    case "6":

                        break;
                }
                break;

        }

    }
}

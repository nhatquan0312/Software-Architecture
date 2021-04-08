package EnrollmentSystem;

public class StudentEnrollment {
    public static void main(String args[]) {
        Course c1 = new Course("c001", "SADI");
        Student s1 = new Student("s001", "Minh");
        Student s2 = new Student("s002", "Ben");

        System.out.println(c1);         
        System.out.println(s1);

        if (c1.enroll(s1)) {
            System.out.println("Successfully enrolled");
        }
        else {
            System.out.println("Already in there");
        }

        if (c1.enroll(s2)) {
            System.out.println("Successfully enrolled");
        }
        else {
            System.out.println("Already in there");
        }

        if (c1.enroll(s1)) {
            System.out.println("Successfully enrolled");
        }
        else {
            System.out.println("Already in there");
        }

        System.out.println(c1.getStudentList().toString());
        System.out.println(s1.getCourseList().toString());
    }

}

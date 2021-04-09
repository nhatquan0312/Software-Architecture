package EnrollmentSystem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

interface StudentEnrollmentManager{
    void add();
    void update();
    void delte();
    void getOne();
    void getAll();
}
public class StudentEnrollment {
    public static void main(String args[]) {
        Student s1 = new Student("Quan", "s3819347", "2001/03/12");
        Course c1 = new Course("SADI", "1001");
        Course c2 = new Course("WP", "1002");

        String path = "C:\\Users\\Nhat Quan\\Downloads\\default.csv";
        String line = "";

        Scanner scan = new Scanner(System.in);
        System.out.println("Option:");
        String result = scan.nextLine();
        switch (result) {
            case "yes" -> {
                System.out.println("Sample Enrollment List");
                try {
                    BufferedReader br = new BufferedReader(new FileReader(path));
                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            case "no" -> {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Option:");
                String results = scan.nextLine();
                switch (results) {
                    case "1":
                        System.out.println("Hello");
                        break;
                    case "2":
                        System.out.println("World");
                        break;

                }
            }
        }
    }
}

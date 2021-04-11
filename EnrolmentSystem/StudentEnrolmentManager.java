package EnrolmentSystem;

import EnrolmentSystem.Class.StudentEnrolment;

import java.util.ArrayList;

public interface StudentEnrolmentManager{
        void add();
        void update();
        void delete();
        StudentEnrolment getOne(StudentEnrolment enrolment);
        ArrayList<StudentEnrolment> getAll();

    }


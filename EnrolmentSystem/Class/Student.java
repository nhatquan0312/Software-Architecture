package EnrolmentSystem.Class;

import EnrolmentSystem.Class.AbstractClass;

public class Student extends AbstractClass {
    private String birthdate;



    public String getBirthdate() {
        return birthdate;
    }

    public Student(String id, String name, String birthdate) {
        super(id,name);
        this.birthdate = birthdate;
    }

    @Override
    public String getID() {
            return id;
    }

    @Override
    public String getName() {
        return name;
    }
}

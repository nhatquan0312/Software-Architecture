package EnrolmentSystem.Class;

public class Course extends AbstractClass {

    private int numberOfCredit;


    public int getNumberOfCredit() {
        return numberOfCredit;
    }

    public Course(String id, String name, int numberOfCredit) {
        super(id,name);
        this.numberOfCredit=numberOfCredit;
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

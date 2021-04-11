package EnrolmentSystem.Class;

public class Course extends AbstractClass {

    private int numberOfCredit;


    public int getNumberOfCredit() {
        return numberOfCredit;
    }

    public Course(String name, String id, int numberOfCredit) {
        super(name,id);
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

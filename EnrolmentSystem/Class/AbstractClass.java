package EnrolmentSystem.Class;

public abstract class AbstractClass {
    protected String id;
    protected String name;

    public AbstractClass(String id, String name) {
        this.id=id;
        this.name=name;
    }


    public abstract String getID();
    public abstract String getName();
}


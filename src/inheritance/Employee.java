package inheritance;

// Subclass till Person
public class Employee extends Person {
    private int id;

    public Employee(String name, String hairColour, int age, boolean isHappy, int id) {
        super(name, hairColour, age, isHappy);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

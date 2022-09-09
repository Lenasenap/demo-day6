package inheritance;

// Superclass
public class Person {
    private String name;
    private String hairColour;
    private int age;
    private boolean isHappy;

    public Person(String name, String hairColour, int age, boolean isHappy) {
        this.name = name;
        this.hairColour = hairColour;
        this.age = age;
        this.isHappy = isHappy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHairColour() {
        return hairColour;
    }

    public void setHairColour(String hairColour) {
        this.hairColour = hairColour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHappy() {
        return isHappy;
    }

    public void setHappy(boolean happy) {
        isHappy = happy;
    }
}

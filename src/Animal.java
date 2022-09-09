public class Animal {
    // Egenskaper
    final String type;
    private int age;

    // Sätter ett värde på objektet
    public void setAge(int age) {
        this.age = age;
    }

    // Hämtar värdet på objektet
    public int getAge() {
        return age;
    }

    // Konstruktor för att kunna sätta ett värde på type trots att variabeln är final
    public Animal(String type) {
        this.type = type;
    }

    // Beteende
    void makeSound() {
        System.out.println("Djuret låter");
    }

}

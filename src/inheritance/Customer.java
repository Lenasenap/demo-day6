package inheritance;

// Subclass till Person
// Superclass till Child
public class Customer extends Person {
    private int amountOfMoney;

    public Customer(String name, String hairColour, int age, boolean isHappy, int amountOfMoney) {
        super(name, hairColour, age, isHappy);
        this.amountOfMoney = amountOfMoney;
    }

    public int getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }
}

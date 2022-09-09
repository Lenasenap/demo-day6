package inheritance;

// Subclass till Customer
public class Child extends Customer {
    private boolean wantsToGoHome;

    public Child(String name, String hairColour, int age, boolean isHappy, int amountOfMoney, boolean wantsToGoHome) {
        super(name, hairColour, age, isHappy, amountOfMoney);
        this.wantsToGoHome = wantsToGoHome;
    }

    public boolean isWantsToGoHome() {
        return wantsToGoHome;
    }

    public void setWantsToGoHome(boolean wantsToGoHome) {
        this.wantsToGoHome = wantsToGoHome;
    }
}

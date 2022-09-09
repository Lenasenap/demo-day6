package afternoon;

public class Vase {
    private String colour;
    private boolean broken;

    public Vase(String colour, boolean broken) {
        this.colour = colour;
        this.broken = broken;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isBroken() {
        return broken;
    }

    public void setBroken(boolean broken) {
        this.broken = broken;
    }
}

import java.util.ArrayList;

public class Torba {
    protected double nosilnost;
    protected ArrayList<Steklenica> steklenice = new ArrayList<>();

    // Constructor for Torba
    public Torba(double nosilnost) {
        this.nosilnost = nosilnost;
    }

    // Abstract method for counting bottles, which should be implemented by subclasses
    public int steviloSteklenic() {
        return steklenice.size();
    }

    // Methods for managing the bottles in the bag
    public void addSteklenica(Steklenica steklenica) {
        steklenice.add(steklenica);
    }
}
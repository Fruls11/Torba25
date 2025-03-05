public class TorbaZaNakupovanje extends Torba {
    public TorbaZaNakupovanje(double nosilnost) {
        super(nosilnost); // Calling the constructor of the superclass
    }

    @Override
    public String toString() {
        return "TorbaZaNakupovanje [nosilnost=" + nosilnost + " kg]";
    }

    // Getter for nosilnost
    public double getNosilnost() {
        return nosilnost; // Return the nosilnost value
    }
}
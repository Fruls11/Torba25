public class TorbaZaPiknik extends Torba {
    private boolean kompaktnost;

    // Constructor for TorbaZaPiknik
    public TorbaZaPiknik(double nosilnost, boolean kompaktnost) {
        super(nosilnost); // Calling the constructor of the superclass (Torba)
        this.kompaktnost = kompaktnost;
    }

    @Override
    public String toString() {
        return "TorbaZaPiknik [nosilnost=" + nosilnost + " kg, kompaktnost=" + kompaktnost + "]";
    }

    public boolean isKompaktna() {
        return kompaktnost;
    }
}
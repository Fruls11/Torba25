public class Steklenica implements Zmogljivost {
    private int kapaciteta;  // Kapaciteta steklenice v ml
    private String vsebina;  // Vrsta vsebine v steklenici (npr. voda, pivo, mleko)

    // Konstruktor za inicializacijo steklenice
    public Steklenica(int kapaciteta, String vsebina) {
        this.kapaciteta = kapaciteta;
        this.vsebina = vsebina;
    }

    // Getter za kapaciteto
    public int getKapaciteta() {
        return kapaciteta;
    }

    // Implementacija metode preveriZmogljivost() iz vmesnika Zmogljivost
    @Override
    public void preveriZmogljivost() {
        System.out.println("Kapaciteta steklenice je " + kapaciteta + " ml.");
    }
    
    // Metoda za prikaz informacij o steklenici
    @Override
    public String toString() {
        return "Steklenica{" + "kapaciteta=" + kapaciteta + ", vsebina='" + vsebina + '\'' + '}';
    }
}
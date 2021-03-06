package no.hiof.tmwasbra;

public class Fly {

    private String modell;
    private int passansjerer;
    private int seter;

    public Fly(String modell, int passansjerer, int seter) {
        this.modell = modell;
        this.passansjerer = passansjerer;
        this.seter = seter;
    }

    public void leggTilEnPassansjer() {
        passansjerer += 1;
    }

    public String getModell() {
        return modell;
    }

    public int getPassansjerer() {
        return passansjerer;
    }

    public void setPassansjerer(int passansjerer) {
        this.passansjerer = passansjerer;
    }

    public int getSeter() {
        return seter;
    }

    @Override
    public String toString() {
        return "Fly{" +
                "modell='" + modell + '\'' +
                ", passansjerer=" + passansjerer +
                ", seter=" + seter +
                '}';
    }
}

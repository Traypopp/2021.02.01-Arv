package no.hiof.tmwasbra;

public class Main {

    public static void main(String[] args) {
        Fly boeing737 = new Fly("Boeing-737", 0, 150);

        boeing737.leggTilEnPassansjer();
        boeing737.leggTilEnPassansjer();
        boeing737.leggTilEnPassansjer();

        System.out.println("Modell: " + boeing737.getModell() + " har passansjerer: " + boeing737.getPassansjerer());
    }
}

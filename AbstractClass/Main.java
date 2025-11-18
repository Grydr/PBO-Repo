public class Main {
    public static void main(String[] args) {
        Manusia programmer = new Programmer("Jalu");
        Manusia dokter = new Dokter("Bambang");

        programmer.bernafas();
        programmer.tumbuh();
        programmer.bicara();

        dokter.bernafas();
        dokter.tumbuh();
        dokter.bicara();

        Binatang anjing = new Anjing("Foxy");
        Binatang burung = new Burung("Curut");

        anjing.bernafas();
        anjing.tumbuh();
        anjing.bergerak();

        burung.bernafas();
        burung.tumbuh();
        burung.bergerak();

        Tanaman mawar = new TanamanBerbunga("Mawar");
        Tanaman pakis = new TanamanTidakBerbunga("Pakis");

        mawar.bernafas();
        mawar.tumbuh();
        mawar.fotosintesis();

        pakis.bernafas();
        pakis.tumbuh();
        pakis.fotosintesis();
    }
}

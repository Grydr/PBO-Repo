public class Burung extends Binatang {
    public Burung(String nama) {
        super(nama);
    }

    public void tumbuh() {
        System.out.println(getName() + " Tumbuh dengan makan biji-bijian");
    }

    public void bergerak() {
        System.out.println(getName() + " Terbang dari pohon     ke pohon");
    }
}

public class TanamanBerbunga extends Tanaman {
    public TanamanBerbunga(String nama) {
        super(nama);
    }

    public void tumbuh() {
        System.out.println(getName() + " Banyak menghasilkan bunga");
    }

    public void fotosintesis() {
        System.out.println(getName() + " Menghasilkan banyak hasil dari fotosintesis");
    }
}

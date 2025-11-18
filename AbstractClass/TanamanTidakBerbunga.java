public class TanamanTidakBerbunga extends Tanaman{
    public TanamanTidakBerbunga(String nama) {
        super(nama);
    }

    public void tumbuh() {
        System.out.println(getName() + " Tidak menghasilkan bunga");
    }

    public void fotosintesis() {
        System.out.println(getName() + " Berfotosintesis tanpa menghasilkan bunga");
    }

}

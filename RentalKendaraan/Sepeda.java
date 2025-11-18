public class Sepeda extends Kendaraan {
    private String jenisSepeda;

    public Sepeda(String merk, String model, int tahunProduksi, boolean tersedia, String jenisSepeda) {
        super(merk, model, tahunProduksi, tersedia);
        this.jenisSepeda = jenisSepeda;
    }

    public String getJenisSepeda() {
        return jenisSepeda;
    }

    public void setJenisSepeda(String jenisSepeda) {
        this.jenisSepeda = jenisSepeda;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jenis: Sepeda, Tipe Sepeda: " + jenisSepeda);
    }
}

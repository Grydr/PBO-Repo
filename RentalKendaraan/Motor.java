public class Motor extends Kendaraan {
    private int jumlahRoda;

    public Motor(String merk, String model, int tahunProduksi, boolean tersedia, int jumlahRoda) {
        super(merk, model, tahunProduksi, tersedia);
        this.jumlahRoda = jumlahRoda;
    }

    public int getJumlahRoda() {
        return jumlahRoda;
    }

    public void setJumlahRoda(int jumlahRoda) {
        this.jumlahRoda = jumlahRoda;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jenis: Motor, Jumlah Roda: " + jumlahRoda);
    }
}

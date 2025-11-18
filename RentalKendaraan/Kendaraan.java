public abstract class Kendaraan {
    private String merk;
    private String model;
    private int tahunProduksi;
    private boolean tersedia;

    protected Kendaraan(String merk, String model, int tahunProduksi, boolean tersedia) {
        this.merk = merk;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
        this.tersedia = tersedia;
    }

    public void printInfo() {
        System.out.println("Merk: " + merk + " Model: " + model + " Tahun Produksi: " + tahunProduksi + " Tersedia: " + ((tersedia) ? "Ya" : "Tidak"));
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    public void setTersedia(boolean bool) {
        tersedia = bool;
    }

    public String getMerk() {
        return this.merk;
    }

    public String getModel() {
        return this.model;
    }

    public int getTahunProduksi() {
        return this.tahunProduksi;
    }

    public boolean getTersedia() {
        return this.tersedia;
    }


}

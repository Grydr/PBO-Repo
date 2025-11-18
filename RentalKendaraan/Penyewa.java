public class Penyewa {
    private String nama;
    private Kendaraan kendaraanSewaan;

    public Penyewa(String nama, Kendaraan sewaan) {
        this.nama = nama;
        this.kendaraanSewaan = sewaan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSewaan(Kendaraan sewaan) {
        this.kendaraanSewaan = sewaan;
    }

    public String getNama() {
        return this.nama;
    }

    public Kendaraan getSewaan() {
        return this.kendaraanSewaan;
    }

    public void printInfo() {
        System.out.println("Nama Penyewa: " + this.nama);
        if (kendaraanSewaan != null) {
            System.out.print("Kendaraan Sewaan: ");
            kendaraanSewaan.printInfo();
        } else {
            System.out.println("Tidak ada kendaraan yang disewa.");
        }
    }
}

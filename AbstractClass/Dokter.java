public class Dokter extends Manusia {
    public Dokter(String nama) {
        super(nama);
    }

    public void tumbuh() {
        System.out.println(getName() + " Sedang melakukan uji praktik");
    }

    public void bicara() {
        System.out.println(getName() + " Berkonsultasi dengan pasien");
    }
}

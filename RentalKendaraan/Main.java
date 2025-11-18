import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Kendaraan> daftarKendaraan = new ArrayList<>();
        ArrayList<Penyewa> daftarPenyewa = new ArrayList<>();

        daftarKendaraan.add(new Mobil("Toyota", "Avanza", 2020, true, 4));
        daftarKendaraan.add(new Motor("Honda", "CBR 150R", 2019, true, 2));
        daftarKendaraan.add(new Sepeda("Polygon", "Heist 5", 2021, true, "Gunung"));
        daftarKendaraan.add(new Sepeda("United", "Miami", 2018, false, "BMX"));

        daftarPenyewa.add(new Penyewa("Bambang", daftarKendaraan.get(0)));
        daftarPenyewa.add(new Penyewa("Junaidi", daftarKendaraan.get(1)));
        daftarPenyewa.add(new Penyewa("Sudarsono", daftarKendaraan.get(3)));

        daftarKendaraan.get(0).setTersedia(false);
        daftarKendaraan.get(1).setTersedia(false);

        System.out.println("=== Daftar Kendaraan ===");
        for (Kendaraan k : daftarKendaraan) {
            k.printInfo();
            System.out.println("---------------------------");
        }

        System.out.println("=== Daftar Penyewa ===");
        for (Penyewa p : daftarPenyewa) {
            p.printInfo();
            System.out.println("---------------------------");
        }
    }
}

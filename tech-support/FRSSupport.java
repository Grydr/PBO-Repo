import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class FRSSupport {
    private Map<String, String> responses;
    private ArrayList<String> generics;
    private Random random;

    public static void main(String[] args) {
        FRSSupport system = new FRSSupport();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nDeskripsikan masalahmu: ");
            String sent = scanner.nextLine();
            if (sent.toLowerCase().equals("exit"))
                break;
            System.out.println("\nUser: " + sent);
            System.out.println("FRS: " + system.getResponse(sent));
        }

        scanner.close();
    }

    public FRSSupport() {
        responses = new HashMap<>();
        generics = new ArrayList<>();
        random = new Random();

        fillResponses();
        fillGenerics();
    }

    public String getResponse(String userInput) {
        String[] words = userInput.toLowerCase().split("\\s+");
        for (String word : words) {
            if (responses.containsKey(word)) {
                return responses.get(word);
            }
        }

        return generics.get(random.nextInt(generics.size()));
    }

    private void fillResponses() {
        responses.put("error", "Silakan pastikan koneksi internet stabil dan coba kembali.");
        responses.put("tolong", "Baik, bisa jelaskan masalah Anda lebih detail?");
        responses.put("bantu", "Saya siap membantu. Apa yang ingin Anda lakukan di FRS?");
        responses.put("kelas", "Apakah kelas yang Anda maksud penuh atau tidak muncul di sistem?");
        responses.put("penuh", "Jika kelas penuh, coba hubungi dosen pengampu atau cari kelas lain.");
        responses.put("sks", "Pastikan total SKS Anda tidak melebihi batas maksimal semester ini.");
        responses.put("login", "Jika tidak bisa login, coba reset password melalui portal mahasiswa.");
        responses.put("matkul", "Apakah Anda ingin menambah atau menghapus mata kuliah?");
        responses.put("hapus", "Penghapusan mata kuliah hanya bisa dilakukan selama masa revisi KRS.");
        responses.put("jadwal", "Jadwal kuliah bisa dicek di menu 'Jadwal' pada portal akademik.");
        responses.put("dosen", "Silakan hubungi dosen pengampu untuk konfirmasi kelas atau bimbingan.");
    }

    private void fillGenerics() {
        generics.add("Coba jelaskan lebih rinci.");
        generics.add("Saya belum mengerti, bisa ulangi?");
        generics.add("Bisakah Anda memberi detail lebih lanjut?");
    }
}

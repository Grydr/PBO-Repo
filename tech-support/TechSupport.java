import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TechSupport {
    public TechSupport() {
        responses = new HashMap<>();
        random = new Random();

        responses.put("error", "Apakah Anda menerima pesan kesalahan? Coba restart sistem.");
        responses.put("help", "Apa yang bisa saya bantu?");
        responses.put("crash", "Kapan crash terjadi? Apakah ada pesan spesifik?");
        responses.put("slow", "Sudahkah Anda memeriksa penggunaan CPU dan RAM?");
    }

    public String getResponse(String userInput) {
        // find any string that matches at least 1 space
        String[] words = userInput.toLowerCase().split("\\s+");
        for (var word : words) {
            if (responses.containsKey(word)) {
                return responses.get(word);
            }
        }
        String[] generic = {
                "Coba jelaskan lebih rinci.",
                "Saya belum mengerti, bisa ulangi?",
                "Bisakah Anda memberi detail lebih lanjut?"
        };
        return generic[random.nextInt(generic.length)];
    }

    public static void main(String[] args) {
        TechSupport system = new TechSupport();
        System.out.println(system.getResponse("My computer is slow after update"));
        System.out.println(system.getResponse("I need help"));
        System.out.println(system.getResponse("It gives an unknown error"));
    }

    private Map<String, String> responses;
    private Random random;
}

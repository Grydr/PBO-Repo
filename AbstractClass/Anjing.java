public class Anjing extends Binatang {
    public Anjing(String nama) {
        super(nama);
    }

    public void tumbuh() {
        System.out.println(getName() + " Tumbuh dengan makan dan bermain");
    }

    public void bergerak() {
        System.out.println(getName() + " Berlari-lari di taman");
    }
}

public class Programmer extends Manusia {
    public Programmer(String nama) {
        super(nama);
    }

    public void tumbuh() {
        System.out.println(getName() + " Sedang belajar konsep OOP");
    }

    public void bicara() {
        System.out.println(getName() + " Menjelaskan konsep OOP");
    }
}

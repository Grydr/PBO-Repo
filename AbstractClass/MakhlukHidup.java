public abstract class MakhlukHidup {
    private String nama;

    public MakhlukHidup(String nama) {
        this.nama = nama;
    }

    public String getName() {
        return nama;
    }

    public void bernafas() {
        System.out.println(nama + " Sedang Bernafas");
    }

    public abstract void tumbuh();
}

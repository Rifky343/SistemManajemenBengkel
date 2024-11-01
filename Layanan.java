public class Layanan {
    private String jenisLayanan;
    private double biaya;

    public Layanan(String jenisLayanan, double biaya) {
        this.jenisLayanan = jenisLayanan;
        this.biaya = biaya;
    }

    public String getJenisLayanan() {
        return jenisLayanan;
    }

    public double getBiaya() {
        return biaya;
    }

    public void infoLayanan() {
        System.out.println("Layanan: " + jenisLayanan + ", Biaya: " + biaya);
    }
}

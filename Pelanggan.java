public class Pelanggan {
    private String nama;
    private String noTelp;

    public Pelanggan(String nama, String noTelp) {
        this.nama = nama;
        this.noTelp = noTelp;
    }

    public String getNama() {
        return nama;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void infoPelanggan() {
        System.out.println("Nama Pelanggan: " + nama + ", No Telp: " + noTelp);
    }
}

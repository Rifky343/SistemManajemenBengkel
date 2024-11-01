public class Bengkel {
    private String namaBengkel;
    private String alamat;

    public Bengkel(String namaBengkel, String alamat) {
        this.namaBengkel = namaBengkel;
        this.alamat = alamat;
    }

    public String getNamaBengkel() {
        return namaBengkel;
    }

    public String getAlamat() {
        return alamat;
    }

    public void infoBengkel() {
        System.out.println("Bengkel: " + namaBengkel + ", Alamat: " + alamat);
    }
}

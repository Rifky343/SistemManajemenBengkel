public abstract class Kendaraan {
    protected String nomorPlat;
    protected String jenisKendaraan;

    public Kendaraan(String nomorPlat, String jenisKendaraan) {
        this.nomorPlat = nomorPlat;
        this.jenisKendaraan = jenisKendaraan;
    }

    public String getNomorPlat() {
        return nomorPlat;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public abstract void infoKendaraan();
}

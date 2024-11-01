public class RiwayatServis {
    private Kendaraan kendaraan;
    private Layanan layanan;
    private String tanggalServis;

    public RiwayatServis(Kendaraan kendaraan, Layanan layanan, String tanggalServis) {
        this.kendaraan = kendaraan;
        this.layanan = layanan;
        this.tanggalServis = tanggalServis;
    }

    public void tampilkanRiwayat() {
        kendaraan.infoKendaraan();
        layanan.infoLayanan();
        System.out.println("Tanggal Servis: " + tanggalServis);
    }
}

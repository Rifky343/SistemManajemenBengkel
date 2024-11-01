public class Mobil extends Kendaraan {
    private int kapasitasMesin;

    public Mobil(String nomorPlat, int kapasitasMesin) {
        super(nomorPlat, "Mobil");
        this.kapasitasMesin = kapasitasMesin;
    }

    @Override
    public void infoKendaraan() {
        System.out.println("Kendaraan: Mobil, Plat: " + nomorPlat + ", Kapasitas Mesin: " + kapasitasMesin + "cc");
    }
}

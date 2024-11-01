public class Motor extends Kendaraan {
    private String tipeMotor;

    public Motor(String nomorPlat, String tipeMotor) {
        super(nomorPlat, "Motor");
        this.tipeMotor = tipeMotor;
    }

    @Override
    public void infoKendaraan() {
        System.out.println("Kendaraan: Motor, Plat: " + nomorPlat + ", Tipe: " + tipeMotor);
    }
}

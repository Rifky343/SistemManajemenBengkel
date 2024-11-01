import java.util.ArrayList;
import java.util.Scanner;

public class SistemManajemenBengkel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data bengkel
        System.out.print("Masukkan nama bengkel: ");
        String namaBengkel = scanner.nextLine();
        System.out.print("Masukkan alamat bengkel: ");
        String alamatBengkel = scanner.nextLine();
        Bengkel bengkel = new Bengkel(namaBengkel, alamatBengkel);

        // Input data pelanggan
        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = scanner.nextLine();
        System.out.print("Masukkan nomor telepon pelanggan: ");
        String noTelpPelanggan = scanner.nextLine();
        Pelanggan pelanggan = new Pelanggan(namaPelanggan, noTelpPelanggan);

        // Input data kendaraan
        ArrayList<Kendaraan> kendaraanList = new ArrayList<>();
        System.out.print("Masukkan jumlah kendaraan yang akan diinput: ");
        int jumlahKendaraan = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < jumlahKendaraan; i++) {
            System.out.println("Masukkan jenis kendaraan (mobil/motor): ");
            String jenisKendaraan = scanner.nextLine();

            System.out.print("Masukkan nomor plat: ");
            String nomorPlat = scanner.nextLine();

            if (jenisKendaraan.equalsIgnoreCase("mobil")) {
                System.out.print("Masukkan kapasitas mesin (cc): ");
                int kapasitasMesin = scanner.nextInt();
                scanner.nextLine();
                kendaraanList.add(new Mobil(nomorPlat, kapasitasMesin));
            } else if (jenisKendaraan.equalsIgnoreCase("motor")) {
                System.out.print("Masukkan tipe motor: ");
                String tipeMotor = scanner.nextLine();
                kendaraanList.add(new Motor(nomorPlat, tipeMotor));
            }
        }

        // Input data layanan
        ArrayList<Layanan> layananList = new ArrayList<>();
        System.out.print("Masukkan jumlah layanan yang tersedia: ");
        int jumlahLayanan = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < jumlahLayanan; i++) {
            System.out.print("Masukkan jenis layanan: ");
            String jenisLayanan = scanner.nextLine();
            System.out.print("Masukkan biaya layanan: ");
            double biayaLayanan = scanner.nextDouble();
            scanner.nextLine();
            layananList.add(new Layanan(jenisLayanan, biayaLayanan));
        }

        // Input riwayat servis
        ArrayList<RiwayatServis> riwayatList = new ArrayList<>();
        System.out.print("Masukkan jumlah riwayat servis yang ingin dicatat: ");
        int jumlahRiwayat = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < jumlahRiwayat; i++) {
            System.out.println("Masukkan nomor kendaraan untuk servis (0 hingga " + (kendaraanList.size() - 1) + "): ");
            int idxKendaraan = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Masukkan nomor layanan (0 hingga " + (layananList.size() - 1) + "): ");
            int idxLayanan = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Masukkan tanggal servis (dd-mm-yyyy): ");
            String tanggalServis = scanner.nextLine();

            riwayatList.add(new RiwayatServis(kendaraanList.get(idxKendaraan), layananList.get(idxLayanan), tanggalServis));
        }

        // Menampilkan data
        System.out.println("\n=== Informasi Bengkel ===");
        bengkel.infoBengkel();
        
        System.out.println("\n=== Informasi Pelanggan ===");
        pelanggan.infoPelanggan();

        System.out.println("\n=== Riwayat Servis ===");
        for (RiwayatServis riwayat : riwayatList) {
            riwayat.tampilkanRiwayat();
            System.out.println();
        }

        scanner.close();
    }
}

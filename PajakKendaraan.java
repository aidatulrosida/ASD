import java.util.Scanner;

public class PajakKendaraan {
    static final int MAX_KENDARAAN = 100;
    static final int MAX_TRANSAKSI = 1000;
    static Kendaraan[] daftarKendaraan = new Kendaraan[MAX_KENDARAAN];
    static TransaksiPajak[] daftarTransaksi = new TransaksiPajak[MAX_TRANSAKSI];
    static int jumlahKendaraan = 0;
    static int jumlahTransaksi = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        inisialisasiDataKendaraan();

        do {
            tampilkanMenu();
            System.out.print("Pilih(1-5): ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    daftarKendaraan();
                    break;
                case 2:
                    masukkanDataPembayaran();
                    break;
                case 3:
                    tampilkanTransaksi();
                    break;
                case 4:
                    urutkanTransaksi();
                    tampilkanTransaksi();
                    break;
                case 5:
                    System.out.println("Keluar");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);

        scanner.close(); 
    }

    static void inisialisasiDataKendaraan() {
        daftarKendaraan[jumlahKendaraan++] = new Kendaraan("S 4567 YV", "Basko", "Mobil", 2000, 2012, 4);
        daftarKendaraan[jumlahKendaraan++] = new Kendaraan("N 4511 VS", "Arta", "Mobil", 2500, 2015, 3);
        daftarKendaraan[jumlahKendaraan++] = new Kendaraan("AB 4321 A", "Wisnu", "Motor", 125, 2010, 2);
        daftarKendaraan[jumlahKendaraan++] = new Kendaraan("B 1234 AG", "Sisa", "Motor", 150, 2020, 1);
    }

    static void tampilkanMenu() {
        System.out.println("=================================================");
        System.out.println("         SISTEM PENGELOLAAN PAJAK KENDARAAN       ");
        System.out.println("=================================================");
        System.out.println("----------------------Menu-----------------------");
        System.out.println("=================================================");
        System.out.println("|     Pilihan    |          Deskripsi           |");
        System.out.println("=================================================");
        System.out.println("| 1              | Daftar Kendaraan             |");
        System.out.println("| 2              | Bayar Pajak                  |");
        System.out.println("| 3              | Tampilkan seluruh transaksi  |");
        System.out.println("| 4              | Urutkan Transaksi            |");
        System.out.println("| 5              | Keluar                       |");
        System.out.println("=================================================");
        System.out.println("-------------------------------------------------");
    }

    static void daftarKendaraan() {
        System.out.println("==================================================================================================");
        System.out.println("             DAFTAR KENDARAAN                    ");
        System.out.println("==================================================================================================");
        System.out.printf("%-15s | %-15s | %-10s | %-15s | %-10s | %-15s%n", "Nomor TNKB", "Nama Pemilik", "Jenis", "CC kendaraan", "Tahun", "Bulan harus Bayar");
        System.out.println("==================================================================================================");
        for (int i = 0; i < jumlahKendaraan; i++) {
            Kendaraan k = daftarKendaraan[i];
            System.out.printf("%-15s | %-15s | %-10s | %-15d | %-10d | %-15d%n", k.noTNKB, k.nama, k.jenis, k.cc, k.tahun, k.bulanHarusBayar);
        }
        System.out.println("==================================================================================================");
    }    

    static void masukkanDataPembayaran() {
        System.out.println("=================================================");
        System.out.println("              MASUKKAN DATA PEMBAYARAN           ");
        System.out.println("=================================================");
        System.out.print("Masukkan Nomer TNKB : ");
        String tnkb = scanner.nextLine();
        System.out.print("Bulan Bayar         : ");
        int bulanBayar = scanner.nextInt();
        scanner.nextLine(); 

        Kendaraan kendaraan = cariKendaraan(tnkb);
        if (kendaraan == null) {
            System.out.println("Kendaraan tidak ditemukan!");
            return;
        }

        int kode = jumlahTransaksi + 1;
        int denda = hitungDenda(kendaraan, bulanBayar);
        int nominalBayar = hitungNominal(kendaraan);
        daftarTransaksi[jumlahTransaksi++] = new TransaksiPajak(kode, nominalBayar, denda, bulanBayar, kendaraan);

        System.out.println("Transaksi berhasil ditambahkan.");
    }

    static Kendaraan cariKendaraan(String tnkb) {
        for (int i = 0; i < jumlahKendaraan; i++) {
            if (daftarKendaraan[i].noTNKB.equals(tnkb)) {
                return daftarKendaraan[i];
            }
        }
        return null;
    }

    static int hitungDenda(Kendaraan kendaraan, int bulanBayar) {
        int keterlambatan = bulanBayar - kendaraan.bulanHarusBayar;
        if (keterlambatan <= 0) {
            return 0;
        } else if (keterlambatan == 1) {
            return 50000; 
        } else {
            return 200000; 
        }
    }        

    static int hitungNominal(Kendaraan kendaraan) {
        if (kendaraan.jenis.equalsIgnoreCase("Mobil")) {
            if (kendaraan.cc < 1000) {
                return 750000; 
            } else if (kendaraan.cc >= 1000 && kendaraan.cc <= 2500) {
                return 1000000; 
            } else {
                return 1500000; 
            }
        } else if (kendaraan.jenis.equalsIgnoreCase("Motor")) { 
            if (kendaraan.cc <= 100) {
                return 150000;
            } else if (kendaraan.cc <= 250) {
                return 250000; 
            } else if (kendaraan.cc <= 500) {
                return 350000; 
            } else {
                return 500000; 
            }
        } else {
            return 0; 
        }
    }            

    static void tampilkanTransaksi() {
        System.out.println("===============================================================");
        System.out.println("         DAFTAR TRANSAKSI PEMBAYARAN PAJAK       ");
        System.out.println("===============================================================");
        System.out.printf("%-5s | %-15s | %-15s | %-10s | %-10s%n", "Kode", "TNKB", "Nama", "Nominal", "Denda");
        System.out.println("===============================================================");
        for (int i = 0; i < jumlahTransaksi; i++) {
            TransaksiPajak transaksi = daftarTransaksi[i];
            int nominal = hitungNominal(transaksi.kendaraan);
            int denda = transaksi.denda;

            System.out.printf("%-5d | %-15s | %-15s | %-10d | %-10d%n", transaksi.kode, transaksi.kendaraan.noTNKB,
                    transaksi.kendaraan.nama, nominal, denda);
        }
        System.out.println("===============================================================");
    }

    static void urutkanTransaksi() {
        for (int i = 0; i < jumlahTransaksi - 1; i++) {
            for (int j = 0; j < jumlahTransaksi - i - 1; j++) {
                if (daftarTransaksi[j].kendaraan.noTNKB.compareTo(daftarTransaksi[j + 1].kendaraan.noTNKB) > 0) {
                    TransaksiPajak temp = daftarTransaksi[j];
                    daftarTransaksi[j] = daftarTransaksi[j + 1];
                    daftarTransaksi[j + 1] = temp;
                }
            }
        }
    }
}

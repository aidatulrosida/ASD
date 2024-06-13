class Kendaraan {
    String noTNKB;
    String nama;
    String jenis; // Motor atau Mobil
    int cc; // Untuk Motor (ce) atau Mobil (cc)
    int tahun;
    int bulanHarusBayar;

    public Kendaraan(String noTNKB, String nama, String jenis, int cc, int tahun, int bulanHarusBayar) {
        this.noTNKB = noTNKB;
        this.nama = nama;
        this.jenis = jenis;
        this.cc = cc;
        this.tahun = tahun;
        this.bulanHarusBayar = bulanHarusBayar;
    }
}
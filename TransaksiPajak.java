class TransaksiPajak {
    int kode;
    int nominalBayar;
    int denda;
    int bulanBayar;
    Kendaraan kendaraan;

    public TransaksiPajak(int kode, int nominalBayar, int denda, int bulanBayar, Kendaraan kendaraan) {
        this.kode = kode;
        this.nominalBayar = nominalBayar;
        this.denda = denda;
        this.bulanBayar = bulanBayar;
        this.kendaraan = kendaraan;
    }
}
public class Kost {
    private String nama;
    private String alamat;
    private String noTelp;
    private double hargaBulanan;
    private boolean tersedia;

    public Kost() {
        System.out.println("Membuat Object baru");
    }

    public Kost(String nama, String alamat, String noTelp, double hargaBulanan, boolean tersedia) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.hargaBulanan = hargaBulanan;
        this.tersedia = tersedia;
    }

    // Getters and setters
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public double getHarga() {
        return hargaBulanan;
    }

    public void setHarga(double harga) {
        this.hargaBulanan = harga;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    // Method menampilkan informasi
    
    public void printInformasi() {
        System.out.println("Nama Penyewa: " + nama);
        System.out.println("No Telpon: " + noTelp);
        System.out.println("Alamat: " + alamat);
        System.out.println("Harga per Bulan: " + hargaBulanan);
        System.out.println("Kamar tersedia: " + (tersedia ? "Ya" : "Tidak"));
    }
}

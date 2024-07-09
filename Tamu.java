public class Tamu extends Pengguna {
    private int sisaMasaAktif;

    // Konstruktor
    public Tamu() {
        super(); // Memanggil konstruktor kelas induk (Pengguna)
    }

    // Konstruktor tambahan untuk menginisialisasi sisaMasaAktif
    public Tamu(int sisaMasaAktif) {
        super(); // Memanggil konstruktor kelas induk (Pengguna)
        this.sisaMasaAktif = sisaMasaAktif;
    }

    // Getter dan Setter untuk sisaMasaAktif
    public int getSisaMasaAktif() {
        return sisaMasaAktif;
    }

    public void setSisaMasaAktif(int sisaMasaAktif) {
        this.sisaMasaAktif = sisaMasaAktif;
    }

    // Metode khusus untuk Tamu
    public void menambahMasaAktif(int tambahan) {
        this.sisaMasaAktif += tambahan;
    }

    // Overriding metode hapus dan login
    @Override
    public void hapus() {
        System.out.println("HAPUS DARI pengguna WHERE status='Tamu'");
    }

    @Override
    public void login() {
        System.out.println("Login sebagai tamu");
    }
}

public class Main {
    public static void main(String[] args) {
        // Pengguna
        Pengguna pengguna = new Pengguna();
        pengguna.setId(3);
        System.out.println("ID Pengguna: " + pengguna.getId());
        pengguna.login();
        pengguna.daftar();
        pengguna.setPassword("Admin#1234");
        System.out.println("Password Pengguna: " + pengguna.getPassword());

        System.out.println();

        // Tamu
        Tamu tamu = new Tamu();
        tamu.menambahMasaAktif(3);
        tamu.login();
        tamu.hapus();

        System.out.println();

        // Buku
        Buku buku = new Buku();
        buku.setJudul("Buku 1");
        buku.setPenulis("Penulis 1");
        buku.setJmlh_hlman(10);
        buku.nulis("Perkenalkan Saya Rian seorang penulis");
        buku.naikkanHarga();
        System.out.println("Harga Buku : " + buku.getHarga());
        buku.naikkanHarga(52400);
        System.out.println("Harga Buku : " + buku.getHarga());

        System.out.println();

        Kost kost = new Kost();
        kost.setNama("Rian");
        kost.setAlamat("Jl. Kemuning");
        kost.setHarga(300000);
        kost.setNoTelp("08123456789");
        kost.setTersedia(true);
        kost.getInformasi();

        System.out.println();

        // Jika kamar tidak tersedia
        kost.setNama("Ryan");
        kost.setAlamat("Jl. Merpati");
        kost.setHarga(350000);
        kost.setNoTelp("08987654321");
        kost.setTersedia(false);
        kost.getInformasi();
        
        System.out.println();

        // Constructor dengan parameter
        Kost kost2 = new Kost("Alex", "Jl. Batu Piring", "08214365879", 340000);
        kost2.setTersedia(true);
        kost2.getInformasi();
    }
}
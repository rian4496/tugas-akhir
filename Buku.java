public class Buku {
    private int id;
    private String judul;
    private String penulis;
    private int jmlh_hlman;
    private int harga;

    public Buku() {
        System.out.println("Object buku telah dibuat, constructor buku berjalan");
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public int getJmlh_hlman() {
        return jmlh_hlman;
    }

    public void setJmlh_hlman(int jmlh_hlman) {
        this.jmlh_hlman = jmlh_hlman;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    // penambahan Methods
    public void baca() {
        System.out.println("Sedang membaca buku: " + judul);
    }

    public void nulis(String text) {
        System.out.println("Sedang menulis ke dalam buku dengan kalimat: " + text);
    }

    public void feedback(String masukan) {
        System.out.println("Memberi masukan: " + masukan);
    }

    // Method for increasing price
    public void naikkanHarga() {
        harga += 1500;
    }

    public void naikkanHarga(int hargaTambahan) {
        harga += hargaTambahan;
    }
}

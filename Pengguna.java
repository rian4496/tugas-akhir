public class Pengguna {
    private int id;
    private String username;
    private String password;

    // Constructors
    public Pengguna() {
        // Default constructor
    }

    public Pengguna(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Additional Methods
    public void login() {
        System.out.println("Ini method untuk login");
    }

    public void lupaPassword() {
        System.out.println("Ini method lupa password");
    }

    public void daftar() {
        System.out.println("Ini method daftar user baru");
    }

    // Method overloading for `hapus` and `login` methods
    public void hapus() {
        System.out.println("DELETE FROM pengguna");
    }

    public void hapus(String username) {
        System.out.println("DELETE FROM pengguna WHERE username = " + username);
    }

    public void login(String tokenGoogle) {
        System.out.println("Ini login menggunakan Google dengan token: " + tokenGoogle);
    }
}

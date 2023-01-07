package Entity;

public class Buku_Entity {
    private int id_buku;
    private String Judul;
    private int Halaman;
    private String TanggalTerbit;
    private String Penulis;
    private String Penerbit;

    public Buku_Entity(int id_buku,String judul, int halaman, String tanggalTerbit, String penulis, String penerbit) {
        Judul = judul;
        Halaman = halaman;
        TanggalTerbit = tanggalTerbit;
        Penulis = penulis;
        Penerbit = penerbit;
        id_buku = id_buku;
    }

    public Buku_Entity(){

    }


    public int getId_buku(){
        return id_buku;
    }

    public String getJudul() {
        return Judul;
    }

    public void setJudul(String judul) {
        Judul = judul;
    }

    public int getHalaman() {
        return Halaman;
    }

    public void setHalaman(int halaman) {
        Halaman = halaman;
    }

    public String getTanggalTerbit() {
        return TanggalTerbit;
    }

    public void setTanggalTerbit(String tanggalTerbit) {
        TanggalTerbit = tanggalTerbit;
    }

    public String getPenulis() {
        return Penulis;
    }

    public void setPenulis(String penulis) {
        Penulis = penulis;
    }

    public String getPenerbit() {
        return Penerbit;
    }

    public void setPenerbit(String penerbit) {
        Penerbit = penerbit;
    }

    public void setId_buku(int Id_buku){
        id_buku = Id_buku;
    }
}

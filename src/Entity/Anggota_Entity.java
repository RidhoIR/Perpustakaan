package Entity;

public class Anggota_Entity extends User_Entity {
    private String no_telp;


    public Anggota_Entity(int id, String nama, String alamat, String notelp) {
        super(id, nama, alamat);
        no_telp = notelp;
    }

    public Anggota_Entity(){

    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String getAlamat() {
        return alamat;
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}

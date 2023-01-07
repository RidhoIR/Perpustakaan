package Entity;

import java.util.Date;

public class Peminjaman_Entity {

    private String status;
    private Anggota_Entity anggota;
    private Buku_Entity buku;
    private int noPinjam,jumlah;
    private Date tglPinjam,tglKembali;

    public Peminjaman_Entity(String status, Anggota_Entity anggota,
                             Buku_Entity buku, int noPinjam, int jumlah, Date tglPinjam, Date tglKembali) {
        this.status = status;
        this.anggota = anggota;
        this.buku = buku;
        this.noPinjam = noPinjam;
        this.jumlah = jumlah;
        this.tglPinjam = tglPinjam;
        this.tglKembali = tglKembali;
    }

    public Peminjaman_Entity(){

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Anggota_Entity getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota_Entity anggota) {
        this.anggota = anggota;
    }

    public Buku_Entity getBuku() {
        return buku;
    }

    public void setBuku(Buku_Entity buku) {
        this.buku = buku;
    }

    public int getNoPinjam() {
        return noPinjam;
    }

    public void setNoPinjam(int noPinjam) {
        this.noPinjam = noPinjam;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public Date getTglPinjam() {
        return tglPinjam;
    }

    public void setTglPinjam(Date tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    public Date getTglKembali() {
        return tglKembali;
    }

    public void setTglKembali(Date tglKembali) {
        this.tglKembali = tglKembali;
    }
}

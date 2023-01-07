package Controller;

import Entity.Anggota_Entity;
import Entity.Buku_Entity;
import Entity.Peminjaman_Entity;
import Model.Peminjaman_Model;

import java.util.Date;

public class Peminjaman_Controller {

    Peminjaman_Model peminjaman_m = new Peminjaman_Model();

    public Peminjaman_Controller(){

    }

    public void insert(String status, Anggota_Entity anggota, Buku_Entity buku, int noPinjam,
                       int jumlah, Date tglPinjam, Date tglKembali){
        Peminjaman_Entity peminjaman = new Peminjaman_Entity();
        peminjaman.setStatus(status);
        peminjaman.setAnggota(anggota);
        peminjaman.setBuku(buku);
        peminjaman.setNoPinjam(noPinjam);
        peminjaman.setJumlah(jumlah);
        peminjaman.setTglPinjam(tglPinjam);
        peminjaman.setTglKembali(tglKembali);
        peminjaman_m.insertPeminjaman(peminjaman);
    }

    public int cekPeminjaman(String idpeminjam){
        int keterangan = -1;
        if(peminjaman_m.getDataPeminjaman().size()>0){
            for(int i=0;i<peminjaman_m.getDataPeminjaman().size();i++){
                if(idpeminjam.equals(peminjaman_m.getDataPeminjaman().get(i).getNoPinjam())){
                    keterangan = i;
                    break;
                }else{
                    keterangan = -1;
                }
            }
        }
        return keterangan;
    }

    public Peminjaman_Entity showDaftarpeminjam(int index){
        return peminjaman_m.getDataPeminjaman().get(index);
    }

}

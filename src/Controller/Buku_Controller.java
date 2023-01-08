package Controller;

import Entity.Buku_Entity;
import Model.Buku_Model;

import java.util.ArrayList;

public class Buku_Controller {


    public Buku_Controller(){

    }

    public Buku_Model buku_model = new Buku_Model();

    public ArrayList<Buku_Entity>view(){
        return buku_model.getDataBuku();
    }

    public void insert (int Id_buku, String judul, int halaman, String tanggalterbit, String penulis, String penerbit){
        Buku_Entity buku = new Buku_Entity();
        buku.setId_buku(Id_buku);
        buku.setJudul(judul);
        buku.setHalaman(halaman);
        buku.setTanggalTerbit(tanggalterbit);
        buku.setPenulis(penulis);
        buku.setPenerbit(penerbit);
        buku_model.insert(buku);
    }

    public void update (int index, int Id_buku, String judul, int halaman, String tanggalterbit, String penulis, String penerbit){
        Buku_Entity buku = new Buku_Entity();
        buku.setId_buku(Id_buku);
        buku.setJudul(judul);
        buku.setHalaman(halaman);
        buku.setTanggalTerbit(tanggalterbit);
        buku.setPenulis(penulis);
        buku.setPenerbit(penerbit);
        buku_model.update(index,buku);
    }

    public void delete(int index){
        buku_model.delete(index);
    }

    public int cekBuku(int Id_buku){
        int keterangan = -1;
        if(buku_model.getDataBuku().size()>0){
            for(int i=0;i<buku_model.getDataBuku().size();i++){
                if(Id_buku == buku_model.getDataBuku().get(i).getId_buku()){
                    keterangan = i;
                    break;
                }else{
                    keterangan = -1;
                }
            }
        }
        return keterangan;
    }

    public Buku_Entity showDaftarBuku(int index){
        return buku_model.getDataBuku().get(index);
    }

}

package Controller;

import Entity.Anggota_Entity;
import Model.Anggota_Model;

import java.util.ArrayList;

public class Anggota_Controller {

    public Anggota_Model anggota_m = new Anggota_Model();

    public Anggota_Controller(){

    }

    public ArrayList<Anggota_Entity> view(){
        return anggota_m.getDataAnggota();
    }

    public void insert(int id, String nama, String alamat, String notelp){
        Anggota_Entity anggota = new Anggota_Entity();
        anggota.setId(id);
        anggota.setNama(nama);
        anggota.setAlamat(alamat);
        anggota.setNo_telp(notelp);
        anggota_m.insert(anggota);
    }

    public void delete(int index){
        anggota_m.delete(index);
    }

    public int cekAnggota(int idAnggota){
        int keterangan = -1;
        if(anggota_m.getDataAnggota().size()>0){
            for(int i=0;i<anggota_m.getDataAnggota().size();i++){
                if(idAnggota == anggota_m.getDataAnggota().get(i).getId()){
                    keterangan = i;
                    break;
                }else{
                    keterangan = -1;
                }
            }
        }
        return keterangan;
    }
    public Anggota_Entity showDaftarAnggota(int index){
        return anggota_m.getDataAnggota().get(index);
    }



}

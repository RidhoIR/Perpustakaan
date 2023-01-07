package Controller;

import Entity.Petugas_Entity;
import Model.Petugas_Model;

import java.util.ArrayList;

public class Petugas_Controller {

    public Petugas_Model petugas_m = new Petugas_Model();
    int loginpetugas = 0;

    public Petugas_Controller(){

    }

    public ArrayList<Petugas_Entity> view(){
        return petugas_m.getDataPetugas();
    }

    public void insert (Petugas_Entity petugas){
        petugas_m.insert(petugas);
    }

    public void update(int index, Petugas_Entity petugas){
        petugas_m.update(index,petugas);
    }

    public void delete(int index){
        petugas_m.delete(index);
    }

    public void dataPetugas(){
        int id[] = {01,02,03,04};
        String nama [] = {"Ridho","Fariz","Akbar","Fondasa"};
        String alamat [] = {"Surabaya","Menganti","Sidoarjo","Krian"};
        String password [] = {"111","222","333","444"};

        for (int i= 0; i<nama.length; i++){
            petugas_m.insert(new Petugas_Entity(id[i],nama[i],alamat[i],
                    password[i]));
        }
    }

    public void cekPetugas (int id, String password){
        loginpetugas = petugas_m.cekPetugas(id,password);
    }

    public Petugas_Entity petugas_entity(){
        return petugas_m.showDataPetugas(loginpetugas);
    }



}

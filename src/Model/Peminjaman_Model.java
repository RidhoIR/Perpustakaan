package Model;

import Entity.Peminjaman_Entity;

import java.util.ArrayList;

public class Peminjaman_Model {

    private ArrayList<Peminjaman_Entity> DataPeminjaman;

    public Peminjaman_Model(){
        DataPeminjaman = new ArrayList<>();
    }

    public ArrayList<Peminjaman_Entity> getDataPeminjaman(){
        return DataPeminjaman;
    }

    public void insertPeminjaman(Object x){
        DataPeminjaman.add((Peminjaman_Entity) x);
    }

    public void updatePeminjaman(int index, Peminjaman_Entity peminjam){
        DataPeminjaman.set(index, peminjam);
    }


}

package Model;

import Entity.Anggota_Entity;

import java.util.ArrayList;

public class Anggota_Model implements Interface_Model {

    private ArrayList<Anggota_Entity> DataAnggota;

    public Anggota_Model(){
        DataAnggota = new ArrayList<>();
    }
    public ArrayList<Anggota_Entity> getDataAnggota(){
        return DataAnggota;
    }


    @Override
    public void insert(Object x) {

        DataAnggota.add((Anggota_Entity) x);
    }

    @Override
    public void update(int index, Object x) {
        DataAnggota.set(index,(Anggota_Entity) x);
    }

    @Override
    public void delete(int index) {
        DataAnggota.remove(index);
    }

    @Override
    public void view() {

    }
}

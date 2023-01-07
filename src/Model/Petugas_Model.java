package Model;

import Entity.Anggota_Entity;
import Entity.Petugas_Entity;

import java.util.ArrayList;

public class Petugas_Model implements Interface_Model{

    private ArrayList<Petugas_Entity> Data;

    public Petugas_Model(){
        Data = new ArrayList<>();
    }
    public ArrayList<Petugas_Entity> getDataPetugas(){
        return Data;
    }


    @Override
    public void insert(Object x) {
        Data.add((Petugas_Entity) x);
    }

    @Override
    public void update(int index, Object x) {
        Data.set(index,(Petugas_Entity) x);
    }

    @Override
    public void delete(int index) {
        Data.remove(index);
    }

    @Override
    public void view() {

    }

    public Petugas_Entity showDataPetugas(int index){
        return Data.get(index);
    }

    public int cekPetugas(int id, String password){
        int loop = 0;
        for(Petugas_Entity petugasEntity : getDataPetugas()){
            if(petugasEntity.getId() == id && petugasEntity.getPassword().equals(password)){
                break;
            }else{
                loop++;
            }
        }
        return loop;
    };

}

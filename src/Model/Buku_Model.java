package Model;

import Entity.Buku_Entity;

import java.util.ArrayList;

public class Buku_Model implements Interface_Model {


    ArrayList<Buku_Entity> list = new ArrayList<>();


    public ArrayList<Buku_Entity> getDataBuku(){
        return list;
    }

    @Override
    public void insert(Object x) {
        list.add((Buku_Entity) x);
    }

    @Override
    public void update(int index, Object x) {
        list.set(index,(Buku_Entity) x);
    }

    @Override
    public void delete(int index) {
        list.remove(index);
    }

    @Override
    public void view() {

    }
}

package View;

import Controller.AllObjectController;
import Controller.Anggota_Controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AnggotaPage {


    Scanner input = new Scanner(System.in);
//    public Anggota_Controller anggota = new Anggota_Controller();

    public void menuAnggota(){
        int pilihan;
        do{
            System.out.println("");
            System.out.println("===== MENU Anggota =====");
            System.out.println("1. Tambah Anggota");
            System.out.println("2. Lihat Anggota");
            System.out.println("3. Hapus Anggota");
            System.out.println("0. Keluar");
            System.out.println("Pilih : ");
            pilihan = input.nextInt();
            switch(pilihan){
                case 1 :
                    insertAnggota();
                    break;
                case 2 :
                    viewAnggota();
                    break;
                case 3 :
                    deleteAnggota();
                    break;

            }
        }while(pilihan!=0);
    }



    public void insertAnggota(){


        try {
            System.out.println("Masukkan No ID :  ");
            int no_id = input.nextInt();

            System.out.println("Masukkan Nama : ");
            String nama = input.next();

            System.out.println("Masukkan Alamat : ");
            String alamat = input.next();

            System.out.println("Masukkan Telepon : ");
            String no_telp = input.next();

            AllObjectController.anggota.insert(no_id, nama, alamat, no_telp);
            System.out.println("Data Anggota Berhasil Disimpan !!\n");
        }catch (InputMismatchException e){
            System.out.println("tipe data salah");
        }
    }

    public void viewAnggota(){
        if(AllObjectController.anggota.anggota_m.getDataAnggota().size()>0){
            int dian07111_noUrut = 0;
            for (int i = 0; i < AllObjectController.anggota.anggota_m.getDataAnggota().size(); i++) {
                dian07111_noUrut++;
                System.out.println("\n"
                        +"[Anggota " + dian07111_noUrut + "]" + "\n"
                        +"No ID      : "+AllObjectController.anggota.anggota_m.getDataAnggota().get(i).getId()+ "\n"
                        +"Nama       : "+AllObjectController.anggota.anggota_m.getDataAnggota().get(i).getNama()+ "\n"
                        +"Alamat     : "+AllObjectController.anggota.anggota_m.getDataAnggota().get(i).getAlamat()+ "\n"
                        +"No Telepon : "+AllObjectController.anggota.anggota_m.getDataAnggota().get(i).getNo_telp());
            }
        }else{
            System.out.println("Data Kosong!!");
        }
    }

    public void deleteAnggota(){
        if(AllObjectController.anggota.anggota_m.getDataAnggota().size()>0){
            for (int i = 0; i < AllObjectController.anggota.anggota_m.getDataAnggota().size(); i++) {
                System.out.println("["+i+"] "+AllObjectController.anggota.anggota_m.getDataAnggota().get(i).getNama());
            }

            System.out.println("Pilih Index Nama : ");
            int selectIndex = input.nextInt();

            AllObjectController.anggota.anggota_m.getDataAnggota().remove(selectIndex);
            System.out.print("Data Anggota Berhasil Dihapus !!\n");
        }else{
            System.out.println("Data Anggota Kosong\n");
        }
    }



}

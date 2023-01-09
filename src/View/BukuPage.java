
package View;

import Controller.AllObjectController;
import Controller.Buku_Controller;

import java.util.Scanner;

public class BukuPage {

    Scanner input = new Scanner(System.in);
//    public Buku_Controller buku = new Buku_Controller();

    public BukuPage(){

    }

    public void menuUtama(){
        int pilih;
        do{
            System.out.println("\n"
                    +" == Menu Utama == "+"\n"
                    +"1. VIEW BUKU"+"\n"
                    +"2. INSERT BUKU"+"\n"
                    +"3. UPDATE BUKU"+"\n"
                    +"4. DELETE BUKU"+"\n"
                    +"0.Exit"+"\n"
                    +"Pilih : ");
            pilih = input.nextInt();

            switch(pilih){
                case 1:
                    view();
                    break;
                case 2:
                    insert();
                    break;
                case 3:
                    Update();
                    break;
                case 4:
                    Delete();
                    break;
                default:
                    System.out.println("pilihan tidak ada!!");

            }
        }while(pilih != 0);
    }


    public void insert(){
        System.out.print("Id Buku : ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan Judul                : ");
        String judul = input.nextLine();
        System.out.print("Masukkan Halaman              : ");
        int halaman = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan tanggal (DD/MM/YYYY) : ");
        String tanggal = input.nextLine();
        System.out.print("Masukkan penulis              : ");
        String penulis = input.nextLine();
        System.out.print("Masukkan penerbit             : ");
        String penerbit = input.nextLine();
        AllObjectController.buku.insert(id,judul,halaman,tanggal,penulis,penerbit);
    }
    public void Update(){
        System.out.print("index barang ke - : ");
        int index = input.nextInt();
        System.out.print("Id Buku : ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan Judul                : ");
        String judul = input.nextLine();
        System.out.print("Masukkan Halaman              : ");
        int halaman = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan tanggal (DD/MM/YYYY) : ");
        String tanggal = input.nextLine();
        System.out.print("Masukkan penulis              : ");
        String penulis = input.nextLine();
        System.out.print("Masukkan penerbit             : ");
        String penerbit = input.nextLine();
        AllObjectController.buku.update(index,id,judul,halaman,tanggal,penulis,penerbit);
    }

    public void Delete() {
        if(AllObjectController.buku.buku_model.getDataBuku().size()>0){
            for (int i = 0; i < AllObjectController.buku.buku_model.getDataBuku().size(); i++) {
                System.out.println("["+i+"] "+AllObjectController.buku.buku_model.getDataBuku().get(i).getJudul());
            }

            System.out.println("Pilih Index Buku : ");
            int selectIndex = input.nextInt();

            AllObjectController.buku.buku_model.getDataBuku().remove(selectIndex);
            System.out.print("Data Buku Berhasil Dihapus !!\n");
        }else{
            System.out.println("Data Buku Kosong\n");
        }
    }

    public static void view(){
        for(int i = 0; i<AllObjectController.buku.buku_model.getDataBuku().size(); i++){
            System.out.println("========================");
            System.out.println("Id Buku        : "+AllObjectController.buku.buku_model.getDataBuku().get(i).getId_buku());
            System.out.println("Judul          : "+AllObjectController.buku.buku_model.getDataBuku().get(i).getJudul());
            System.out.println("Halaman        : "+AllObjectController.buku.buku_model.getDataBuku().get(i).getHalaman());
            System.out.println("Tanggal Terbit : "+AllObjectController.buku.buku_model.getDataBuku().get(i).getTanggalTerbit());
            System.out.println("Penulis        : "+AllObjectController.buku.buku_model.getDataBuku().get(i).getPenulis());
            System.out.println("Penerbit       : "+AllObjectController.buku.buku_model.getDataBuku().get(i).getPenerbit());

        }
        System.out.println("========================");
    }
}

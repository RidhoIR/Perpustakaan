package View;

import Controller.Anggota_Controller;
import Controller.Buku_Controller;

import java.util.Scanner;

public class PeminjamanPage {


    Scanner input = new Scanner(System.in);
    Anggota_Controller anggota = new Anggota_Controller();
    Buku_Controller buku = new Buku_Controller();

    public void dataPeminjam(){
        int pilihan;
        do{
            System.out.println("\n"
                    +"===== MENU PEMINJAMAN ====="+ "\n"
                    +"1. Peminjaman"+ "\n"
                    +"2. List Peminjam"+ "\n"
                    +"0. Keluar"+ "\n"
                    +"Pilih : ");
            pilihan = input.nextInt();
            switch(pilihan){
                case 1 :
                    peminjaman();
                    break;
                case 2 :
                    viewPeminjaman();
                    break;
            }
        }while(pilihan!=0);
    }

    public void peminjaman(){
        if(anggota.anggota_m.getDataAnggota().size() > 0 || buku.buku_model.getDataBuku().size()>0){
            int KodeAnggota;
            int KodeBuku;
            String pilih="";
            System.out.print("Masukkan kode anggota = ");
            KodeAnggota = input.nextInt();
            int indexAnggota = anggota.cekAnggota(KodeAnggota);
            anggota.cekAnggota(KodeAnggota);
            if(anggota.cekAnggota(KodeAnggota) == -1){
                System.out.println("Data Tidak Ada");
            }else{
                do{
                    System.out.print("Masukkan kode Buku = ");
                    KodeBuku = input.nextInt();
                    int indexBuku = buku.cekBuku(KodeBuku);

                    if(buku.cekBuku(KodeBuku) == -1){
                        System.out.print("Kode Tersebut Tidak Ada"+"\n"+
                                "Memilih kode buku lagi? (y/t)");
                        pilih = input.next();
                    }
                    else{
                        System.out.println("\n ***** Data Peminjam ***** ");
                        System.out.println("Judul Buku : "+buku.showDaftarBuku(indexBuku).getJudul());
                        //output lengkap
                        System.out.println("Nama Peminjam : "+anggota.showDaftarAnggota(indexAnggota).getNama());

                    }
                }while(pilih == "y");
                //if, jika cek kode bku != -1 ==> isi menginputkan tanggan dan jumlah, lalu simpan/tidak
            }
        }
        else{
            System.out.println("Data Anggota atau Buku Kosong");
        }
    }

    public void viewPeminjaman(){

    }
}

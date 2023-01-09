package View;

import java.util.Scanner;

public class HomePage {

    Scanner input = new Scanner(System.in);



    public static void menuUtama(){
        Scanner input = new Scanner(System.in);
        BukuPage buku = new BukuPage();
        AnggotaPage anggota = new AnggotaPage();
        PeminjamanPage peminjaman = new PeminjamanPage();
        int pilih;
        do{
            System.out.println("\n"
                    +" == Menu Utama == "+"\n"
                    +"1. Data Buku"+"\n"
                    +"2. Data Anggota"+"\n"
                    +"3. Data Peminjam"+"\n"
                    +"0.Exit"+"\n"
                    +"Pilih : ");
            pilih = input.nextInt();

            switch(pilih){
                case 1:
                    buku.menuUtama();
                    break;
                case 2:
                    anggota.menuAnggota();
                    break;
                case 3:
                    peminjaman.dataPeminjam();
                    break;
            }
        }while(pilih != 0);
    }
}

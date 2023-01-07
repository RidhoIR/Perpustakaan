package View;

import Controller.Anggota_Controller;
import Controller.Petugas_Controller;

import java.util.Scanner;

public class LoginPage {

    public Petugas_Controller petugas = new Petugas_Controller();
    Scanner input = new Scanner(System.in);


    public void loginPage() {

        int pil;

        do {
            System.out.println("\n"
                    + "1. Login petugas" + "\n"
                    + "0. Exit" + "\n"
                    + "Pilih : ");
            pil = input.nextInt();

            switch (pil) {
                case 1:

                    System.out.print("No.Id Petugas = ");
                    int id = input.nextInt();
                    System.out.print("Password = ");
                    String password = input.next();
                    login(id, password);
            }

        } while (pil != 0);
    }


    void login(int id, String password){

        petugas.dataPetugas();
        boolean cekLogin = false;
        int i;
        for(i=0;i<petugas.petugas_m.getDataPetugas().size();i++){
            //mengecek pass & id
            try{
                if(id == petugas.petugas_m.getDataPetugas().get(i).getId() &&
                        password.equals(petugas.petugas_m.getDataPetugas().get(i).getPassword())){
                    cekLogin = true;
                    break;
                }
            }catch(Exception e){
                cekLogin = false;
            }
        }
        if(cekLogin){
            System.out.println("\n"+"Hallo "+petugas.petugas_m.getDataPetugas().get(i).
                    getNama()+" Selamat Datang di Perpustakaan!!");
            HomePage.menuUtama();
        }else{
            System.out.println("Maaf Password atau ID SALAH!!");
        }
    }
}

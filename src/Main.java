import Controller.Petugas_Controller;
import View.BukuPage;
import View.LoginPage;

public class Main {
    public static void main(String[]args){
//        BukuPage home = new BukuPage();
//        home.menuUtama();

//        Petugas_Controller petugas = new Petugas_Controller();
//        petugas.dataPetugas();
        LoginPage login = new LoginPage();
        login.loginPage();
    }
}

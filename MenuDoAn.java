
import java.util.Scanner;

public class MenuDoAn {
    DanhSachTour tour = new DanhSachTour();
    DanhSachKeHoachTour kht = new DanhSachKeHoachTour();
    Scanner sc = new Scanner(System.in);
    public void showMenu()
    { 
        System.out.println("================-Option-==============");
        System.out.println("||         1.Lam viec voi tour      ||");
        System.out.println("||    2.Lam viec voi ke hoach tour  ||");
        System.out.println("||      2.Lam viec voi khach hang   ||");
        System.out.println("||      2.Lam viec voi nhan vien    ||");
        System.out.println("||               0.Exit             ||");
        System.out.println("======================================");
    }
    public void Menu()
    {
        String choose = null;
        boolean exit = false;
        showMenu();
        while (true) {
            System.out.print("Nhap so de lam viec: ");
            choose = sc.nextLine();
            switch (choose) {
            case "1":
                tour.readDataFromFile();
                tour.Menu();
                break;
            case "2":
                kht.readDataFromFile();
                kht.Menu();
                break;
            case "3":
            
                break;
            case "4":
               
                break;
            case "5":
                
                break;
            case "0":
                System.out.println("Da thoat!");
                exit = true;
                break;
            default:
                System.err.println("Loi! Hay chon lai:");
                break;
            }
            if (exit) {
                break;
            }
            showMenu();
        }     
    }
}

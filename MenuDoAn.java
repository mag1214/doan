
import java.util.Scanner;

public class MenuDoAn {
    DanhSachTour tour = new DanhSachTour();
    DanhSachKeHoachTour kht = new DanhSachKeHoachTour();
    Scanner scint = new Scanner(System.in);
    Scanner scString = new Scanner(System.in);
    public void Menu()
    {
        int number=-1;
        boolean flag=true;
            while(flag)
            {
                System.out.println("===========-Menu_Danh_Sach_tour-==========");
                System.out.println("||         1.Nhap danh sach tour        ||");
                System.out.println("||         2.Xuat danh sach tour        ||");
                System.out.println("||    3.Nhap danh sach ke hoach tour    ||");
                System.out.println("||     4.Xuat danh sach ke hoach tour   ||");
                System.out.println("||         3.Sua thong tin tour         ||");
                System.out.println("||      4.Xoa tour trong danh sach      ||");
                System.out.println("||    6.Thong ke nam nam het han ViSa   ||");
                System.out.println("||              7.Ghi File              ||");
                System.out.println("||              8.Doc File              ||");
                System.out.println("||                0.Exit                ||");
                System.out.println("==========================================");
                System.out.print("Nhap so ban muon chon: ");
                number=scint.nextInt();
                switch (number) 
                {
                    case 1:
                        tour.Nhap();
                        break;
                    case 2:
                        tour.Xuat();
                        break;
                    case 3:
                        kht.Nhap();
                        break;
                    case 4:
                        kht.Xuat();
                        break;
                    case 5:
                        MenuTimKiem();
                        break;
                    case 6:
                        tour.QuocGiaDen();
                        break;
                    case 7:
                        tour.writeDataToFile();
                        break;
                    case 8:
                        tour.readDataFromFile();
                        break;
                    case 10:
                        kht.Xuat();
                    
                    case 0:
                        flag=false;
                        break;
                    default:
                        System.out.println("Nhap Sai!! Hay nhap lai");
                        break;
                }
            }         
    }
    public void MenuSua()
    {
        int number=-1;
        boolean flag=true;
        while(flag)
        {
            System.out.println("=========Menu_Sua_tour-=========");
            System.out.println("||  1.Sua tour co tham so     ||");
            System.out.println("|| 2.Sua tour khong tham so   ||");
            System.out.println("||  0.Thoat ra menu dstour    ||");
            System.out.println("================================");
            System.out.print("Nhap so ban muon chon: ");
            number=scint.nextInt();
            switch (number) 
            {
                case 1:
                    String tour1;
                    System.out.print("Nhap ma tour can sua: ");
                    tour1=scString.nextLine();
                    tour.Sua(tour1);
                    break;
                case 2:
                    tour.Sua();
                    break;
                case 0:
                    flag=false;
                    break;
                default:
                    System.out.println("Nhap Sai!! Hay nhap lai");
            }
        }
    }
    public void MenuXoa()
    {
        int number=-1;
        boolean flag=true;
        while(flag)
        {
            System.out.println("==============-Menu_Xoa_tour-============");
            System.out.println("||   1.Xoa theo ma tour khong tham so  ||");
            System.out.println("||    2.Xoa theo ma tour co tham so    ||");
            System.out.println("||        0.Thoat ra menu dstour       ||");
            System.out.println("=========================================");
            System.out.print("Nhap so ban muon chon: ");
            number=scint.nextInt();
            switch (number) 
            {
                case 1:
                    tour.XoaMa();
                    break;
                case 2:
                    String tour1;
                    System.out.print("Nhap ma tour can xoa: ");
                    tour1=scString.nextLine();
                    tour.XoaMa(tour1);
                    break;
                case 0:
                    flag=false;
                    break;
                default:
                    System.out.println("Nhap Sai!! Hay nhap lai");
            }
        }
    }

    public void MenuTimKiem()
    {
        int number=-1;
        boolean flag=true;
        while(flag)
        {
            System.out.println("===================Menu_TimKiem_tour======================");
            System.out.println("||       1.Tim kiem cac theo MA tour khong tham so      ||");
            System.out.println("||   2.Tim theo Ma tour co tham so theo kieu SinhVien   ||");
            System.out.println("||                   0.Thoat ra menu dstour             ||");
            System.out.println("==========================================================");
            System.out.print("Nhap so ban muon chon: ");
            number=scint.nextInt();
            switch (number) 
            {
                case 1:
                    tour.TimKiemMaTour();


                    break;
                case 2:
                    String tour2;
                    System.out.print("Nhap ma tour can tim: ");
                    tour2=scString.nextLine();
                    if(tour.TimKiemmMaTour(tour2)==null)
                        System.out.println("khong tim thay tour");
                    break;
                case 0:
                    flag=false;
                    break;
                default:
                    System.out.println("Nhap Sai!! Hay nhap lai");
         
            }       
        }
    }
}

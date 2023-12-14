import java.util.Scanner;

public class HoaDonChi {


    private String makehoachtua;//them ma duy nhat cho ma ke hoach tua
    private String manhanvien;
    private String mahoadon;
    DSCTKH ctkh = new DSCTKH();
    private double tongchiphi = ctkh.Tongchiphitour(makehoachtua);
    // tongchiphi: = chitietkehoach.tongchiphicuatua(makehoachtua)

    DanhSachKeHoachTour kht = new DanhSachKeHoachTour();
    DanhSachNhanVien nv = new DanhSachNhanVien();
    

    Scanner sc = new Scanner(System.in);
    public HoaDonChi()
    {

    }
    public HoaDonChi(String mahoadon, String makehoachtua, String manhanvien)
    {
        this.mahoadon = mahoadon;
        this.makehoachtua = makehoachtua;
        this.manhanvien = manhanvien;
    }
    public HoaDonChi(HoaDonChi hdc)
    {
        this.mahoadon = hdc.mahoadon;
     
        this.makehoachtua = hdc.makehoachtua;
        this.manhanvien = hdc.manhanvien;
    }
    public String getMaHoaDon()
    {
        return mahoadon;
    }
    public void setMahoadon(String mahoadon)
    {
        this.mahoadon = mahoadon;
    }
    public String getMaKeHoachTua()
    {
        return makehoachtua;
    }
    public void setMakehoachtua(String makehoachtua)
    {
        this.makehoachtua = makehoachtua;
    }
    public String getMaNhanVien()
    {
        return manhanvien;
    }
    public void setManhanvien(String manhanvien)
    {
        this.manhanvien = manhanvien;
    }
     public static void setTongchiphi(double tongchiphi2) {
    }

    public void nhap()
    {
        System.out.print("Nhap ma ke hoach tour: ");
        makehoachtua = sc.nextLine();
        while (true) {
            kht.readDataFromFile();
            if (kht.TimKiem(makehoachtua) != -1) {
                break;
            }
            System.err.println("Ma ke hoach tour vua nhap khong ton tai!!");
            System.err.println("Nhan Enter de tiep tuc: ");
            sc.nextLine();
            kht.Xuat();
            System.out.println("Nhap lai ma ke hoach tour: ");
            String id = sc.nextLine();
            setMakehoachtua(id);      
        }       
        System.out.print("Nhap ma hoa don: ");
        mahoadon = sc.nextLine();
        while (mahoadon.length() == 0) {
            System.err.println("Khong duoc de trong!!!");
            System.err.println("Vui long nhap lai ma hoa don: ");
            String id = sc.nextLine();
            setMahoadon(id);
        }
        System.out.print("Nhap ma nhan vien: ");
        manhanvien = sc.nextLine();
        while (true) {
            nv.readDataFromFile();
            if (nv.timkiemma(manhanvien) != -1) {
                break;
            }
            System.err.println("Ma nhan vien vua nhap khong ton tai!!");
            System.err.println("Nhan Enter de tiep tuc: ");
            sc.nextLine();
            nv.xuat();
            System.out.println("Nhap lai ma nhan vien: ");
            String id = sc.nextLine();
            setManhanvien(id);
            
        }

    }
    public void xuat()
    {
        System.out.format("%12s | ", mahoadon);
        System.out.format("%13s | ", makehoachtua);
        System.out.format("%13s%n ", manhanvien);
        System.out.format("%15s%n", tongchiphi);  // Hiển thị tổng chi phí
    }
}

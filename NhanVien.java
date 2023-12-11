import java.util.Scanner;
import java.util.Calendar;

public class NhanVien
{
    private String mahuongdanvien,ho, ten , gioitinh , ngaysinh, trinhdongonngu;
    Scanner sc = new Scanner(System.in);
    // constructor
    public NhanVien(){}
    public NhanVien(String mahuongdanvien,String ho, String ten ,String gioitinh, String ngaysinh, String trinhdongonngu)
    {
        this.mahuongdanvien = mahuongdanvien;
        this.ho = ho;
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.trinhdongonngu = trinhdongonngu;
    }
    public NhanVien(NhanVien hdv)
    {
        mahuongdanvien = hdv.mahuongdanvien;
        ho = hdv.ho;
        ten = hdv.ten;
        gioitinh = hdv.gioitinh;
        ngaysinh = hdv.ngaysinh;
        trinhdongonngu = hdv.trinhdongonngu;
    }
       public int getTuoi() {
        String[] tach = ngaysinh.split("/");
        String nam = tach[tach.length-1];
        int namsinh = Integer.parseInt(nam);
        Calendar a = Calendar.getInstance();
        int namhientai = a.get(Calendar.YEAR);
        int tuoi = namhientai - namsinh;
        return tuoi;
    }

    // get set
    public String getMahuongdanvien()
    {
        return mahuongdanvien;
    }
    public void setMaHuongDanVien(String mahuongdanvien)
    {
        this.mahuongdanvien = mahuongdanvien;
    }
    public String getHo()
    {
        return ho;
    }
    public void setHO(String ho)
    {
        this.ho = ho;
    }
    public String getTen()
    {
        return ten;
    }
    public void setTEN(String ten)
    {
        this.ten = ten;
    }
    public String getGioitinh()
    {
        return gioitinh;
    }
    public void setGioiTinh(String gioitinh)
    {
        this.gioitinh = gioitinh;
    }
    public String getNgaysinh()
    {
        return ngaysinh;
    }
    public void setNgaySinh(String ngaysinh)
    {
        this.ngaysinh = ngaysinh;
    }
    public String getTrinhdongonngu()
    {
        return trinhdongonngu;
    }
    public void setTrinhDoNgonNgu(String trinhdongonngu)
    {
        this.trinhdongonngu = trinhdongonngu;
    }
    public void nhap()
    {
        System.out.print("Nhap ma huong dan vien: ");
        mahuongdanvien = sc.nextLine();
        // khong duoc de trong
        System.out.print("Nhap ho huong dan vien: ");
        ho = sc.nextLine();
        System.out.print("Nhap ten huong dan vien: ");
        ten = sc.nextLine();
        System.out.print("Nhap gioi tinh huong dan vien: ");
        gioitinh = sc.nextLine();
        System.out.print("Nhap ngay thang nam sinh huong dan vien: ");
        ngaysinh = sc.nextLine();

        // lamf theo mau ngay cua duy anh
        System.out.print("Nhap trinh do ngon ngu cua huong dan vien: ");
        trinhdongonngu = sc.nextLine();
    }
    public void xuat() {
        System.out.format("%13s | ", mahuongdanvien);
        System.out.format("%10s | ", ho);
        System.out.format("%15s | ",ten);
        System.out.format("%5s | ", gioitinh);
        System.out.format("%10s | ", ngaysinh);
        System.out.format("%10s%n", trinhdongonngu);

    }   
     
}
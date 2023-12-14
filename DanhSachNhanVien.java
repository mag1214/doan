import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.io.EOFException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DanhSachNhanVien {
    NhanVien[] a;
    int n;
    int v = 0;
    Scanner sc = new Scanner(System.in);
    private String ngaysinh;
    public DanhSachNhanVien(){}

    public DanhSachNhanVien(NhanVien[] a, int n){
        this.a=a;
        this.n=n;
    }
     public void nhap(){
        System.out.print("Nhap n nhan vien dau tien: ");
        n = sc.nextInt();
        sc.nextLine();
        a = new NhanVien[n];
        for(int i = 0; i < n; i++){
            a[i]= new NhanVien();
            a[i].nhap();
        }
    }
    public String MaNhanVienTimThay(int i)
    {
        return a[i].getMahuongdanvien();
    }
    public void xuat() {
        n=a.length;
        System.out.println("=====================-DANH SACH HOA DON CHI-==================");
        System.out.format("|| %9s |%9s |%7s |%12s |%12|%12||\n",
                  "MaHuongDanVien", "Ho", "Ten", "GioiTinh", "NgaySinh", "TrinhDoNgonNgu");
        try
        {
            for(int i=0; i<n; i++)
            {
                a[i].xuat();
                System.out.println();
            }
        }catch(NullPointerException npe) {
			
		}
        
        System.out.println("================================================================");
    }

    public void them() {
        n = a.length;
        a = Arrays.copyOf(a, n + 1);
        a[n] = new NhanVien();
        System.out.println("Nhap thong tin nhan vien can them: ");
        a[n].nhap();
        n++;
    }

    public void them(NhanVien x){
        n = a.length;
        a = Arrays.copyOf(a, n + 1);
        a[n] = new NhanVien(x);
        n++;
    }
    
    public void sua(){
        System.out.print("Nhap ma nhan vien can duoc sua: ");
        String id = sc.nextLine();
        boolean isExisted = false;
        n = a.length;
        for (int i = 0; i < n; i++) {
            if(a[i].getMahuongdanvien().equals(id)) {
                isExisted = true;
                System.out.print("Ma nhan vien duoc sua thanh: ");
                String ma = sc.nextLine();
                a[i].setMaHuongDanVien(ma);
                System.out.print("Ho duoc sua thanh: ");
                String ho = sc.nextLine();
                a[i].setHO(ho);
                System.out.print("Ten duoc sua thanh: ");
                String ten = sc.nextLine();
                a[i].setTEN(ten);
                System.out.print("Gioi tinh duoc sua thanh: ");
                String gioitinh = sc.nextLine();
                a[i].setGioiTinh(gioitinh);
                System.out.print("Ngay sinh duoc sua thanh: ");
                String ngaysinh=sc.nextLine();
                a[i].setNgaySinh(ngaysinh);
                System.out.print("Trinh do ngon ngu duoc sua thanh: ");
                String trinhdongonngu=sc.nextLine();
                a[i].setTrinhDoNgonNgu(trinhdongonngu);
                break;
            }
        }
        if(!isExisted) 
            System.out.println("Khong tim thay ma nhan vien!");
    }

    public void sua(String id) {
        boolean isExisted = false;
        n = a.length;
        for (int i = 0; i < n; i++) {
            if(a[i].getMahuongdanvien().equals(id)) {
                isExisted = true;
                System.out.print("Ma nhan vien duoc sua thanh: ");
                String ma = sc.nextLine();
                a[i].setMaHuongDanVien(ma);
                System.out.print("Ho duoc sua thanh: ");
                String ho = sc.nextLine();
                a[i].setHO(ho);
                System.out.print("Ten duoc sua thanh: ");
                String ten = sc.nextLine();
                a[i].setTEN(ten);
                System.out.print("Gioi tinh duoc sua thanh: ");
                String gioitinh=sc.nextLine();
                a[i].setGioiTinh(gioitinh);
                System.out.print("Ngay sinh duoc sua thanh: ");
                String ngaysinh=sc.nextLine();
                a[i].setNgaySinh(ngaysinh);
                System.out.print("Trinh do ngon ngu duoc sua thanh: ");
                String trinhdongonngu=sc.nextLine();
                a[i].setTrinhDoNgonNgu(trinhdongonngu);
                break;
            }
        }
        if(!isExisted) 
            System.out.println("Khong tim thay ma nhan vien!");
    }
     
    public void timkiem(){
        System.out.print("Nhap ma nhan vien muon tim: ");
        String ma = sc.nextLine();
        boolean isExisted = false;
        n = a.length;
        for (int i = 0; i < n; i++) {
            if(a[i].getMahuongdanvien().equals(ma)) {
                isExisted = true;
                System.out.println("Thong tin nhan vien can tim: ");
                a[i].xuat();
                break;
            }
        }
        if(!isExisted) 
            System.out.println("Khong tim thay ma nhan vien!");
    }
       public NhanVien timkiem(String ma){
        n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i].getMahuongdanvien().equals(ma)) {
                return a[i];
            }
        }  
        return null;
    }
    public int timkiemma(String ma){
        n = a.length;
        int vitri = -1;
        for (int i = 0; i < n; i++) {
            if(a[i].getMahuongdanvien().equals(ma)) {
                vitri = i;
                break;
            }
        }
        return vitri;
    }
    
 
    
    public void timkiemho(){
        System.out.print("Nhap ho nhan vien muon tim: ");
        String ho = sc.nextLine();
        boolean isExisted = false;
        n = a.length;
        for(int i = 0; i < n; i++) {
            if (a[i].getHo().contains(ho)) {
                isExisted = true;
                a[i].xuat();
            }
        }
        if(!isExisted) 
            System.out.println("Khong co nhan vien nao mang ho "+ho+"!");
    }

    public void timkiemho(String ho){
        boolean isExisted = false;
        n = a.length;
        for(int i = 0; i < n; i++) {
            if (a[i].getHo().contains(ho)) {
                isExisted = true;
                a[i].xuat();
            }
        }
        if(!isExisted) 
            System.out.println("Khong co nhan vien nao mang ho "+ho+"!");
    }
    public void timkiemten(){
        System.out.print("Nhap ten nhan vien muon tim: ");
        String ten = sc.nextLine();
        boolean isExisted = false;
        n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i].getTen().contains(ten)) {
                isExisted = true;
                a[i].xuat();
            }
        }
        if (!isExisted) 
            System.out.println("Khong co nhan vien nao mang ten "+ten+"!");
    }
    public void timkiemten(String ten){
        boolean isExisted = false;
        n = a.length;
        for (int i = 0; i <n ; i++) {
            if (a[i].getTen().contains(ten)) {
                isExisted = true;
                a[i].xuat();
            }
        }
        if (!isExisted) 
            System.out.println("Khong co nhan vien nao mang ten "+ten+"!");
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

    public void xoa(){
        System.out.print("Nhap ma nhan vien muon xoa: ");
        String id = sc.nextLine();
        n = a.length;
        int vitri = timkiemma(id);
        if(vitri == -1) 
            System.out.println("Khong tim thay ma nhan vien!");
        else {
            a = Arrays.copyOf(a, n + 1);
            for(int i = vitri; i < n; i++)  {
                a[i] = a[i + 1];
            }
            a = Arrays.copyOf(a, n - 1);
            n--;
        }
    }
    
    public void xoa(String id){
        n = a.length;
        int vitri = timkiemma(id);
        if(vitri == -1) 
            System.out.println("Khong tim thay ma nhan vien!");
        else {
            a = Arrays.copyOf(a, n + 2);
            for(int i = vitri; i < n; i++) {
                a[i] = a[i + 1];
            }
            a = Arrays.copyOf(a, n - 1);
            n--;
        }
    }
    public void thongkegioitinh(){
        Map<String,Integer> count=new HashMap<>();
        n=a.length;
        for(int i=0;i<n;i++){
            if(count.containsKey(a[i].getGioitinh())) count.put(a[i].getGioitinh(), count.get(a[i].getGioitinh())+1);
            else count.put(a[i].getGioitinh(), 1);
        }
        System.out.println("Bang thong ke gioi tinh cua nhan vien:");
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public void writeDataToFile() throws IOException {
        n = a.length;
        DataOutputStream out = new DataOutputStream(new FileOutputStream("doan/dataNV.txt"));
        for(int i = 0; i < n; i++) {
            out.writeUTF(a[i].getMahuongdanvien());
            out.writeUTF(a[i].getHo());
            out.writeUTF(a[i].getTen());
            out.writeUTF(a[i].getGioitinh());
            out.writeUTF(a[i].getNgaysinh());
            out.writeUTF(a[i].getTrinhdongonngu());

        }
        out.close();
    }

    public void readDataFromFile() {
        a = new NhanVien[500];
        int i = 0;
        try {
            DataInputStream in = new DataInputStream(new FileInputStream("doan/dataNV.txt"));
            try {
                while(true) {
                    a[i] = new NhanVien();
                    a[i].setMaHuongDanVien(in.readUTF());
                    a[i].setHO(in.readUTF());
                    a[i].setTEN(in.readUTF());
                    a[i].setGioiTinh(in.readUTF());
                    a[i].setNgaySinh(in.readUTF());
                    a[i].setTrinhDoNgonNgu(in.readUTF());

                    i++;
                }
            } catch (EOFException e) {

            } finally {
                n = i;
                a = Arrays.copyOf(a, n);
                in.close();
            }
        } catch (IOException e) {
       
        }
    }
    
    public void MaDuyNhat(int i) throws IOException
    {
        readDataFromFile();
        String mahuongdanvien;
        String mhdv = a[i].getMahuongdanvien();
        do
        {
            if (KiemTraMNV(mhdv,i)) {
                System.out.println();
                xuat();
                System.err.println("\nHuong Dan Vien thu " + (i+1) + "co ma " +mhdv + "bi trung voi ma huong dan vien. An enter de tiep tuc!");
                sc.nextLine();
                System.err.print("Nhap lai ma: ");
                mahuongdanvien = sc.nextLine();
                a[i].setMaHuongDanVien(mahuongdanvien);
                writeDataToFile();
                mhdv = a[i].getMahuongdanvien();
            }
        }
        while(KiemTraMNV(mhdv,i));
    }


    public boolean KiemTraMNV(String mahuongdanvien, int k) {
		for(int i = v - 1; i >= 0; i--) {
			if(a[i].getMahuongdanvien().indexOf(mahuongdanvien) != -1 && i!= k) {
				return true;
			}
		}
		return false;
	}
}

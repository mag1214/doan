import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class DSKS {
    static KhachSan[]a;
    int n;
    Scanner sc= new Scanner (System.in);
    
    public DSKS(){

    }

    public DSKS(KhachSan[] a,int n){
        this.n=n;
        a=new KhachSan[n];
    }

    public void xuat() {
        System.out.println("===============================Danh sach khach san================================");
        System.out.format("|| %5s | %10s | %15s | %15s | %15s ||\n", "Stt", "Ma khach san", "Dia diem", "Ten", "Chi phi");
        for(int i = 0; i < n; i++) {
            System.out.format("|| %5d |", i + 1);
            a[i].xuat();
        }
        System.out.println("==================================================================================");
    }

    public boolean isIdExist(String id, int x) {
        for(int i = 0; i < x; i++) {
            if(a[i].getMakhachsan().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public boolean isIdExist(String id) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(a[i].getMakhachsan().equals(id)) {
                count++;
            }
        }
        if(count == 2) {
            return true;
        }
        return false;
    }

    public void checkId(int i) {
        while(isIdExist(a[i].getMakhachsan(), i)) {
            System.err.println("Ma  vua nhap bi trung lap voi ma  khac!!!");
            System.err.println("Nhan Enter de nhap lai!!!");
            sc.nextLine();
            System.out.println("Nhap lai ma :");
            String id = sc.nextLine();
            a[i].setMakhachsan(id);
        }
    }
    public void them() throws IOException {
        n = a.length;
        a = Arrays.copyOf(a, n + 1);
        a[n] = new KhachSan();
        System.out.println("Nhap thong tin khach san can them: ");
        a[n].nhap();
        checkId(n);
        n++;
        ghiFile();
    }

    public void them(KhachSan ks) throws IOException{
        n = a.length;
        a = Arrays.copyOf(a, n + 1);
        a[n] = new KhachSan(ks);
        checkId(n);
        n++;
        ghiFile();
    }

    public void sua() throws IOException{
        int k ;
        String ma;
        KhachSan Suaks=new KhachSan();
        System.out.println("Nhap ma khach san ban can sua");
        ma=sc.nextLine();
        k=timkiemma(ma);
        if (k!=-1){
            System.out.println("++++++++Nhap thong tin khach san can sua++++++++");
            Suaks.nhap();
            a[k]=Suaks;
            checkId(k);
            ghiFile();
            
            
        }
        else System.out.println("Ma khong ton tai");

    }

    public void sua(String ma) throws IOException {
        int k ;
        KhachSan Suaks=new KhachSan();
        k=timkiemma(ma);
        if (k!=-1){
            System.out.println("++++++++Nhap thong tin khach san can sua++++++++");
            Suaks.nhap();
            a[k]=Suaks;
            checkId(k);
            ghiFile();
           
            
        }
        
        else System.out.println("Ma khong ton tai");

    }
    public void timkiem(){
        System.out.print("Nhap ma khach san muon tim: ");
        String ma = sc.nextLine();
        boolean isExisted = false;
        n = a.length;
        for (int i = 0; i < n; i++) {
            if(a[i].getMakhachsan().equals(ma)) {
                isExisted = true;
                System.out.println("Thong tin khach san can tim: ");
                a[i].xuat();
                break;
            }
        }
        if(!isExisted) 
            System.out.println("Khong tim thay ma khach san!");
    }
    
    public int timkiemma(String ma){
        n = a.length;
        int vitri = -1;
        for (int i = 0; i < n; i++) {
            if(a[i].getMakhachsan().equals(ma)) {
                vitri = i;
                break;
            }
        }
        return vitri;
    }
    
    public KhachSan timkiem(String ma){
        n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i].getMakhachsan().equals(ma)) {
                return a[i];
            }
        }  
        return null;
    }
    public void xoa(){
        System.out.print("Nhap ma khach san muon xoa: ");
        String id = sc.nextLine();
        n = a.length;
        int vitri = timkiemma(id);
        if(vitri == -1) 
            System.out.println("Khong tim thay ma khach san!");
        else {
            a = Arrays.copyOf(a, n + 2);
            for(int i = vitri; i < n; i++) {
                a[i] = a[i + 1];
            }
            a = Arrays.copyOf(a, n - 1);
            n--;
        }
    }
    
    public void xoa(String ma){
        n = a.length;
        int vitri = timkiemma(ma);
        if(vitri == -1) 
            System.out.println("Khong tim thay ma khach san !");
        else {
            a = Arrays.copyOf(a, n + 2);
            for(int i = vitri; i < n; i++) {
                a[i] = a[i + 1];
            }
            a = Arrays.copyOf(a, n - 1);
            n--;
        }
    }
    public void timKiemChiPhiLonHon(double gioiHanChiphi) {
        System.out.format("Cac khu vui choi co chi phi lon hon %.2f:%n", gioiHanChiphi);
        System.out.format("%10s | %10s | %10s | %15s%n", "Ma Khu", "Dia Diem", "Ten", "Chi Phi");
        for (int i = 0; i < n   ; i++) {
            if (a[i].getChiphi() > gioiHanChiphi) {
                a[i].xuat();
            }
        }
    }
    public void timKiemChiPhiLonHon() {
        System.out.print("Nhap gioi han chi phi tu ban phim: ");
        double gioiHanChiphi = sc.nextDouble();

        System.out.format("Cac khu vui choi co chi phi lon hon %.2f:%n", gioiHanChiphi);
        System.out.format("%10s | %10s | %10s | %15s%n", "Ma Khu", "Dia Diem", "Ten", "Chi Phi");
        for (int i = 0; i < n; i++) {
            if (a[i].getChiphi() > gioiHanChiphi) {
                a[i].xuat();
            }
        }
        sc.close();
    }
    public void thongKeTen() {
        Map<String, Integer> thongKe = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String ten =a[i].getTen();

            if (thongKe.containsKey(ten)) {
                thongKe.put(ten, thongKe.get(ten) + 1);
            } else {
                thongKe.put(ten, 1);
            }
        }

        System.out.println("Thong ke ten cac khach san:");
        System.out.format("%10s | %15s%n", "Ten", "So Luong");
        for (Map.Entry<String, Integer> entry : thongKe.entrySet()) {
            System.out.format("%10s | %15s%n", entry.getKey(), entry.getValue());
        }
    }
    
    public void timKiemTheoTen(String tenCanTim) {
        System.out.println("Ket qua tim kiem theo ten: " + tenCanTim);
        System.out.format("%10s | %10s | %10s | %15s%n", "Ma ", "Dia Diem", "Ten", "Chi Phi");
        boolean result = false;
        
        for (int i = 0; i < n; i++) {
            if (a[i].getTen().equalsIgnoreCase(tenCanTim)) {
                a[i].xuat();
                result = true;
            }
        }

        if (!result) {
            System.out.println("Khong tim thay ket qua cho ten: " + tenCanTim);
        }
    }
    
     public void ghiFile() throws IOException {
        n=a.length;
        DataOutputStream  output = new DataOutputStream(new FileOutputStream("doan/dataks.txt"));
        for (int i=0;i<n;i++){
            output.writeUTF(a[i].getMakhachsan());
            output.writeUTF(a[i].getDiadiem());
            output.writeUTF(a[i].getTen());
            output.writeDouble(a[i].getChiphi());
        }
        output.close();
    }

    public void docFile() {
       a= new KhachSan[100];
       int i=0;
       try {
            DataInputStream input =new DataInputStream(new FileInputStream("doan/dataks.txt"));
            try{
                while ( true ){
                    a[i]=new KhachSan();
                    a[i].setMakhachsan(input.readUTF());
                    a[i].setDiadiem(input.readUTF());
                    a[i].setTen(input.readUTF());
                    a[i].setChiphi(input.readDouble());
                    i++;

                }
            }
            catch (IOException e){}
            finally{
            n=i;
            a=Arrays.copyOf(a,n);
            input.close();
        }
    } 
       catch (IOException e){}

    }
}


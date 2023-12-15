import java.util.Scanner;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
public class DSCTKH {
    static ChiTietKeHoach [] a;
    private int n;

    Scanner sc= new Scanner (System.in);

    DSCTKH(){}

    DSCTKH(ChiTietKeHoach []a,int n){
        this.n=n;
        a=new ChiTietKeHoach[n];
    }
    
    public long Tongchiphitour(String makht){
        long sum=0;
        n = a.length;
        for (int i=0;i<n;i++){
            if(a[i].getManhahang().equals(makht)){
                sum+=a[i].getTongchiphi();
            }
        }
        return sum;
    }
    
    
    public void nhap() throws IOException{
        System.out.print("Nhap n chi tiet dau tien: ");
        n = sc.nextInt();
        sc.nextLine();
        a = new ChiTietKeHoach[n];
        for(int i = 0; i < n; i++){
            a[i]= new ChiTietKeHoach();
            a[i].nhap();
        }
        ghiFile();
    }
    
    public void xuat() {
        System.out.println("===========================Danh sach chi tiet ke hoach============================");
        
		System.out.format("|| %5s | %10s | %10s | %10s | %10s | %10s | %8s | %15s ||\n", "Stt", "Makht", "manhahang", "makhachsan", "makhuvuichoi","mahoadonchi","tongchiphi","ngay");
        for(int i = 0; i < n; i++) {
            System.out.format("|| %5d |", i + 1);
            a[i].xuat();
        }
        System.out.println("==================================================================================");
    }

    public void sua() throws IOException{
        System.out.print("Nhap ma ke hoach can duoc sua: ");
        String id = sc.nextLine();
        boolean isExisted = false;
        n = a.length;
        for (int i = 0; i < n; i++) {
            if(a[i].getMaKht().equals(id)) {
                isExisted = true;
                a[i].nhap();
                ghiFile();
                break;
            }   
            if(!isExisted) 
            System.out.println("Khong tim thay ma ke hoach !");
            }
        }
    

    public void sua(String id) throws IOException{
        boolean isExisted = false;
        n = a.length;
        for (int i = 0; i < n; i++) {
            if(a[i].getMaKht().equals(id)) {
                isExisted = true;
                a[i].nhap();
                ghiFile();
                break;     
            }
        }
        if(!isExisted) 
            System.out.println("Khong tim thay ma !"); 
    }

    public void them() throws IOException {
        n = a.length;
        a = Arrays.copyOf(a, n + 1);
        a[n] = new ChiTietKeHoach();
        System.out.println("Nhap thong tin ke hoach can them: ");
        a[n].nhap();
        ghiFile();
        n++;
    }

    public void themkh(String makh) throws IOException {
        a = Arrays.copyOf(a, n + 1);
        a[n] = new ChiTietKeHoach();
        System.out.println("Nhap thong tin chi tiet ke hoach: ");
        a[n].nhap();
        a[n].setMakht(makh);
        n++;
        ghiFile();
    }

    public void them(ChiTietKeHoach ctkh) throws IOException{
        n = a.length;
        a = Arrays.copyOf(a, n + 1);
        a[n] = new ChiTietKeHoach(ctkh);
        ghiFile();
        n++;
    }

    

    public void timkiem(){
        System.out.print("Nhap ma ke hoach tour muon tim: ");
        String ma = sc.nextLine();
        boolean isExisted = false;
        n = a.length;
        for (int i = 0; i < n; i++) {
            if(a[i].getMaKht().equals(ma)) {
                isExisted = true;
                System.out.println("Thong tin chi tiet ke hoach can tim: ");
                a[i].xuat();
                break;
            }
        }
        if(!isExisted) 
            System.out.println("Khong tim thay ma ke hoach !");
    }
    
    public int timkiemma(String ma){
        n = a.length;
        int vitri = -1;
        for (int i = 0; i < n; i++) {
            if(a[i].getMaKht().equals(ma)) {
                vitri = i;
                break;
            }
        }
        return vitri;
    }
    

    public ChiTietKeHoach timkiem(String ma){
        n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i].getMaKht().equals(ma)) {
                return a[i];
            }
        }  
        return null;
    }
    
    public int FindDay(String day){
        n=a.length;
        int location=-1;
        for ( int i=0; i<n; i++){
            if(a[i].getNgay().equals(day)){
                location=i;
                break;
            }
        }
        return location;
    }

    public void timkiemks(){
        System.out.print("Nhap ma khach san muon tim: ");
        String ma = sc.nextLine();
        boolean isExisted = false;
        n = a.length;
        for(int i = 0; i < n; i++) {
            if (a[i].getMakhachsan().equals(ma)) {
                isExisted = true;
                a[i].xuat();
            }
        }
        if(!isExisted) 
            System.out.println("Khong tim thay ma khach san!");
    }

    public void timkiemks(String ma){
        boolean isExisted = false;
        n = a.length;
        for(int i = 0; i < n; i++) {
            if (a[i].getMakhachsan().equals(ma)) {
                isExisted = true;
                a[i].xuat();
            }
        }
        if(!isExisted) 
            System.out.println("Khong tim thay ma khach san!");
    }

    public void timkiemnh(){
        System.out.print("Nhap ma nha hang muon tim: ");
        String ma = sc.nextLine();
        boolean isExisted = false;
        n = a.length;
        for(int i = 0; i < n; i++) {
            if (a[i].getManhahang().equals(ma)) {
                isExisted = true;
                a[i].xuat();
            }
        }
        if(!isExisted) 
            System.out.println("Khong tim thay ma nha hang!");
    }

    public void timkiemnh(String ma){
        boolean isExisted = false;
        n = a.length;
        for(int i = 0; i < n; i++) {
            if (a[i].getManhahang().equals(ma)) {
                isExisted = true;
                a[i].xuat();
            }
        }
        if(!isExisted) 
            System.out.println("Khong tim thay ma nha hang!");
    }

    public void timkiemvc(){
        System.out.print("Nhap ma khu vui choi muon tim: ");
        String ma = sc.nextLine();
        boolean isExisted = false;
        n = a.length;
        for(int i = 0; i < n; i++) {
            if (a[i].getMakhuvuichoi().equals(ma)) {
                isExisted = true;
                a[i].xuat();
            }
        }
        if(!isExisted) 
            System.out.println("Khong tim thay ma khu vui choi!");
    }

    public void timkiemvc(String ma){
        boolean isExisted = false;
        n = a.length;
        for(int i = 0; i < n; i++) {
            if (a[i].getMakhuvuichoi().equals(ma)) {
                isExisted = true;
                a[i].xuat();
            }
        }
        if(!isExisted) 
            System.out.println("Khong tim thay ma khu vui choi!");
    }
    
    public void xoa() throws IOException{
        System.out.print("Nhap ma ke hoach muon xoa: ");
        String id = sc.nextLine();
        n = a.length;
        int vitri = timkiemma(id);
        if(vitri == -1) 
            System.out.println("Khong tim thay ma ke hoach !!");
        else {
            a = Arrays.copyOf(a, n + 2);
            for(int i = vitri; i < n; i++) {
                a[i] = a[i + 1];
            }
            a = Arrays.copyOf(a, n - 1);
            n--;
            ghiFile();
        }
    }
    
    public void xoa(String id) throws IOException{
        n = a.length;
        int vitri = timkiemma(id);
        if(vitri == -1) 
            System.out.println("Khong tim thay ma hoa don!");
        else {
            a = Arrays.copyOf(a, n + 2);
            for(int i = vitri; i < n; i++) {
                a[i] = a[i + 1];
            }
            a = Arrays.copyOf(a, n - 1);
            n--;
            ghiFile();
        }
    }
    public void timKiemChiPhiLonHon(double Chiphi) {
        System.out.format("Cac chi tiet co chi phi bang  %.2f:%n", Chiphi);
        System.out.format("%10s | %10s | %10s | %15s%n", "Ma Khu", "Dia Diem", "Ten", "Chi Phi");
        for (int i = 0; i < n   ; i++) {
            if (a[i].getTongchiphi() == Chiphi) {
                a[i].xuat();
            }
        }
    }
    public void timKiemChiPhiNgay() {
        System.out.print("Nhap chi phi tu ban phim: ");
        double Chiphi = sc.nextDouble();

        System.out.format("Cac chi tiet co chi phi bang %.2f:%n",Chiphi);
        System.out.format("%10s | %10s | %10s | %15s%n", "Ma Khu", "Dia Diem", "Ten", "Chi Phi");
        for (int i = 0; i < n; i++) {
            if (a[i].getTongchiphi() == Chiphi) {
                a[i].xuat();
            }
        }
    }

    public void ghiFile() throws IOException {
        n=a.length;
        DataOutputStream  output = new DataOutputStream(new FileOutputStream("data/datactkh.txt"));
        for (int i=0;i<n;i++){
            output.writeUTF(a[i].getMaKht());
            output.writeUTF(a[i].getMakhachsan());
            output.writeUTF(a[i].getMakhuvuichoi());
            output.writeUTF(a[i].getManhahang());
            output.writeUTF(a[i].getNgay());
        }
        output.close();
    }

    public void docFile() {
       a= new ChiTietKeHoach[100];
       int i=0;
       try {
            DataInputStream input =new DataInputStream(new FileInputStream("data/datactkh.txt"));
            try{
                while ( true ){
                    a[i]=new ChiTietKeHoach();
                    a[i].setMakht(input.readUTF());
                    a[i].setMakhachsan(input.readUTF());
                    a[i].setMakhuvuichoi(input.readUTF());
                    a[i].setManhahang(input.readUTF());
                    a[i].setNgay(input.readUTF());
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

    public void showMenu() {
        System.out.println("===============-Option-=============");
        System.out.println("||    1. Them chi tiet ke hoach.  ||");
        System.out.println("||     2. Xoa chi tiet ke hoach.  ||");
        System.out.println("||        3. Sua thong tin.       ||");
        System.out.println("||      4. Tim kiem thong tin.    ||");
        System.out.println("||       5. Xem danh sach.        ||");
        System.out.println("||           0. Thoat.            ||");
        System.out.println("====================================");
    }
    public void showMenutimkiem()
    {
        System.out.println("===============-Option-==============");
        System.out.println("||  1. Tim kiem chi tiet ke hoach.  ||");
        System.out.println("||  2. Tim kiem theo ma khach san.  ||");
        System.out.println("||    3. Tim kiem chi phi ngay.     ||");
        System.out.println("||  4. Tim kiem theo ma khach san.  ||");
        System.out.println("||  5. Tim kiem theo ma nha hang.   ||");
        System.out.println("||             0. Thoát             ||");
        System.out.println("======================================");
    }
    public void MenuTimKiem()
    {
        String choose = null;
        boolean exit = false;
        showMenutimkiem();
        while (true) {
            System.out.print("Nhap so de lam viec: ");
            choose = sc.nextLine();
            switch (choose) {
            case "1":
                timkiem();
                break;
            case "2":
                timkiemks();
                break;
            case "3":
                timKiemChiPhiNgay();
                break;
            case "4":
                timkiemks();
            case "5":
                timkiemnh();
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
            showMenutimkiem();
        }
    }
    public void Menu() throws IOException{
        String choose = null;
        boolean exit = false;
        showMenu();
        while (true) {
            System.out.print("Nhap so de lam viec: ");
            choose = sc.nextLine();
            switch (choose) {
            case "1":
                them();
                break;
            case "2":
                xoa();
                break;
            case "3":
                sua();
                break;
            case "4":
                MenuTimKiem();
                break;
            case "5":
                xuat();
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


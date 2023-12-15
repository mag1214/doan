import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;



public class ChiTietKeHoach{
    private String makht;
    private String manhahang;
    private String makhachsan;
    private String makhuvuichoi;
    private String mahoadonchi;
    private String ngay;
    private int tongchiphi;
    
    DSKS b = new DSKS();
    DSVC c = new DSVC();
    DSNH a = new DSNH();
    DanhSachKeHoachTour dskht = new DanhSachKeHoachTour();  
    DSCTKH d = new DSCTKH();
    DanhSachHoaDonChi e = new DanhSachHoaDonChi();
    Scanner sc= new Scanner(System.in);

    public ChiTietKeHoach(){}

    public ChiTietKeHoach(String makht, String manhahang, String makhachsan, String makhuvuichoi, String mahoadonchi,int tongchiphi,String ngay){
        this.makht=makht;
        this.manhahang=manhahang;
        this.makhachsan=makhachsan;
        this.makhuvuichoi=makhuvuichoi;
        this.mahoadonchi=mahoadonchi;
        this.tongchiphi=tongchiphi;
        this.ngay=ngay;
    }
    

    public ChiTietKeHoach(ChiTietKeHoach CTKH){
        this.manhahang=CTKH.manhahang;
        this.makhachsan=CTKH.makhachsan;
        this.makhuvuichoi=CTKH.makhuvuichoi;
        this.mahoadonchi=CTKH.mahoadonchi;
        this.ngay=CTKH.ngay;
        this.tongchiphi=CTKH.tongchiphi;

    }

    public void HoatDong() {
        tongchiphi=0;
        System.out.println("Chon nha hang");
        manhahang=sc.nextLine();
        while (true){
           a.docFile();
           if(a.timkiemma(manhahang)!=-1){
               break;
           }
           System.err.println("Ma nha hang ban nhap chua chinh xac :");
           System.err.println(" Vui long nhan Enter để nhập lại ");
           sc.nextLine();
           System.out.println("Nhap lai ma nha hang:");
           String manh=sc.nextLine();
           setManhahang(manh);
        }
        

        System.out.println("Chon ma khach san");
        String makhachsan=sc.nextLine();
        while(true){
           b.docFile();
           if(b.timkiemma(makhachsan)!=-1){
               break;
           }
           System.err.println("ma khach san ban chon chua dung");
           System.err.println("Vui long nhan Entern de nhap lai ma khach san");
           sc.nextLine();
           System.out.println("Nhap lai ma khach san");
           String maks=sc.nextLine();
           setMakhachsan(maks);
        }
        

        System.out.println("Chon ma khu vui choi ");
        String makhuvuichoi=sc.nextLine();
        while ( true ){
           c.docFile();
           if(c.timkiemma(makhuvuichoi)!=-1){
               break;
           }
           System.err.println("ma khu vui choi ban chon chua chinh xac !");
           System.err.println(" Vui long nhan Enter de nhap lai ");
           sc.nextLine();
           System.out.println("Nhap lai ma khu vui choi");
           String makvc=sc.nextLine();
           setMakhuvuichoi(makvc);
        }
        tongchiphi=(a.timkiem(manhahang).getChiPhi())+(b.timkiem(makhachsan).getChiPhi())+(c.timkiem(makhuvuichoi).getChiphi());
    }

    public String getMaKht(){
        return makht;
    }

    public void setMakht(String makht){
        this.makht=makht;
    }
    public String getManhahang() {
        return manhahang;
    }

    public void setManhahang(String manhahang) {
        this.manhahang = manhahang;
    }

    public String getMakhachsan() {
        return makhachsan;
    }

    public void setMakhachsan(String makhachsan) {
        this.makhachsan = makhachsan;
    }

    public String getMakhuvuichoi() {
        return makhuvuichoi;
    }

    public void setMakhuvuichoi(String makhuvuichoi) {
        this.makhuvuichoi = makhuvuichoi;
    }

    public String getMahoadonchi(){
        return mahoadonchi;
    }

    public void setMahoadonchi(String mahoadonchi){
        this.mahoadonchi=mahoadonchi;
    }

    public int getTongchiphi(){
        return tongchiphi;
    }

    public void setTongchiphi(int tongchiphi){
        this.tongchiphi=tongchiphi;
    }

    public String getNgay(){
        return ngay;
    }

    public void setNgay(String ngay){
        this.ngay=ngay;
    }

    public void nhap() {
        System.out.println("Chon nha hang");
        manhahang=sc.nextLine();
        while (true){
           a.docFile();
           if(a.timkiemma(manhahang)!=-1){
               break;
           }
           System.err.println("Ma nha hang ban nhap chua chinh xac :");
           System.err.println(" Vui long nhan Enter để nhập lại ");
           sc.nextLine();
           System.out.println("Nhap lai ma nha hang:");
           String manh=sc.nextLine();
           setManhahang(manh);
        }

        System.out.println("Chon ma khach san");
        String makhachsan=sc.nextLine();
        while(true){
           b.docFile();
           if(b.timkiemma(makhachsan)!=-1){
               break;
           }
           System.err.println("ma khach san ban chon chua dung");
           System.err.println("Vui long nhan Entern de nhap lai ma khach san");
           sc.nextLine();
           System.out.println("Nhap lai ma khach san");
           String maks=sc.nextLine();
           setMakhachsan(maks);
        }

        System.out.println("Chon ma khu vui choi ");
        String makhuvuichoi=sc.nextLine();
        while ( true ){
           c.docFile();
           if(c.timkiemma(makhuvuichoi)!=-1){
               break;
           }
           System.err.println("ma khu vui choi ban chon chua chinh xac !");
           System.err.println(" Vui long nhan Enter de nhap lai ");
           sc.nextLine();
           System.out.println("Nhap lai ma khu vui choi");
           String makvc=sc.nextLine();
           setMakhuvuichoi(makvc);
        }
        
        System.out.print("Nhap ma ke hoach tour: ");
        makht=sc.nextLine();
        while(true){
            dskht.writeDataToFile();
            if(dskht.TimKiem(makht)!= -1 ){
                break;

            }
            System.err.println("Ma ke hoach chua dung hoac khong ton tai");
            System.err.println("vui long nhan Enter nhap lai");
            sc.nextLine();
            dskht.Xuat();
            System.out.println("nhap lai ma ke hoach tour");
            String ma=sc.nextLine();
            setMakht(ma);
        }
        System.out.print("Nhap ngay :");
        ngay=sc.nextLine();
        NgayThangNam validator = new KiemTraDinhDang("dd/MM/yyyy");
        while(!validator.Check(ngay)){
            System.err.println("Nhap sai dinh dang ngay . Dinh dang ngay dung la : dd/MM/yyyy");
            System.err.println(" Nhan Enter de nhap lai: ");
            sc.nextLine();
            System.out.println("nhap lai ngay ");
            setNgay(ngay);
        }
        while (true){
            dskht.readDataFromFile();
            if(changeday(ngay).compareTo(changeday(dskht.NgayDiTimThay((makht))))>0 && changeday(ngay).compareTo(changeday(dskht.NgayVeTimThay(makht)))<0){
                break;
            }
            System.err.println("Ngay ban nhap khong ton tai hoac khong dung");
            System.err.println("Nhan Enter de nhap lai:");
            sc.nextLine();
            System.out.println("Nhap lai ngay :");
            setNgay(ngay);
        }

        while(true) {
            d.docFile();
            if(d.FindDay(ngay)!=-1){
                break;
            }
            System.err.println("Ngay ban nhap khong ton tai hoac khong dung ");
            System.err.println(" Vui long nhan Enter de nhap lai :");
            sc.nextLine();
            System.out.println("Nhap lai ngay :");
            setNgay(ngay);
        }
        
        HoatDong();
        
        System.out.println("Nhap ma hoa don chi");
        mahoadonchi=sc.nextLine();
         while(true){
            e.readDataFromFile();
            if(e.timkiemma(makht)!= -1 ){
                break;

            }
            System.err.println("Ma hoa don chua dung hoac khong ton tai");
            System.err.println("vui long nhan Enter nhap lai");
            sc.nextLine();
            dskht.Xuat();
            System.out.println("nhap lai ma hoa don");
            String id=sc.nextLine();
            setMahoadonchi(id);
        }

        }

    
    public Date changeday(String day){
        String pattern ="dd/MM/yyyy";
        SimpleDateFormat sdf=new SimpleDateFormat(pattern);
        try{

            return sdf.parse(day);

        } catch (ParseException e){
            e.printStackTrace();
            return null;
        }

    }
    public void xuat() {
        System.out.format("%10s | ", makht);
        System.out.format("%10s | ", manhahang);
        System.out.format("%10s | ", makhachsan);
        System.out.format("%10s | ", makhuvuichoi);
        System.out.format("%10s | ", mahoadonchi);
        System.out.format("%10s | ", tongchiphi);
        System.out.format("%15s%n" , ngay);
    }
}
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class test {
    public static void main(String [] args) throws IOException
    {
        DanhSachKeHoachTour kht = new DanhSachKeHoachTour();
        DSCTKH ctkh = new DSCTKH();
        DanhSachTour dst = new DanhSachTour();
        DSNH nh = new DSNH();
        DSKS ks = new DSKS();
        DSVC vc = new DSVC();
        DanhSachHoaDonChi hdc = new DanhSachHoaDonChi();
       // hdc.nhap();
        hdc.readDataFromFile();
        hdc.xuat();
        // nh.docFile();
        // ks.docFile();
        // vc.docFile();
        // nh.xuat();
        // ks.xuat();
        // vc.xuat();
        // kht.Nhap();
        // kht.readDataFromFile();
         
        //ctkh.docFile();
        
    }    
        
}

    




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
        DanhSachTour dst = new DanhSachTour();
        dst.readDataFromFile();
        dst.Xuat();
        kht.Nhap();
    }       
}
    




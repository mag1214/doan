import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class test {
    public static void main(String [] args) throws IOException
    {
        DSHDT hd = new DSHDT();
        hd.readDataFromFile();
        hd.Menu();
        DSChiTietHDT ct = new DSChiTietHDT();
        ct.readDataFromFile();
        ct.xuat();
    }       
}
    




import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class test {
    public static void main(String [] args) throws IOException
    {
        DSKH a = new DSKH();
        a.readDataFromFile();
        a.xuat();
    }       
}
    




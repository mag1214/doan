import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class test {
    public static void main(String [] args) throws IOException
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            // Chuỗi ngày 1
            String dateString1 = "10/12/2023";
            Date date1 = dateFormat.parse(dateString1);

            // Chuỗi ngày 2
            String dateString2 = "15/12/2023";
            Date date2 = dateFormat.parse(dateString2);

            // Chuyển đổi thành LocalDate
            LocalDate localDate1 = date1.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
            LocalDate localDate2 = date2.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();

            // Tính khoảng cách giữa hai ngày
            long daysBetween = ChronoUnit.DAYS.between(localDate1, localDate2);
            System.out.println("Khoảng cách giữa hai ngày là: " + daysBetween + " ngày");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
    




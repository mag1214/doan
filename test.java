import java.io.IOException;

public class test {
    public static void main(String [] args) throws IOException
    {
        DSVC vc = new DSVC();
        DSNH nh = new DSNH();
        DSKS ks = new DSKS();
        DanhSachTour dst = new DanhSachTour();
        DanhSachKeHoachTour kht = new DanhSachKeHoachTour();
        // vc.docFile();
        // vc.xuat();
        // nh.docFile();
        // nh.xuat();
        // kht.readDataFromFile();
        // kht.Xuat();
        // dst.readDataFromFile();
        // dst.Xuat();
        kht.readDataFromFile();
        kht.Xuat();
        // ks.sua();
    }
}




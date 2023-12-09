
public class test {
    public static void main(String [] args)
    {
        DanhSachTour dst = new DanhSachTour();
        DanhSachKeHoachTour kht = new DanhSachKeHoachTour();
        dst.DocDuLieuTuFile();
        kht.DocDuLieuTuFile();
        //dst.DocDuLieuTuFile();
        dst.Xuat();
        kht.Xuat();
       //dst.DocDuLieuTuFile();
        //dst.Xuat();
        //dst.TimKiemNoiDen();
      // dst.Them();
    }
}


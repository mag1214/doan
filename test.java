import java.io.IOException;

public class test {
    public static void main(String [] args) throws IOException
    {
        DanhSachNhanVien nv = new DanhSachNhanVien();
        //nv.nhap();
        DanhSachTour t = new DanhSachTour();
        t.Xuat();
    }
}

// public void Nhapcung()
//     {
//         kht = new KeHoachTour[10];
//         kht[0] = new KeHoachTour("KH1","T3","NV1","19/08/2023","22/08/2023");
//         kht[1] = new KeHoachTour("KH2","N2","NV6","22/02/2023","01/03/2023");
//         kht[2] = new KeHoachTour("KH3","N5","NV2","15/05/2023","22/05/2023");
//         kht[3] = new KeHoachTour("KH4","T1","NV4","12/05/2023","14/05/2023");
//         kht[4] = new KeHoachTour("KH5","T4","NV3","22/11/2023","25/11/2023");
//         GhiDuLieuVaoFile();
//     }

//  public void NhapCung()
//     {
//         n=10;
//         dst =new Tour[10];
//         dst[0] = new TourTrongNuoc("T1","Du Thuyen Ha Long","TPHCM","Vinh Ha Long","12/05/2023","Quang Ninh");
//         dst[1] = new TourTrongNuoc("T2","Kham Pha Da Lat Ngan Hoa","TPHCM","Da Lat","15/03/2023","Lam Dong");
//         dst[2] = new TourTrongNuoc("T3","Du Lich Nam Du","TPHCM","Nam Du","19/08/2023","Kieng Giang");
//         dst[3] = new TourTrongNuoc("T4","Du Lich Hon Son","TPHCM","Hon Son","22/11/2023","Kieng Giang");
//         dst[4] = new TourTrongNuoc("T5","Du Lich Mui Ne","TPHCM","Mui Ne","16/02/2023","Binh Thuan");
//         dst[5] = new TourNgoaiNuoc("N1","Truot tuyet-Notte Word","TPHCM","Seoul","15/06/2023","Han Quoc","10/09/2023");
//         dst[6] = new TourNgoaiNuoc("N2","Co Bac Thuy Tran","TPHCM","Bac Kinh","22/02/2023","Trung Quoc","20/05/2023");
//         dst[7] = new TourNgoaiNuoc("N3","Bo Tay Hoa Ky","TPHCM","Los angeles","21/12/2023","Hoa Ky","20/03/2024");
//         dst[8] = new TourNgoaiNuoc("N4","Buffet Toi 86 Tang","TPHCM","Bangkok","15/01/2023","Thai Lan","10/03/2023");
//         dst[9] = new TourNgoaiNuoc("N5","Vuong Quoc Anh","TPHCM","Lan Don","15/05/2023","Anh","06/10/2023");
//         GhiDuLieuVaoFile();
//     }
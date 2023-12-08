
public class test {
    public static void main(String [] args)
    {
        // Tour []dst = new Tour[10];
        // dst= new Tour[10];
        // dst[0] = new TourTrongNuoc("T1","Du Thuyen Ha Long","TPHCM","Vinh Ha Long","12/05/2019","Quang Ninh");
        // dst[1] = new TourNgoaiNuoc("N1","Truot tuyet-Notte Word","HaNoi","Seoul","15/06/2020","Han Quoc","10/07/2020");
        // dst[2] = new TourNgoaiNuoc("N2","Co Bac Thuy Tran","Ha Noi","Bac Kinh","22/02/2022","Trung Quoc","20/03/2022");
        // dst[3] = new TourTrongNuoc("T1","Kham Pha Da Lat Ngan Hoa","TPHCM","Da Lat","15/03/2023","Lam Dong");
        // for(int i=0; i<4; i++)
        // {
        //     dst[i].Xuat();
            
        // }
        DanhSachTour dst = new DanhSachTour();
        //dst.NhapCung();
       dst.DocDuLieuTuFile();
       dst.Xuat();
      // dst.Them();
    }
}

//  public void DuLieuCung()
//     {
//         n=5;
//         kht = new KeHoachTour[n];
//         kht[0]= new KeHoachTour("KH1", dst.MaTourTimThay(0), "NV1", "24/05/2000", "30/5/2000");
//         kht[1]= new KeHoachTour("KH2", dst.MaTourTimThay(1), "NV2", "07/05/2010", "30/5/2010");
//         kht[2]= new KeHoachTour("KH3", dst.MaTourTimThay(2), "NV3", "11/05/2016", "30/5/2016");
//         kht[3]= new KeHoachTour("KH4", dst.MaTourTimThay(3), "NV4", "19/05/2018", "30/5/2018");
//         kht[4]= new KeHoachTour("KH5", dst.MaTourTimThay(4), "NV5", "11/05/2019", "30/5/2019");
//     }
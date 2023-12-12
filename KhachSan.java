import java.util.Scanner;

public class KhachSan {
    private String makhachsan;
    private String diadiem;
    private double chiphi;
    private String ten;
    DSKS dsks;
    Scanner scanner =new Scanner (System.in);

    public KhachSan(){

    }
    public KhachSan(String makhachsan, String diadiem, double chiphi, String ten) {
        this.makhachsan=makhachsan;
        this.diadiem = diadiem;
        this.chiphi = chiphi;
        this.ten=ten;
    }
    public KhachSan(KhachSan ks){
        this.makhachsan=ks.makhachsan;
        this.diadiem=ks.diadiem;
        this.chiphi=ks.chiphi;
        this.ten=ks.ten;
    }


    public String getMakhachsan() {
        return makhachsan;
    }

    public void setMakhachsan(String makhachsan) {
        this.makhachsan = makhachsan;
    }

    public String getDiadiem() {
        return diadiem;
    }

    public void setDiadiem(String diadiem) {
        this.diadiem = diadiem;
    }

    public double getChiphi() {
        return chiphi;
    }

    public void setChiphi(double chiphi) {
        this.chiphi = chiphi;
    }

    public String getTen(){
        return ten;
    }

    public void setTen(String ten){
        this.ten=ten;
    }

    public void nhap (){
        System.out.print("Nhap ma khach san: ");
        makhachsan= scanner.nextLine();
        while ( true ) {
            dsks.docFile();
            if(dsks.timkiemma(makhachsan)!=-1){
                break;
            }
            System.err.println(" Ma ban nhap khong dung hoac khong ton tai ");
            System.err.println(" Vui long nhan Enter de nhap lai ");
            scanner.nextLine();
            System.out.println("Nhap lai ma ");
            String id = scanner.nextLine();
            setMakhachsan(id);
            
        }

        System.out.print("Nhap dia diem: ");
        diadiem = scanner.nextLine();
        while (true){
            if(diadiem.length()!=0){
                break;
            }
            System.err.println(" dia diem khong duoc de trong ");
            System.err.println(" vui long nhan Enter de nhap lai ");
            scanner.nextLine();
            System.out.println("Nhap lai");
            String dd=scanner.nextLine();
            setDiadiem(dd);
        }

        System.out.print("Nhap ten : ");
        ten= scanner.nextLine();
        while(true){
            if(ten.length()!=0){
                break;
            }
            System.err.println(" Ten khong duoc de trong ");
            System.err.println(" Vui long nhan Enter de nhap lai ");
            scanner.nextLine();
            System.out.println("Nhap lai");
            String name=scanner.nextLine();
            setTen(name);
        }

        System.out.print("Nhap chi phi: ");
        chiphi = scanner.nextDouble();
        scanner.nextLine();
    }

    public void xuat() {
        System.out.format("%10s | ", makhachsan);
        System.out.format("%10s | ", diadiem);
        System.out.format("%10s | ",ten);
        System.out.format("%15s%n", chiphi);
}
}
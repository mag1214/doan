import java.util.Scanner;

public class VuiChoi {
    private String makhuvuichoi;
    private String diadiem;
    private double chiphi;
    private String ten;
    DSVC dsvc;

    Scanner scanner =new Scanner (System.in);

    public VuiChoi(){

    }
    public VuiChoi(String makhuvuichoi, String diadiem,String ten, double chiphi) {
        this.makhuvuichoi=makhuvuichoi;
        this.diadiem = diadiem;
        this.ten=ten;
        this.chiphi = chiphi;
    }
    public VuiChoi(VuiChoi vc){
        this.makhuvuichoi=vc.makhuvuichoi;
        this.diadiem=vc.diadiem;
        this.ten=vc.ten;
        this.chiphi=vc.chiphi;
    }


    public String getMakhuvuichoi() {
        return makhuvuichoi;
    }

    public void setMakhuvuichoi(String makhuvuichoi) {
        this.makhuvuichoi = makhuvuichoi;
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
        System.out.print("Nhap ma khu vui choi: ");
        makhuvuichoi= scanner.nextLine();
        while(true){
            dsvc.docFile();
            if(dsvc.timkiemma(makhuvuichoi)!=-1){
                break;
            }
            System.err.println("Ma ban nhap khong dung hoac khong ton tai");
            System.err.println("Vui long nhap lai ma");
            scanner.nextLine();
            System.out.println("Nhap lai ma");
            String ma=scanner.nextLine();
            setMakhuvuichoi(ma);
        }

        System.out.print("Nhap dia diem: ");
        diadiem = scanner.nextLine();
        while(true){
            if(diadiem.length() !=0){
                break;
            }
            System.err.println(" Dia diem khong duoc de trong");
            System.err.println(" Vui long nhan Enter de nhap lai");
            scanner.nextLine();
            System.out.println(" Vui long nhap lai ");
            String dd=scanner.nextLine();
            setDiadiem(dd);
        }
 
        System.out.print("Nhap ten: ");
        ten= scanner.nextLine();
        while( true ) {
            if(ten.length()!=0){
                break;
            }
            System.err.println(" Ten khong duod de trong ");
            System.err.println(" vui long nhan Enter de nhap lai");
            scanner.nextLine();
            System.out.println(" Nhap lai ");
            String name=scanner.nextLine();
            setTen(name);
        }


        System.out.print("Nhap chi phi: ");
        chiphi = scanner.nextDouble();
        scanner.nextLine();
    }

    public void xuat() {
        System.out.format(" %10s | %15s | %10s | %15s ||\n", makhuvuichoi, diadiem, ten, chiphi);

    }
}
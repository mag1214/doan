
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class DanhSachKeHoachTour {
    int n,a=0;
    static KeHoachTour[] kht;
    DanhSachTour dst;
    Scanner sc = new Scanner(System.in);
    public DanhSachKeHoachTour(){}
    public DanhSachKeHoachTour(int n) 
    {
        this.n = n;
        kht = new KeHoachTour[n];
    }
    public void swapMa(String macu, String mamoi)
    {
        for(int i=0; i<n; i++)
        {
            if(macu.equals(kht[i].getMaTour()))
            {
                kht[i].setMaTour(mamoi);
            }
            
        }
    }
    public void Nhap()
    {
        System.out.print("Nhap so danh sach ke hoach: ");
        n = sc.nextInt();
        sc.nextLine();
        kht = new KeHoachTour[n];
        for(int i = 0; i < n; i++)
        {
            System.out.print("NHAP LAI KE HOACH THU "+(i+1)+"\n");
            kht[i]=new KeHoachTour();
            kht[i].Nhap();
            GhiDuLieuVaoFile();
            if(i>0)
                MaDuyNhat(i);
        }
    }
    public void MaDuyNhat(int i) {
		DocDuLieuTuFile();
		String MaKeHoach;
		String mkh = kht[i].getMaKeHoach();
		do {
			if(KiemTraMKH(mkh, i)) {
				System.out.println();
				Xuat();
				System.err.println("\nKe hoach thu " + (i+1) + " co ma " + mkh + " bi trung ma ke hoach. An enter de tiep tuc");
				sc.nextLine();
				System.err.print("Nhap Lai Ma: ");
				MaKeHoach = sc.nextLine();
				kht[i].setMaKeHoach(MaKeHoach);
				GhiDuLieuVaoFile();
				mkh = kht[i].getMaKeHoach();
			}
		}while(KiemTraMKH(mkh, i));
	}
    public boolean KiemTraMKH(String makehoach, int k) {
		for(int i = a - 1; i >= 0; i--) {
			if(kht[i].getMaKeHoach().indexOf(makehoach) != -1 && i!= k) {
				return true;
			}
		}
		return false;
	}
    
    public void Xuat()
    {   
        n=kht.length;
        System.out.println("======================DANH SACH KE HOACH TOUR===================");
        System.out.format("|| %9s |%9s |%7s |%12s |%12s ||\n",
                  "MaKeHoach", "MaTour", "MaNhanVien", "NgayDi", "NgayVe");
        try
        {
            for(int i=0; i<n; i++)
            {
                kht[i].Xuat();
                System.out.println();
            }
        }catch(NullPointerException npe) {
			
		}
        
        System.out.println("================================================================");
    }
    public String NgayDiTimThay(String Ma)
    {
        return kht[TimKiem(Ma)].getNgaydi();
    }
    public String NgayVeTimThay(String Ma)
    {
        return kht[TimKiem(Ma)].getNgayVe();
    }
    public void Them()
    {
        int i=n;
        System.out.println("======Nhap ke hoach muon them vao======");
        kht = Arrays.copyOf(kht,n+1);
        kht[n]= new KeHoachTour();
        kht[n].Nhap();
        n++;
        GhiDuLieuVaoFile();
        MaDuyNhat(i);
        System.out.println("======Da them ke hoach vao danh sach======");
    } 
    public void Them(KeHoachTour x)
    {
        int i=n;
        kht = Arrays.copyOf(kht,n+1);
        kht[n]=new KeHoachTour();
        KeHoachTour kh = new KeHoachTour(x);
        kht[n] = kh;
        n++;
        GhiDuLieuVaoFile();
        MaDuyNhat(i);
        System.out.println("======Da them ke hoach vao danh sach======");
    }
    public void Sua()
    {
        n=kht.length;
        int a;
        String MaSo;
        KeHoachTour SuaSv= new KeHoachTour();
        System.out.print("Nhap ma so can sua: ");
        MaSo=sc.nextLine();
        a=TimKiem(MaSo);
        if(a!=-1)
        {
            System.out.println("======NHAP THONG TIN KE HOACH CAN SUA======");
            SuaSv.Nhap();
            kht[a]=SuaSv;
            GhiDuLieuVaoFile();
            MaDuyNhat(a);
        }
        else
        {
            System.out.println("Khong tim thay");
        }
    }
    
    public void Sua(String x)
    {
        n=kht.length;
        int a=TimKiem(x);
        KeHoachTour SuaSv= new KeHoachTour();
        if(a!=-1)
        {
            System.out.println("======NHAP THONG TIN KE HOACH CAN SUA======");
            SuaSv.Nhap();
            GhiDuLieuVaoFile();
            kht[a]=SuaSv;
            GhiDuLieuVaoFile();
            MaDuyNhat(a);
        }
        else
            System.out.println("Khong tim thay");
    }
    public void XoaMa()
    {
        n=kht.length;
        int a;
        String MaSo;
        System.out.print("Nhap ma so can xoa: ");
        MaSo=sc.nextLine();
        a=TimKiem(MaSo);
        if(a!=-1)
        {
            for(int i=a; i<n-1; i++)
                kht[i]=kht[i+1];
            kht = Arrays.copyOf(kht,n-1);
            n--;
            GhiDuLieuVaoFile();
        }
        else
        {
            System.out.println("Khong tim thay ");
        }
    }
        //Xoa theo ma so co tham so
    public void XoaMa(String Ma)
    {
        n=kht.length;
        int a=TimKiem(Ma);
        if(a!=-1)
        {
            for(int i=a; i<n-1; i++)
                kht[i]=kht[i+1];
            kht = Arrays.copyOf(kht,n-1);
            n--;
            GhiDuLieuVaoFile();
        }
        else 
            System.out.println("Khong tim thay ");
    }
    public void TimKiem()
    {
        n=kht.length;
        int flag=0;
        String MaSo;
        System.out.print("Nhap ma so can tim: ");
        MaSo=sc.nextLine();
        System.out.println("==================DANH SACH KE HOACH TOUR TIM THAY===============");
        System.out.format("|| %9s |%9s |%7s |%12s |%12s ||\n",
        "MaKeHoach", "MaTour", "MaNhanVien", "NgayDi", "NgayVe");
        for(int i=0; i<n; i++)
        {
            if(kht[i].getMaKeHoach().equals(MaSo))
            {
                kht[i].Xuat();
                flag=1;
            }
        }
        if(flag==0)
        {
            System.out.println("khong tim thay ");
        }
        System.out.println("=================================================================");
    }
    //Tim kiem  theo ma so co tham so int
    public int TimKiem(String Ma)
    {
        n=kht.length;
        int flag=0;
        for(int i=0; i<n; i++)
        {
            if(kht[i].getMaKeHoach().equals(Ma))
            {
                flag=i;
                break;
            }
        }
        return flag;
    }
    //Tim kiem  theo ma so co tham so theo kieu Sinhvien
    public KeHoachTour TimKiemm(String Ma)
    {
        n=kht.length;
        KeHoachTour flag=null;
        System.out.println("==================DANH SACH KE HOACH TOUR TIM THAY===============");
        System.out.format("|| %9s |%9s |%7s |%12s |%12s ||\n",
        "MaKeHoach", "MaTour", "MaNhanVien", "NgayDi", "NgayVe");
        for(int i=0; i<n; i++)
        {
            if(kht[i].getMaKeHoach().equals(Ma))
            {
                kht[i].Xuat();
                flag=kht[i];
            }
        }
        System.out.println("==================================================================");
        return flag;
    }
    public String TachNgay(String s)
    {
        String[] NgayThangNam = s.split("/");
        String Ngay=NgayThangNam[0];
        return Ngay;
    }
    public void TimKiemNgayDi()
    {
        n=kht.length;
        int flag=0;
        String Ngay;
        System.out.print("Nhap ngay di: ");
        Ngay=sc.nextLine();
        System.out.println("==================DANH SACH KE HOACH TOUR TIM THAY===============");
        System.out.format("|| %9s |%9s |%7s |%12s |%12s ||\n",
        "MaKeHoach", "MaTour", "MaNhanVien", "NgayDi", "NgayVe");
        for(int i=0; i<n; i++)
        {
            if(kht[i].getNgaydi().contains(Ngay))
            {
                kht[i].Xuat();
                flag=1;
            }
        }
        if(flag==0)
        {
            System.out.println("khong tim thay ");
        }
        System.out.println("================================================================");
    }
    public void GhiDuLieuVaoFile()
    {
        n = kht.length;
        try
        {
            DataOutputStream out = new DataOutputStream(new FileOutputStream("KeHoachTour.txt"));
            try
            {
                for(int i = 0; i < n; i++) {
                out.writeUTF(kht[i].getMaKeHoach());
                out.writeUTF(kht[i].getMaTour());
                out.writeUTF(kht[i].getMaNhanVien());
                out.writeUTF(kht[i].getNgaydi());
                out.writeUTF(kht[i].getNgayVe());
                }
            }
            catch(NullPointerException npe) {}
            out.close();
        }   
        catch(IOException e) 
        {
            e.printStackTrace();    
        }
    }

    public void DocDuLieuTuFile() {
       kht = new KeHoachTour[100];
        int i = 0;
        try {
            DataInputStream in = new DataInputStream(new FileInputStream("KeHoachTour.txt"));
            try {
                while(true) {
                    kht[i] = new KeHoachTour();
                    kht[i].setMaKeHoach(in.readUTF());
                    kht[i].setMaTour(in.readUTF());
                    kht[i].setMaNhanVien(in.readUTF());
                    kht[i].setNgaydi(in.readUTF());
                    kht[i].setNgayVe(in.readUTF());
                    i++;
                }
            } catch (EOFException e) {

            } finally {
                a = i;
                n = i;
                kht = Arrays.copyOf(kht, n);
                in.close();
            }
        } catch (IOException e) {
       
        }
    }

    public void NamToChuc()
    {
        int Count1=0, Count2=0, Count3=0, Count4=0;
        
        for(int i=0; i<n; i++)
        {
            String nam=TachNam(kht[i].getNgaydi());
            int Nam= Integer.parseInt(nam);
            if(Nam>=2000 && Nam<2005)
                Count1++;
            else if (Nam>=2005 && Nam<2010)
                Count2++;
            else if(Nam>=2010 && Nam<2015)
                Count3++;
            else if(Nam>=2015 && Nam<=2020)
                Count4++;
        }
        System.out.println("===========Cac_Nam_To_Chuc===========");
        System.out.println("| So Tour tu nam 2000 den 2004 | " +Count1+ " |");
        System.out.println("| So Tour tu nam 2005 den 2009 | " +Count2+ " |");
        System.out.println("| So Tour tu nam 2010 den 2014 | " +Count3+ " |");
        System.out.println("| So Tour tu nam 2015 den 2020 | " +Count4+ " |");
        System.out.println("=====================================");
    }
    public String TachNam(String s)
    {
        String[] NgayThangNam = s.split("/");
        String Nam=NgayThangNam[NgayThangNam.length-1];
        return Nam;
    }
    
   
}

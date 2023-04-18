
package lab2;

import java.util.Scanner;


public class lophocphan {
    String malhp;
    String tenlhp;
    String tengv;
    String thongtinlophoc;
    sinhvien dssv;
    @Override
    public String toString(){
        return "";
    }
    void lophocphan(String malhp,String tenlhp,String tengv,String thongtinlophoc,sinhvien dssv){
        this.dssv=dssv;
        this.malhp=malhp;
        this.tengv=tengv;
        this.thongtinlophoc=thongtinlophoc;
        this.tenlhp=tenlhp;
    }
    String getMalhp(){
        return malhp;
    }
    void setMalhp(String malhp){
        this.malhp=malhp;
    }
    String getTenlhp(){
        return tenlhp;
    }
    void setTenlhp(String tenlhp){
        this.tenlhp=tenlhp;
    }
    String getTengv(){
        return tengv;
    }
    void setTengv(String tengv){
        this.tengv=tengv;
    }
    String getThongtinlophoc(){
        return thongtinlophoc;
    }
    void setThongtinlophoc(String thongtinlophoc){
       this.thongtinlophoc=thongtinlophoc;
    }
    sinhvien getDssv(){
        return dssv;
    }
    void setHoten(sinhvien dssv){
        this.dssv=dssv;
    }
    void nhap(){
        Scanner sc = new Scanner(System.in);
      System.out.println("nhập mã lhp  ");
      malhp=sc.nextLine();
      System.out.println("nhập tên lhp ");
      tenlhp=sc.nextLine();
      System.out.println("nhập tên giảng viên ");
      tengv = sc.nextLine();
      System.out.println("nhập thông tin buổi học ");
      thongtinlophoc= sc.nextLine();
  }
}


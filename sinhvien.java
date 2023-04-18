
package lab2;

import java.util.Scanner;


public class sinhvien {
    String masv;
    String hoten;
    public void sinhvien(String masv,String hoten){
        this.hoten=hoten;
        this.masv=masv;
    }

   
    @Override
    public String toString(){
        return "";
    }
    String getMasv(){
        return masv;
    }
    void setMasv(String masv){
        this.masv=masv;
    }
    String getHoten(){
        return hoten;
    }
    void setHoten(String hoten){
        this.hoten=hoten;
    }
    void nhap(){
    Scanner sc = new Scanner(System.in);
      System.out.println("nhập mã sv  ");
      masv=sc.nextLine();
      System.out.println("nhập tên lhp ");
      hoten=sc.nextLine();
     
}
    void xuat(){
        
    }
}

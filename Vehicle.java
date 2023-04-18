
package lab1.th;

import java.util.Scanner;


public class Vehicle {
  String ten;
  String loai;
  double  dungtich,trigia,thue;
  public void Vehicle(String ten, String loai, double  dungtich,double trigia,double thue){    
  this.ten=ten; 
  this.loai=loai;
  this.dungtich=dungtich;  
  this.thue=thue;
  this.trigia=trigia;
}
  public String getTen(){
      return ten;
  }
  public void setTen(String ten){
      this.ten=ten;
  }
  public String getLoai(){
      return loai;
  }
  public void setLoai(String loai){
      this.loai=loai;
  }
  public double getDungtich(){
      return dungtich;
  }
  public void setDungtich(double dungtich){
      this.dungtich=dungtich;
  }
  public double getTrigia(){
      return trigia;
  }
  public void setTrigia(double trigia){
      this.trigia=trigia;
  }
  public double getThue(){
     if(getDungtich()<100){
         return  (double) (getTrigia()*0.01);
     }
     if(getDungtich()>=100&&getDungtich()<=200){
         return (double) (getTrigia()*0.03);
     }
     if(getDungtich()>200){
         return (double) (getTrigia()*0.05);
     }
      return thue;
  }
  public void setThue(double thue){
      this.thue=thue;
  }
  public void nhap(){
      Scanner sc = new Scanner(System.in);
      System.out.println("nhập tên");
      ten = sc.nextLine();
      System.out.println("nhập loại xe");
      loai= sc.nextLine();
      System.out.println("nhập dung tích");
      dungtich=sc.nextFloat();
      System.out.println("nhập trị giá");
      trigia=sc.nextFloat();
  }
  public void xuat(){
      System.out.println("tên chủ xe: "+getTen()+" loại xe: "+getLoai()+ " dung tích: " +getDungtich()+" trị giá: "+getTrigia()+" thuế phải nộp "+getThue());
  }
  
}
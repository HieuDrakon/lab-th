
package lab2;

import java.util.ArrayList;
import java.util.Scanner;
public class quanly {
    ArrayList<sinhvien> sv =new ArrayList<>();
   // ArrayList<lophocphan> lhp =new ArrayList<>();
    public void them(sinhvien a) {
Scanner sc = new Scanner(System.in);
System.out.print("Nhập số lượng cần thêm: ");
int n = sc.nextInt();
for (int i = 0; i < n; i++) {
System.out.println("Lần nhập thứ " + (i + 1) + ": ");
a= new sinhvien();
a.nhap();
sv.add(a);
}
}
    void xuat(){
         for(sinhvien v:sv){
       
    }
    }
}

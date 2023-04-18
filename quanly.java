
package lab1.th;

import java.util.ArrayList;
import java.util.Scanner;


public class quanly {
    ArrayList<Vehicle> v= new ArrayList<>();

public void quanly(){

}
public void them(Vehicle a) {
Scanner sc = new Scanner(System.in);
System.out.print("Nhập số lượng cần thêm: ");
int n = sc.nextInt();
for (int i = 0; i < n; i++) {
System.out.println("Lần nhập thứ " + (i + 1) + ": ");
a= new Vehicle();
a.nhap();

v.add(a);
}
}

public void xuat(){
    for(Vehicle v:v){
        v.xuat();
    }
}
public void menuChinh() {
    System.out.println("------menu------");
    System.out.println("1. Nhập thông tin ");
    System.out.println("2. xuất thông tin");
    System.out.println("3. thoát");
}
}

package lab1.th;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        quanly ql=new quanly();
        Vehicle b=new Vehicle();
    int n;
Scanner sc= new Scanner(System.in);
do
{
ql.menuChinh();
System.out.print("Lựa chọn: ");
n= sc.nextInt();
switch(n)
{
case 1:
{
ql.them(b);
break;
}
case 2:
{
    ql.xuat();
    break;
}
case 3:
    break;
}
}while(n!=3);
}
}


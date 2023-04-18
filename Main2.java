
package lab1b;
import java.util.Scanner;
public class Main2 {
    private static Scanner scanner;

	public static void main(String[] args) {
        scanner = new Scanner(System.in);
        HangThucPham tp = new HangThucPham();
        boolean kt = true;
        boolean th = true;
        System.out.println("Nhap ma hang : ");
        tp.setMaHang(scanner.nextInt());
        scanner.nextLine();
        do {
            System.out.println("Nhap ten hang : ");
            tp.setTenHang(scanner.nextLine());
        } while (tp.kiemTraTenHang(kt));
        System.out.println("Nhap đon gia : ");
        tp.setDonGia(scanner.nextDouble());
        do {
            System.out.println("Nhap nam,thang,ngay san xuat : ");
            tp.setNSX(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            System.out.println("nhap nam,thang,ngay het han : ");
            tp.setHSD(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        } while (tp.kiemTraNgay(th));
        System.out.println(tp);
        tp.kiemTraHSD();
    }

    private Main2() {
    }
}
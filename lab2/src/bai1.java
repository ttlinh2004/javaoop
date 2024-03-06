import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.print("Nhap so thu nhat a =");
            double a = sc.nextDouble();
            System.out.print("Nhap so thu hai b =");
            double b = sc.nextDouble();

            double Tong = a + b;
            System.out.println("Tong la: " + Tong);
            double Hieu = a - b;
            System.out.println("Hieu la: " + Hieu);
            double Tich = a * b;
            System.out.println("Tich la:" + Tich);
            double Thuong = a / b;
            System.out.println("Thuong la:" + Thuong);
            double PhanDu = a % b;
            System.out.println("Chia lay du" + PhanDu);

            if (a > b) {
                System.out.println(a + " lon hon " + b);
            } else if (a < b) {
                System.out.println(a + " nho hon " + b);
            } else {
                System.out.println(a + " bang " + b);
            }
            
            if (a == b) {
                System.out.println("Hai so bang nhau");
            }
            
            if (a != b) {
                System.out.println("Hai so khong bang");
            }
            
            sc.close();
    }
}
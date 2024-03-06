import java.util.Scanner;

public class giaiphuongtrinhbac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("He so A =");
        double a = sc.nextDouble();
        System.out.print("He so B =");
        double b = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.print("Phuong trinh co vo so nghiem.");
            } else {
                System.out.print("Phuong trinh vo nghiem.");
            }
        } else {
            double x = -b / a;
            System.out.print("Phuong trinh co nghiem duy nhat la: " + x);
        }
        
        sc.close();
    }
}

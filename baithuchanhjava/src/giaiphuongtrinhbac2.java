import java.util.Scanner;

public class giaiphuongtrinhbac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap so A: ");
        double A = sc.nextDouble();
        System.out.print("Nhap so B: ");
        double B = sc.nextDouble();
        System.out.print("Nhap so C: ");
        double C = sc.nextDouble();

        double delta = B*B - 4 *A *C;

         if (delta < 0) {
          System.out.println("Phuong trinh vo nghiem");  
         } else if (delta == 0) {
            double x = -B/(2 *A);
            System.out.println("Phuong trinh co nghiem kep");
            System.out.println("x = " + x);
         } else if (delta > 0) {
            double x1 = (-B + Math.sqrt(delta)) / (2 *A);
            double x2 = (-B - Math.sqrt(delta)) / (2 *A);
            System.out.println("Phuong trinh co hai nghiem phan biet");
            System.out.println("x1 =" + x1);
            System.out.println("x2= " + x2);
         }
         
         sc.close();
    }
}
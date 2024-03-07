import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, Tong = 0;

        do {
            System.out.print("Nhap vao so luong so nguyen: ");
            a = sc.nextInt();
        } while (a < 0);

        int[] b = new int[a];
        for(int i = 0; i < a; i++) {
            System.out.print("Phan tu thu " + (i+1) + " la: ");
            b[i] = sc.nextInt();
            Tong += b[i];
        }
        double TBC = Tong / a;
        System.out.println("Trung binh cong cua " + a + " la: " + TBC );

        sc.close();
    }
}

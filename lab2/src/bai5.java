import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (sum < 100) {
            System.out.print("Nhap so nguyen: ");
            int a = sc.nextInt();
            sum += a;
        }
        System.out.println("Tong cua cac so nguyen la: " + sum);

        sc.close();
    }
}

import java.util.Scanner;

public class slide47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        do {
            System.out.print("Nhap so nguyen : ");
            int a = sc.nextInt();
            sum += a;
        } while (sum < 100);
            System.out.println("Tong cac so nguyen la: " + sum);
            
        sc.close();
    }
}
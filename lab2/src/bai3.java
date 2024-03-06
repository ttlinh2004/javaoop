import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten: ");
        String ten = sc.nextLine();
        System.out.print("Nhap nam sinh:");
        int ngaysinh = sc.nextInt();

        int tuoi = 2024 - ngaysinh;

        if (tuoi < 16) {
            System.out.println("Ban " + ten + " o do tuoi vi thanh nien");
        } else if (tuoi >= 16 && tuoi < 18) {
            System.out.println("Ban " + ten + " o do tuoi truong thanh");
        } else {
            System.out.println("Ban " + ten + " da gia");
        }
        
        sc.close();
    }
}

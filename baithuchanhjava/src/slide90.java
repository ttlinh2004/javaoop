import java.util.Scanner;

public class slide90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao chuoi: ");
        String chuoi = sc.nextLine();

        System.out.println("Chuoi co cac ky tu la: ");
        for (int i = 0; i < chuoi.length(); i++) {
            System.out.println(chuoi.charAt(i));
        }
        
        sc.close();
    }
}

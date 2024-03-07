import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String chuoikitu;
        char kiTu;
        int countText = 0;

        do {
            System.out.print("Nhap chuoi ki tu: ");
            chuoikitu = sc.nextLine();
        } while( chuoikitu.length() > 80 );

        System.out.print("Nhap ki tu ma ban can do tim: ");
        kiTu = sc.next().charAt(0);

        for(int i = 0; i < chuoikitu.length(); i++) {
            if(chuoikitu.charAt(i) == kiTu ) {
                ++countText;
            }
        }
        System.out.println("So lan xuat hien " + kiTu + " la: " +countText);

        sc.close();
    }
}

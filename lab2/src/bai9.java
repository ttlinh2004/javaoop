import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao chuoi bat ki: ");
        String chuoi = sc.nextLine();

        int Normal = 0;
        int Caps = 0;
        int Numbers = 0;

        for(int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) >= 97 && chuoi.charAt(i) <= 122 ) {
                ++Normal;
            } else if (chuoi.charAt(i) >= 65 && chuoi.charAt(i) <= 90 ) {
                ++Caps;
            } else if (chuoi.charAt(i) >= 48 && chuoi.charAt(i) <= 57 ) {
                ++Numbers;
            } else {
                System.out.println("Chuoi khong xac dinh!");
            }
        }
        
        System.out.println("So ky tu thuong trong chuoi la: " +Normal);
        System.out.println("So ky tu hoa trong chuoi la: " +Caps);
        System.out.println("So ky tu so trong chuoi la: " +Numbers);
        
        sc.close();
    }
}

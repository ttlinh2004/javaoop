import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, GT = 1;

        do {
            System.out.print("Nhap mot so nguyen: ");
            a = sc.nextInt();
        } while (a < 0);

        System.out.print("Gia tri cua " + a + "! la: ");
        do {
            if(a == 0 ) continue;
            else {
                GT *= a;
                a --;
            }
            } while (a > 0);
        System.out.println(GT);

        sc.close();

    }
}

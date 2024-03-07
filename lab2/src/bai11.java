import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua mang A: ");
        int sophantu = sc.nextInt();

        int[] phantumang = new int[sophantu];
        for(int i = 0; i < phantumang.length; i++) {
            System.out.print("Nhap phan tu thu " +(i+1)+ " cua mang: ");
            phantumang[i] = sc.nextInt();
        }
        System.out.println();

        System.out.print("Mang truoc khi xep la: ");
        for(int i = 0; i < phantumang.length; i++) {
            System.out.print(phantumang[i] + " ");
        }
        System.out.println();
        for(int i = 0; i<phantumang.length; i++) {
            for(int j = i + 1; j < phantumang.length; j++) {
                if(phantumang[i] > phantumang[j]) {
                    int temp = phantumang[i];
                    phantumang[i] = phantumang[j];
                    phantumang[j] = temp;
                }
            }
        }

        System.out.print("Mang sau khi xep la: ");
        for(int i = 0; i < phantumang.length; i++) {
            System.out.print(phantumang[i] + " ");
        }

        sc.close();
    }
}

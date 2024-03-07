import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu hang ngang: ");
        int hangngang = sc.nextInt();
        System.out.print("Nhap so phan tu hang doc: ");
        int hangdoc = sc.nextInt();
        
        int[][] matran = new int[hangngang][hangdoc];
        for(int i = 0; i < matran.length; i++) {
            for(int j = 0;  j < matran[i].length; j++) {
                System.out.print("Nhap gia tri cho phan tu [" + (i+1) + "]" + "[" + (j+1) + "] la: ");
                matran[i][j] = sc.nextInt();
            }
        }

        int GTLN = matran[0][0];
        for(int i = 0 ;i < matran.length; i++) {
            for(int j = 0;j < matran[i].length; j++) {
                if(matran[i][j] >= GTLN) {
                    GTLN = matran[i][j];
                }
            }
        }
        System.out.println("Gia tri lon nhat trong ma tran la: " +GTLN);

        sc.close();
    }
}

import java.util.Scanner;

public class slide81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so hang cua ma tran: ");
        int m = sc.nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        int n = sc.nextInt();

        int A[][] = new int[m][n];
        System.out.println("Nhap cac phan tu cua ma tran: ");
        for (int i = 0; i < m; i++) {
            for ( int j = 0; j < n; j++) {
                System.out.print("A[" + i + "] [" + j + "]=");
                A[i][j] = sc.nextInt();
            }
        }
        // In ma trận ra màn hình
        System.out.println("Ma trận vừa nhập là:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        // Tìm phần tử có GTLN trong ma trận
        int max = A[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++ ) {
                if (max < A[i][j]) {
                    max = A[i][j];
                }
            }
        }
        System.out.println("Phan tu co gia tri lon nhat trong ma tran la: " + max);
        
        sc.close();
    }
}

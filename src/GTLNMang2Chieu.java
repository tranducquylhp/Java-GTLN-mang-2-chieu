import java.util.Scanner;

public class GTLNMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so hang: ");
        int row = scanner.nextInt();
        System.out.println("Nhap so cot: ");
        int col = scanner.nextInt();
        int[][] arr = new int [row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Nhap phan tu arr[" + i + "," + j + "]= ");
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int max = arr[0][0];
        int indexRow = 0;
        int indexCol = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    indexRow = i;
                    indexCol = j;
                }
            }
        }
        System.out.println("Gia tri lon nhat la " + max + " o hang " + indexRow + " cot " + indexCol);
    }
}

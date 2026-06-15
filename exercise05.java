import java.util.Scanner;

public class exercise05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Nhập kích thước mảng 2 chiều (số hàng và số cột)
        System.out.print("Nhập số hàng (rows): ");
        int rows = sc.nextInt();
        System.out.print("Nhập số cột (cols): ");
        int cols = sc.nextInt();

        // Khởi tạo mảng 2 chiều
        int[][] arr = new int[rows][cols];

        // 2. Nhập dữ liệu cho từng phần tử trong mảng
        System.out.println("--- Nhập giá trị cho mảng ---");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập phần tử tại vị trí [" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }

        // Khởi tạo biến lưu trữ tổng
        int sumEven = 0; // Tổng chẵn
        int sumOdd = 0;  // Tổng lẻ

        // 3. Xử lý: Duyệt mảng để tính tổng các số chẵn và số lẻ
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int currentValue = arr[i][j]; // Lấy giá trị hiện tại để dễ xử lý

                // Kiểm tra chẵn lẻ bằng toán tử Modulo (%)
                if (currentValue % 2 == 0) {
                    sumEven += currentValue; // Nếu chia hết cho 2 -> Cộng vào tổng chẵn
                } else {
                    sumOdd += currentValue;  // Ngược lại -> Cộng vào tổng lẻ
                }
            }
        }

        // 4. Hiển thị kết quả đầu ra
        System.out.println("===========================");
        System.out.println("Tổng các số chẵn trong mảng: " + sumEven);
        System.out.println("Tổng các số lẻ trong mảng: " + sumOdd);

    }
}

import java.util.Scanner;

public class exercise04 {
    public static void main(String[] args) {
        // Khởi tạo Scanner để đọc dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);

        // 1. Nhập kích thước mảng
        System.out.print("Nhập kích thước của mảng: ");
        int n = sc.nextInt();

        // 2. Xử lý: Kiểm tra kích thước rỗng
        if (n <= 0) {
            System.out.println("Kích thước rỗng");
            sc.close();
            return; // Dừng chương trình ngay lập tức
        }

        // Khởi tạo mảng số nguyên duy nhất
        int[] arr = new int[n];

        // 3. Nhập giá trị cho từng phần tử
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập giá trị phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // 4. Hiển thị mảng ban đầu
        System.out.print("Mảng ban đầu: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println(); // Xuống dòng

        // 5. Xử lý: Đảo ngược mảng (In-place)
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        // 6. Hiển thị mảng sau khi đảo ngược
        System.out.print("Mảng sau khi đảo ngược: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        // Đóng Scanner để giải phóng tài nguyên
        sc.close();
    }
}

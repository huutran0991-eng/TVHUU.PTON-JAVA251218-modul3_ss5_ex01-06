import java.util.Scanner;

public class exercise06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Nhập kích thước và mảng
        System.out.print("Nhập kích thước của mảng: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Kích thước mảng không hợp lệ.");
            return;
        }

        int[] arr = new int[n];
        System.out.println("--- Nhập các phần tử của mảng ---");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // 2. Sắp xếp chọn (Selection Sort) - Giảm dần
        selectionSortDescending(arr);

        System.out.print("\nMảng sau khi sắp xếp giảm dần: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();

        // 3. Nhập số cần tìm
        System.out.print("\nNhập số nguyên cần tìm: ");
        int target = sc.nextInt();

        // 4. Tìm kiếm Tuyến tính
        int linearIndex = linearSearch(arr, target);
        System.out.println(">> Kết quả Tìm kiếm tuyến tính: " +
                (linearIndex != -1 ? "Tìm thấy tại vị trí " + linearIndex : "Không tìm thấy."));

        // 5. Tìm kiếm Nhị phân
        int binaryIndex = binarySearchDescending(arr, target);
        System.out.println(">> Kết quả Tìm kiếm nhị phân: " +
                (binaryIndex != -1 ? "Tìm thấy tại vị trí " + binaryIndex : "Không tìm thấy."));

        sc.close();
    }

    // Phương thức Sắp xếp chọn (Giảm dần)
    public static void selectionSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i; // Giả định vị trí đầu tiên là lớn nhất
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j; // Cập nhật vị trí của số lớn hơn
                }
            }
            // Hoán đổi số lớn nhất tìm được về vị trí i
            if (maxIndex != i) {
                int temp = arr[maxIndex];
                arr[maxIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    // Phương thức Tìm kiếm tuyến tính
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Trả về chỉ số nếu tìm thấy
            }
        }
        return -1; // Không tìm thấy
    }

    // Phương thức Tìm kiếm nhị phân (Dành cho mảng GIẢM DẦN)
    public static int binarySearchDescending(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Tránh tràn bộ nhớ số nguyên

            if (arr[mid] == target) {
                return mid; // Tìm thấy
            }

            // Logic cho mảng GIẢM DẦN:
            // Nếu giá trị ở giữa NHỎ HƠN target, target phải nằm ở nửa BÊN TRÁI (nơi chứa các số lớn hơn)
            if (arr[mid] < target) {
                right = mid - 1;
            } else {
                left = mid + 1; // Ngược lại, target nằm ở nửa BÊN PHẢI
            }
        }
        return -1;
    }
}

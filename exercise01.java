import java.util.Scanner;

public class exercise01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // 配列を初期化
        System.out.print("Nhập kích thước của mảng: ");
        int SIZE = scanner.nextInt(); //　ユーザが入力したデータを記憶する
        int[] arr = new int[SIZE]; // 　記憶した後　Tạo mảng để hứng giá trị từ người dùng
        System.out.print("Nhập các giá trị cho mảng :\n");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(" Giá trị thứ" + (i + 1) + ":" );
            arr[i] = scanner.nextInt();
        }
        // Sắp xếp mảng bằng thuật toán sắp xếp chọn
        selectionSort(arr);
        // Đầu ra
        System.out.println("Mảng đã sắp xếp theo thứ tự giảm dần:");
        for(int value : arr){
            System.out.println(value);

        }
        // 最大値
        System.out.println("\nPhần tử lớn nhất trong mảng:" + arr[0]);
        }
public static void selectionSort(int[] arr) {
        int n = arr.length;
        // n -1 có nghĩa là có n phần tử nhưng khi xếp đến phần tử cuối cùng thì không cần (n-1)
        // Sắp xếp và chọn ra số lớn nhất nên phải dùng 2 vòng lặp FOR
        // Vong lặp 1 tìm ra giá trị  lớn nhất (Sắp xếp giảm dần)
        for (int i = 0; i < n - 1; i++) {
            int max = i; // tạo giá trị làm mốc
            // j = i + 1 nghĩa là i là bạn đã được cố định nên phải lấy bạn tiếp theo để so sánh
            // Vòng lặp 2 bắt đầu so sánh từng phần tử
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            // Hoán đổi phần tử lớn nhất với phần tử đầu tiên chưa được sắp xếp
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;

        }



    }



}

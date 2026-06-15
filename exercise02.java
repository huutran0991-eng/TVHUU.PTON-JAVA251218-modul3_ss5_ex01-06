import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 入力機
        System.out.print("Nhập kích thước mảng :");
        int SIZE = sc.nextInt(); // ユーザが入力したキーボードを記憶する
        int[] arr = new int[SIZE]; // 価値を受け取るカゴ
        for(int i = 0; i < SIZE; i++) {
            System.out.print("Giá trị phần tử thứ " + (i +1) + ":");
            arr[i] = sc.nextInt(); // 価値を受け取るカゴ
        }
        int sum =0;
        for(int value : arr){
            sum += value; // Cộng dồn
        }
        System.out.println("Tổng là :" + sum);
    }
}

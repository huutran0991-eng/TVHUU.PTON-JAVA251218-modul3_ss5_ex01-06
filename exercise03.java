import java.util.Scanner;

public class exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập dãy số :");
        int SIZE = scanner.nextInt();
        int[] arr = new int[SIZE];
        for(int i = 0; i < SIZE; i++) {
            System.out.print("Giá trị thứ " + (i +1) + ":");
            arr[i] = scanner.nextInt();
        }
        // Sắp xếp mảng bằng thuật toán nổi bọt
        int n = arr.length;
        boolean swapped; // Biến cờ hiệu (フラグ変数)
        for(int i = 0; i < n -1; i++){
            swapped = false; // RESET sao mỗi vòng lặp
            // Nghĩa là vòng lặp ban đầu sẽ là false cho đến khi nào nó tìm thấy đúng phần tử cần đổi thì mới chuyển sang true
            for(int j = 0; j < n - 1 - i; j++){
                if(arr[j] > arr[j+1]) // So sánh 2 phần tử liền kề nhau
                {
                    // Quy trình đổi vị trí cần 3 bước
                    int temp = arr[j]; // Lưu giá trị lớn tạm thời vào temp
                    arr[j] = arr[j+1]; // Đổi vị trí  nhỏ  ra phía trước
                    arr[j+1] = temp; // Gán lại giá trị lớn cho vị trí bị đổi để đưa giá trị lớn ra phía sau
                    swapped = true;
                }
            }
            //
            if(!swapped) break;
        }
        System.out.print("Mảng đã được sắp xếp theo thứ tự giảm dần :");
        for(int value : arr){
            System.out.print(value + " ");
        }
    }
}

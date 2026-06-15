import java.util.Scanner;

public class exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi văn bản: ");
        String text = scanner.nextLine();

        System.out.print("Nhập từ cần tìm: ");
        String target = scanner.nextLine();

        // 2. Tìm vị trí sử dụng phương thức indexOf()
        // indexOf trả về index đầu tiên tìm thấy, hoặc -1 nếu không có
        int index = text.indexOf(target);

        // 3. Xử lý kết quả
        if (index != -1) {
            System.out.println("Từ '" + target + "' xuất hiện tại vị trí (index): " + index);
        } else {
            System.out.println("Thông báo: Từ '" + target + "' không xuất hiện trong chuỗi.");
        }


    }
}

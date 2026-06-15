import java.util.Scanner;

public class exercise06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Yêu cầu người dùng nhập mật khẩu
        System.out.print("Nhập mật khẩu cần kiểm tra: ");
        String password = scanner.nextLine();

        // Giải thích mẫu Regex được trình bày chi tiết ở bảng bên dưới
        String passwordRegex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$!%]).{8,}$";

        // 3. Kiểm tra tính hợp lệ và xuất kết quả
        if (password.matches(passwordRegex)) {
            System.out.println("Mật khẩu hợp lệ");
        } else {
            System.out.println("Mật khẩu không hợp lệ");
        }

        scanner.close();
    }
}

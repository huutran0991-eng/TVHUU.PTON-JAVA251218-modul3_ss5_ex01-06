import java.util.Scanner;
import java.util.regex.Pattern;

public class exercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập địa chỉ email cần kiểm tra: ");

        String email = scanner.nextLine().trim();

        // ^[a-zA-Z0-9._]+ : Username (chữ cái, số, dấu chấm, gạch dưới)
        // @               : Ký tự @ bắt buộc
        // [a-zA-Z0-9.]+   : Domain (chữ cái, số, dấu chấm)
        // \\.[a-zA-Z]{2,6}$ : TLD (chỉ chữ cái, dài từ 2-6)
        String emailRegex = "^[a-zA-Z0-9._]+@[a-zA-Z0-9.]+\\.[a-zA-Z]{2,6}$";

        // Sử dụng Pattern để kiểm tra
        if (Pattern.matches(emailRegex, email)) {
            System.out.println("Email hợp lệ");
        } else {
            System.out.println("Email không hợp lệ");
        }

    }
}
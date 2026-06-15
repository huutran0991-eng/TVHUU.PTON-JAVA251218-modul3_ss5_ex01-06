import java.util.Scanner;

public class exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi văn bản: ");
        String input = scanner.nextLine();

        // 2. Thay thế tất cả số (0-9) bằng ký tự '*'
        // "\\d" đại diện cho một chữ số trong Regex
        String result = input.replaceAll("\\d", "*");

        System.out.println("Chuỗi sau khi thay thế: " + result);

    }
}

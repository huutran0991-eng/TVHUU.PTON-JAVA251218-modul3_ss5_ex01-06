public class exercise02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello, Java World!");
        System.out.println("Chuỗi ban đầu: " + sb.toString());

        // 2. Xóa các ký tự từ vị trí 5 đến 9
        sb.delete(5, 10); // Xóa ", Jav"
        System.out.println("Chuỗi sau khi xóa: " + sb.toString());

        // 3. Thay thế đoạn "World" bằng "Universe"
        // Tìm vị trí của "World" và thay thế
        int start = sb.indexOf("World");
        if (start != -1) {
            sb.replace(start, start + 5, "Universe");
        }
        System.out.println("Chuỗi sau khi thay thế: " + sb.toString());
    }
}

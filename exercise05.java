
public class exercise05 {
    public static void main(String[] args) {
        int iterations = 1_000_000;

        // 1. Đo thời gian với String
        long startTimeString = System.currentTimeMillis();
        String str = "Hello";
        for (int i = 0; i < iterations; i++) {
            str += " World";
        }
        long endTimeString = System.currentTimeMillis();

        // 2. Đo thời gian với StringBuilder
        long startTimeBuilder = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 0; i < iterations; i++) {
            sb.append(" World");
        }
        long endTimeBuilder = System.currentTimeMillis();

        // 3. Đo thời gian với StringBuffer
        long startTimeBuffer = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("Hello");
        for (int i = 0; i < iterations; i++) {
            sbf.append(" World");
        }
        long endTimeBuffer = System.currentTimeMillis();

        // IN KẾT QUẢ
        System.out.println("Thời gian thực hiện với String: " + (endTimeString - startTimeString) + " ms");
        System.out.println("Thời gian thực hiện với StringBuilder: " + (endTimeBuilder - startTimeBuilder) + " ms");
        System.out.println("Thời gian thực hiện với StringBuffer: " + (endTimeBuffer - startTimeBuffer) + " ms");

        System.out.println("\nNhận xét:");
        System.out.println("- String: Không hiệu quả cho phép nối chuỗi nhiều lần do tạo ra nhiều đối tượng mới.");
        System.out.println("- StringBuilder: Hiệu quả và nhanh chóng, thích hợp cho nhiều thao tác nối chuỗi trong một luồng.");
        System.out.println("- StringBuffer: Tương tự như StringBuilder nhưng an toàn với đa luồng, có thể chậm hơn một chút do đồng bộ hóa.");
    }
}

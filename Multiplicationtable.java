import java.util.Scanner; //Import รับค่าจากแป้นพิมพ์

public class Multiplicationtable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("แม่สูตรคูณ : ");
        int numbermultiply = scanner.nextInt(); // รับเลขจากผู้ใช้

        for (int i = 1; i <= 12; i++) {
            int sum = i * numbermultiply;
            System.out.println(numbermultiply + " * " + i + " : " + sum);

        }
        scanner.close(); // ปิด Scanner
    }
}

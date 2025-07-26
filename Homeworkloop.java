public class Homeworkloop {
    public static void main(String[] args) {
        for (int i = 5; i <= 15; i++) {
            System.out.println("Number : " + i);
        }

        int x = 0;
        int sum = 0;
        while (x <= 10) {
            sum += x;
            x += 2;
        }
        System.out.println("Total Sum : " + sum);
    }
}
/*
 * ✅ ใช้ for loop แสดงเลข 5 ถึง 15
 * 
 * ✅ ใช้ while loop แสดงเลขคู่ 2 ถึง 10
 * 
 * ✅ รวมเลขคู่ 2 + 4 + 6 + 8 + 10 แล้วแสดงผลรวม
 */
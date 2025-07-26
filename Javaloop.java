public class Javaloop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("ผมรวม : " + sum);
    }
}

/*
 * โจทย์:
 * 1. เขียนโปรแกรมแสดงเลข 1 ถึง 10 ด้วย for loop
 * 2. เขียนโปรแกรมรวมเลข 1 + 2 + ... + 10 แล้วแสดงผลรวม
 */
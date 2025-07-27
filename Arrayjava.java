public class Arrayjava {
    public static void main(String[] args) {
        int[] number = { 10, 20, 30, 40, 50 };
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            System.out.println("คนที่ " + (i + 1) + " คะแนน : " + number[i]);
            sum += number[i];
        }
        float ava = (float) sum / number.length;
        System.out.println("คะแนนรวม : " + sum);
        System.out.println("คะแนนเฉลี่ย : " + ava);
    }

}
/*
 * โจทย์ 1:
 * สร้าง array ที่เก็บคะแนนนักเรียน 5 คน แล้ว:
 * 
 * แสดงคะแนนทีละคน
 * 
 * หาคะแนนรวม
 * 
 * หาคะแนนเฉลี่ย
 */
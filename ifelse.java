public class ifelse {
    public static void main(String[] args){
    int score = 59;
    if (score >= 80){
        System.out.println("ยอดเยี่ยม");
    }else if(score >= 60){
        System.out.println("ผ่าน");
    }else{
        System.out.println("ต้องปรับปรุง");
    }
    }
}

/*
 สร้างตัวแปรชื่อ score แบบ int ใส่คะแนนลงไป

ตรวจสอบและแสดงผลลัพธ์:

มากกว่า 80 → “ยอดเยี่ยม”

60–80 → “ผ่าน”

ต่ำกว่า 60 → “ต้องปรับปรุง”
 */

public class ForLoop {
    public static void main(String[] args){
    // 3 ส่วน
    // ส่วนตัวแปรเริ่มต้น => ตัวนับรอบ
    // เงื่อนไข
    // การเพิ่มค่า / ลดค่า
    
    /*
        for(ตัวแปรเริ่มต้น;เงื่อนไข;การเพื่มค่า / ลดค่า){
        * คำสั่ง
    }
    */
      //  int count; ใช้ได้ทั่วไป
        for(int count=1;count<=10;count++){              // ใช้ได้เฉพาะใน forloop
            // คำสั่งที่จะทำซ้ำ
            // แบบเพิ่มค่า
            System.out.println("Hello World");            
        }
        
        for(int count=10;count>0;count--){              // ใช้ได้เฉพาะใน forloop
            // คำสั่งที่จะทำซ้ำ
            // แบบลดค่า
            System.out.println(count);            
        }
    }
}

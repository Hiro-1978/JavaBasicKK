
import java.util.Scanner;

public class InputTutorial {
    public static void main(String[] agrs){
        // รับค่าข้อมูล
        // ข้อมูลแบบไหน? ตัวเลข int, float, long, double
        // ข้อความเพื่อทำอะไร
        // ข้อความแบบตัวเลข => คำนวนได้ | คำนวนไม่ได้
        
        // การประกาศใช้งาน Class | new
        Scanner sc = new Scanner(System.in);
        // สร้างตัวแปรเพื่อเก็บค่าที่ป้อนเข้ามา
        System.out.print("Plese Enter You Name : ");
        String name = sc.nextLine(); // รับค่า String จากแป้นพิมพ์
        System.out.print("Year Of Birth : ");
        int year = sc.nextInt();     
        
        int age = 2021 - year; // คำนวนอายุ
        
        System.out.println("Hello : "+name);
        System.out.println("Year Of Birth : "+year);
        System.out.println("Age : "+age);
    }
}

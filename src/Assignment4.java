
import java.util.Scanner;
public class Assignment4 {
    // โปรแกรมแปลง พ.ศ. เป็น ค.ศ
    public static void main(String[] args){
       // รับค่า
       Scanner kb = new Scanner(System.in);
       System.out.print("กรณาป้อนตัวเลข พ.ศ. : ");
       int year = kb.nextInt();
       
       // ประมวลผล
       // 2563 - 543 => ค.ศ.
       // ค.ศ. + 543 => พ.ศ.
       int result = year-543;
       System.out.println("ปี พ.ศ. "+year+" แปลงเป็น ค.ศ. = " +result);
    }
}
    
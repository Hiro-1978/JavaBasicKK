
import java.util.Scanner;

public class InputNextLine {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Plese Enter You Name : ");
        String name1 = sc.nextLine(); // อ่านข้อความที่ รับค่า String จากแป้นพิมพ์ทั้งบรรทัด
        System.out.println("Hello : "+name1);
        /* -------------------------------------------------*/
        System.out.print("Plese Enter You Name : ");
        String name2 = sc.next(); // อ่านข้อความที่รับค่าเข้ามาแค่ถึงช่องว่างเท่านั้น   
        System.out.println("Hello : "+name2);
        
        /*
         Escape Character
            \n => ขึ้นบรรทัดใหม่
            \t => tab เว้นช่องว่าง
        */
    }
}

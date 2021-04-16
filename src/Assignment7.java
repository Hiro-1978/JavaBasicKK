
import java.text.DecimalFormat;
import java.util.Scanner;


public class Assignment7 {
    public static void main(String[] args){
       // โปรแกรมแปลงอุณหภูมิ
       Scanner kb = new Scanner(System.in);
       System.out.print("ป้อนอุณหภูมิ (ฟาเรนไฮน์): ");
       float f = kb.nextFloat();  
       DecimalFormat df = new DecimalFormat("#.##"); // ลดเหลือทศนิยม 2 ตำแหน่ง
       float c = (f-32)*5/9;
       System.out.println(f+" ฟาเรนไฮน์ = "+df.format(c)+" เซลเซียส");
    }
}

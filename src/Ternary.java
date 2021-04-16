
import java.util.Scanner;
public class Ternary {
        // การลดรูป if
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("กรณาป้อนค่าตัวเลขจำนวนเต็ม: ");
       int n = sc.nextInt();
       String result="";
       
       /*if(n%2==0){
           result=n+" เป็นเลขคู่ ";
       }else {
           result=n+" เป็นเลขคี่ ";
       }
       */
       
       // ตัวแปร = (เงื่อนไข) ? คำสั่งเมื่อเงื่อนไขเป็นจริง : คำสั่งเมื่อเงื่อนไขเป็นเท็จ;
       result = (n%2==0) ? n+" เป็นเลขคู่ " : n+" เป็นเลขคี่ ";
       System.out.println(result);
               
    }
}

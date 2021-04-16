
import java.util.Scanner;
public class Assignment3 {
    // โปรแกรมหาเลขคู่ / เลขคู่
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("กรณาป้อนค่าตัวเลขจำนวนเต็ม: ");
       int n = sc.nextInt();
       
       if(n%2==0){
           System.out.println(n+" เป็นเลขคู่ ");
       }else {
           System.out.println(n+" เป็นเลขคี่ ");
       }
    }
}
    
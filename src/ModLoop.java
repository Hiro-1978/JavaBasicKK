
import java.util.Scanner;
public class ModLoop {
    // โปรแกรมหาเลคู่-เลขคี่
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
            while(true){
            System.out.print("กรุณาป้อนตัวเลข : ");
            int number=kb.nextInt();// max = 100
            if(number<0)break;
        
            if(number%2==0){
            System.out.println("เลขคู่");
            }else{
            System.out.println("เลขคี่");
            }
        }
    }
}


import java.util.Scanner;


public class SummationLoop {
    // โปรแกรมหาผลรวมตัวเลข
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        int sum=0,count=0;
        while(true){
            System.out.print("ป้อนตัวเลขของคุณ (ลบคือจบโปรแกรม) = ");
            int number=kb.nextInt();
            if(number<0)break;
            count++;
            sum+=number;
        }
        System.out.println("ผลรวม = "+sum);
        System.out.println("ค่าเฉลี่ย = "+(sum/count));
    }
}

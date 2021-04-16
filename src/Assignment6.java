
import java.util.Scanner;
public class Assignment6 {
    /* โปรแกรมแลกธนบัตร
       ประกอบด้วย => 100, 500, 100, 50, 20
    
        เช่น
        ################
        2000 จะได้
        แบงค์ 1000 = 2 ใบ
        ################
        1500 จะได้
        แบงค์ 1000 = 1 ใบ
        แบงค์ 500  = 1 ใบ
        ################
    */
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("จำนวนเงินที่ต้องการแลก : ");
       int m = sc.nextInt();
       System.out.println("จำนวนเงินที่ป้อนเข้ามา : "+m+" บาท");
       
       if(m>=1000){
           // m/1000 = จำนวนแบงค์
           System.out.println("1000 บาท = "+(m/1000)+" ใบ");
           m%=1000;
       }
       if(m>=500){
           // m/500 = จำนวนแบงค์
           System.out.println("500 บาท = "+(m/500)+" ใบ");
           m%=500;
       }
       if(m>=100){
           // m/100 = จำนวนแบงค์
           System.out.println("100 บาท = "+(m/100)+" ใบ");
           m%=100;
       }
       if(m>=50){
           // m/50 = จำนวนแบงค์
           System.out.println("50 บาท = "+(m/50)+" ใบ");
           m%=50;
       }
       if(m>=20){
           System.out.println("20 บาท = "+(m/20)+" ใบ");
           m%=20;
           if((m%=20)!=0){// m/20 = จำนวนแบงค์
           System.out.println("เศษ = "+m+" บาท");
            }
       }    
       if(m>=10){
           System.out.println("10 บาท = "+(m/10)+" เหรียญ");
           m%=10;
           System.out.println("เศษ = "+m+" บาท");
        }
    }
}
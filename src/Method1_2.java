
import java.util.Scanner;


public class Method1_2 {
    // เมธอดรีเทิร์นค่า
    public static void main(String[] args){
        // โปรแกรมหลัก
        Scanner kb=new Scanner(System.in);
        System.out.print("ป้อนเงินเดือนของคุณ : ");
        double salary=kb.nextDouble();
        System.out.println("เงินเดือนของคุณคือ : "+salary);
        double bonus=getBonus();
        salary+=bonus;
        System.out.println("เงินเดือน+โบนัส : "+salary);
        System.out.println("ที่อยู่ : "+getMyAddress());
    }
    
    // เมธอดที่เรียกใช้งาน
    
    static double getBonus(){
        return 5000.0;
    }
    
    static String getMyAddress(){
        String city="ชลบุรี";
        return city;
    }
}

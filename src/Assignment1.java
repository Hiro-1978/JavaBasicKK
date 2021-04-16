import java.util.Scanner;
public class Assignment1 {
    // โปรแกรมคำนวนดัชนีมวลกาย
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("กรณาป้อนน้ำหนักตัวของท่าน (kg) : ");
       double w = sc.nextDouble();
       
       System.out.print("กรณาป้อนส่วนสูงของท่าน (m) : ");
       double h = sc.nextDouble();
       
       double bmi = w/(h*h);
       System.out.println("ค่าดัชนีมลกายของท่านเท่ากับ = "+bmi);
   } 
   
}

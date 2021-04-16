import java.text.DecimalFormat;
import java.util.Scanner;
public class Assignment5 {
    // โปรแกรมคำนวนเกรณ์ดัชนีมวลกาย
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("กรณาป้อนน้ำหนักตัวของท่าน (kg) : ");
       double w = sc.nextDouble();
       
       System.out.print("กรณาป้อนส่วนสูงของท่าน (m) : ");
       double h = sc.nextDouble();
       DecimalFormat df = new DecimalFormat("#.###"); // ลดเหลือทศนิยม 3 ตำแหน่ง
       double bmi = w/(h*h);
       System.out.println("น้ำหนักของท่านเท่ากับ = "+w);
       System.out.println("ส่วนสูงของท่านเท่ากับ = "+h);
       System.out.println("ค่าดัชนีมลกายของท่านเท่ากับ = "+df.format(bmi));
       String predict="";
       /*
            น้อยกว่า 18   = ต่ำกว่าเกรณ์ 
            18.5 - 22.9 = สมส่วน
            23.0 - 24.9 = น้ำหนักเกิน
            25.0 - 29.9 = โรคอ้วน
            มากกว่า 30   = โรคอ้วนระดับอันตราย            
       */
       if(bmi<=18){
           predict="ต่ำกว่าเกรณ์";
       }else if(bmi>=18.5 && bmi<=22.9){
           predict="สมส่วน";
       }else if(bmi>=23 && bmi<=24.9){
           predict="น้ำหนักเกิน";
       }else if(bmi>=25 && bmi<=29.9){
           predict="โรคอ้วน";
       }else{
           predict="โรคอ้วนระดับอันตราย";
       }
       
       System.out.println("เกรณ์ดัชนีมวลกายของท่านคือ : "+predict);
   } 
}
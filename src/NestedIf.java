
import java.util.Scanner;
public class NestedIf {
    public static void main(String[] args){
        // If ซ้อน If
       Scanner kb = new Scanner(System.in);
       System.out.print("ป้อนอายุของคุณ : ");
       int age = kb.nextInt();
       
       if(age<=15){
           
           if(age==15){
                System.out.println("ม.ต้น");
                System.out.println("ชั้น ม.3");
           }else if(age==14){
                System.out.println("ม.ต้น"); 
                System.out.println("ชั้น ม.2");
           }else if(age==13){
               System.out.println("ม.ต้น"); 
               System.out.println("ชั้น ม.1");
           }else{
                System.out.println("ประถมศึกษา");
           }
       }else{
          System.out.println("ม.ปลาย");
       }
    }
}


import java.util.Scanner;


public class SwitchCase {
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        
        System.out.print("กรุณาป้อนเลขเดือน = ");
        int month = kb.nextInt();
        String name="";
        switch (month){
            case 1:
                name = "มกราคม";
                break;
            case 2:
                name = "กุมภาพันธ์";
                break;
            case 3:
                name = "มีนาคม";
                break;
            case 4:
                name = "เมษายน";
                break;
            case 5:
                name = "พฤษภาคม";
                break;
            case 6:
                name = "มิถุนายน";
                break;
            case 7:
                name = "กรกฏาคม";
                break;
            case 8:
                name = "สิงหาคม";
                break;
            case 9:
                name = "กันยายน";
                break;
            case 10:
                name = "ตุลาคม";
                break;
            case 11:
                name = "พฤศจิกายน";
                break; 
            case 12:
                name = "ธันวาคม";
                break;   
            default:
                name = "ไม่มีชื่อเดือนนี้";
                break;  
        }
        System.out.println(month+" เท่ากับเดือน : "+name);
    }
}

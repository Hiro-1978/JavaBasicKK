
import java.util.Scanner;


public class AndOrNot {
    public static void main(String[] args){
       Scanner kb = new Scanner(System.in);
       System.out.print("ป้อนอายุของคุณ : ");
       int age = kb.nextInt();
       if(!(age==15)){ // ป้อนเลขอื่นจะเป็นวัยรุ่นหมด แม้กระทั่งต่ำกว่า 15 
           System.out.println("วัยรุ่น");
       }else{
           System.out.println("วัยเด็ก");
       }
       System.out.println("จบโปรแกรม");
    }
}

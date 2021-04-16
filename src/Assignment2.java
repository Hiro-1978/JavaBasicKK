import java.util.Scanner;
public class Assignment2 {
    // โปรแกรมเปรียบเทียบตัวเลข
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("กรณาป้อนค่าตัวเลขที่ 1 : ");
       int n1 = sc.nextInt();
       System.out.print("กรณาป้อนค่าตัวเลขที่ 2 : ");
       int n2 = sc.nextInt();
       
       if(n1>n2){
           System.out.println(n1+" มากกว่า "+n2);
       }else if(n1<n2){
           System.out.println(n1+" น้อยกว่า "+n2);
       }else {
           System.out.println(n1+" เท่ากับ "+n2);
       }
    }
}
